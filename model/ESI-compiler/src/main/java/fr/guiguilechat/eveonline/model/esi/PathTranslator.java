package fr.guiguilechat.eveonline.model.esi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.helger.jcodemodel.AbstractJClass;
import com.helger.jcodemodel.AbstractJType;
import com.helger.jcodemodel.IJExpression;
import com.helger.jcodemodel.JArray;
import com.helger.jcodemodel.JArrayClass;
import com.helger.jcodemodel.JBlock;
import com.helger.jcodemodel.JCodeModel;
import com.helger.jcodemodel.JDefinedClass;
import com.helger.jcodemodel.JExpr;
import com.helger.jcodemodel.JFieldVar;
import com.helger.jcodemodel.JInvocation;
import com.helger.jcodemodel.JLambda;
import com.helger.jcodemodel.JLambdaParam;
import com.helger.jcodemodel.JMethod;
import com.helger.jcodemodel.JMod;
import com.helger.jcodemodel.JPrimitiveType;
import com.helger.jcodemodel.JVar;

import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.ObservableMap;
import v2.io.swagger.models.ArrayModel;
import v2.io.swagger.models.Model;
import v2.io.swagger.models.Operation;
import v2.io.swagger.models.Response;
import v2.io.swagger.models.parameters.BodyParameter;
import v2.io.swagger.models.parameters.Parameter;
import v2.io.swagger.models.parameters.PathParameter;
import v2.io.swagger.models.parameters.QueryParameter;
import v2.io.swagger.models.properties.ArrayProperty;
import v2.io.swagger.models.properties.ObjectProperty;
import v2.io.swagger.models.properties.Property;

public class PathTranslator {

	private static final Logger logger = LoggerFactory.getLogger(PathTranslator.class);

	protected final Operation operation;
	protected final OpType optype;
	protected final String path;
	protected final ClassBridge bridge;

	protected final JCodeModel cm;

	public static enum OpType {
		get, post, put, delete;
	};

	protected String headerHandlerName = "headerHandler";

	public PathTranslator(Operation operation, OpType optype, String path, ClassBridge bridge) {
		this.operation = operation;
		this.optype = optype;
		this.path = path;
		this.bridge = bridge;
		cm = bridge.cm;

	}

	protected Response response;
	protected Property responseSchema;
	/**
	 * the type of resource produced by the http fetch. if the fetch actually
	 * produces an array, this is the item type of the array, eg int[] will
	 * resolve to int.
	 */
	protected AbstractJType resourceType;
	/**
	 * return type of the fetch method.
	 */
	protected AbstractJType fetchRetType;
	protected JMethod fetchMeth;

	protected List<String> requiredRoles;

	@SuppressWarnings("unchecked")
	public void apply() {
		if (operation == null) {
			return;
		}
		response = Compiler.getResponse(operation);
		if (response == null) {
			logger.error("can't find response for path " + path + " " + optype);
			return;
		}
		responseSchema = response.getSchema();

		// get the existing class for this response.
		fetchRetType = bridge.getReponseClass(responseSchema);
		if (fetchRetType instanceof JArrayClass) {
			resourceType = ((JArrayClass) fetchRetType).elementType();
		} else {
			resourceType = fetchRetType;
		}
		// create the method
		fetchMeth = bridge.swaggerClass.method(JMod.PUBLIC | JMod.DEFAULT, fetchRetType, operation.getOperationId());
		// add the parameters
		extractFetchParameters();

		requiredRoles = operation.getVendorExtensions().containsKey("x-required-roles")
				? (List<String>) operation.getVendorExtensions().get("x-required-roles")
						: Collections.emptyList();

				addPathJavadoc();

				headerParam = fetchMeth.param(bridge.headerhandlertype(), headerHandlerName);

				String urlAssign = "\"" + path + "\"";
				for (JVar jv : pathparameters) {
					urlAssign += ".replace(\"{" + jv.name() + "}\", \"\"+" + jv.name() + ")";
				}
				if (queryparameters.size() > 0) {
					urlAssign += "+\"?\"";
				}
				for (int pi = 0; pi < queryparameters.size(); pi++) {
					JVar qp = queryparameters.get(pi);
					if (qp.type() instanceof JPrimitiveType) {
						urlAssign += "+\"&" + qp.name() + "=\"+flatten(" + qp.name() + ")";
					} else {
						urlAssign += "+(" + qp.name() + "==null?\"\":\"&" + qp.name() + "=\"+flatten(" + qp.name() + "))";
					}
				}
				JVar url = fetchMeth.body().decl(cm.ref(String.class), "url");
				url.init(JExpr.direct(urlAssign));
				switch (optype) {
				case post:
				case put:
					String methName = optype == OpType.post ? "connectPost" : "connectPut";
					JVar content = null;
					if (!bodyparameters.isEmpty()) {
						content = fetchMeth.body().decl(cm.ref(Map.class).narrow(cm.ref(String.class)).narrow(cm.ref(Object.class)),
								"content");
						content.init(JExpr._new(cm.ref(HashMap.class).narrowEmpty()));
						for (JVar p : bodyparameters) {
							fetchMeth.body().directStatement("content.put(\"" + p.name() + "\", " + p.name() + ");");
						}
					}
					if (responseSchema == null) {
						fetchMeth.body().invoke(methName).arg(url)
						.arg(content == null ? cm.ref(Collections.class).staticInvoke("emptyMap") : content)
						.arg(JExpr.lit(connected)).arg(headerParam);
					} else {
						JVar fetched = fetchMeth.body().decl(cm.ref(String.class), "fetched");
						fetched.init(JExpr.invoke(methName).arg(url)
								.arg(content == null ? cm.ref(Collections.class).staticInvoke("emptyMap") : content)
								.arg(JExpr.lit(connected)).arg(headerParam));
					}
					break;
				case get:
					fetchMeth.body().directStatement(
							"String fetched=" + "connectGet(url," + Boolean.toString(connected) + ", " + headerHandlerName + ");");
					createCache();
					break;
				case delete:
					fetchMeth.body()
					.directStatement("connectDel(url," + Boolean.toString(connected) + ", " + headerHandlerName + ");");
					break;
				default:
					throw new UnsupportedOperationException("unsupported type " + optype + " for path " + path);
				}
				if (responseSchema != null) {
					fetchMeth.body()._return(
							JExpr.invoke("convert").arg(JExpr.direct("fetched")).arg(JExpr.direct(fetchRetType.binaryName() + ".class")));
				}
	}

	////
	// parameters management for the fetch method
	////

	/**
	 * path parameter that are passed as argument
	 */
	private List<JVar> pathparameters = new ArrayList<>();

	/**
	 * queryparameter that are passed as arguments
	 */
	private List<JVar> queryparameters = new ArrayList<>();

	/**
	 * body parameters that are passed as arguments
	 */
	private List<JVar> bodyparameters = new ArrayList<>();

	private List<JVar> allParams = new ArrayList<>();

	/** true iff the path requires connection */
	private boolean connected;

	/** argument of the fetch method for the header handler */
	JVar headerParam;

	/**
	 * extract the parameters from an operation and put them in corresponding
	 * list. also add javadoc on the method for those parameters.
	 */
	protected void extractFetchParameters() {
		connected = false;
		for (Parameter p : operation.getParameters()) {
			switch (p.getName()) {
			case "token":
				connected = true;
				break;
				// we skip following parameters
			case "user_agent":
			case "X-User-Agent":
			case "datasource":
			case "If-None-Match":
			case "Accept-Language":
			case "language":
				// case "page":
				break;
			default:
				String in = p.getIn();
				AbstractJType pt;
				JVar param;
				switch (in) {
				case "path":
					fetchMeth.javadoc().addParam(p.getName()).add(p.getDescription());
					PathParameter pp = (PathParameter) p;
					pt = bridge.getExistingClass(pp.getType(), pp.getName(), pp.getFormat(), pp.getEnum());
					if (!pp.getRequired() && pt.isPrimitive()) {
						pt = pt.boxify();
					}
					param = fetchMeth.param(pt, pp.getName());
					pathparameters.add(param);
					allParams.add(param);
					break;
				case "query":
					fetchMeth.javadoc().addParam(p.getName()).add(p.getDescription());
					QueryParameter qp = (QueryParameter) p;
					param = fetchMeth.param(bridge.getExistingClass(qp), qp.getName());
					queryparameters.add(param);
					allParams.add(param);
					break;
				case "body":
					BodyParameter bp = (BodyParameter) p;
					Model schema = bp.getSchema();
					if (schema instanceof ArrayModel) {
						fetchMeth.javadoc().addParam(p.getName()).add(p.getDescription());
						pt = bridge.getExistingClass((ArrayModel) schema);
						param = fetchMeth.param(pt, bp.getName());
						bodyparameters.add(param);
						allParams.add(param);
					} else {
						for (Entry<String, Property> e : schema.getProperties().entrySet()) {
							fetchMeth.javadoc().addParam(e.getKey()).add(e.getValue().getDescription());
							AbstractJType type = bridge.translateToClass(e.getValue(), bridge.structurePackage, e.getKey());
							param = fetchMeth.param(type, e.getKey());
							bodyparameters.add(param);
							allParams.add(param);
						}
					}
					break;
				default:
					logger.error("no matching type " + p.getIn() + " for parameter " + p.getName() + " in operation "
							+ operation.getOperationId());
				}
			}
		}
	}

	protected void addPathJavadoc() {
		fetchMeth.javadoc().append("" + operation.getSummary());
		fetchMeth.javadoc().add(("\n<p>\n" + ("" + operation.getDescription()).replaceAll("---", "<br />") + "\n</p>")
				.replaceAll("\n\n", "\n").replaceAll("<br />\n<", "<").replaceAll("\n<br />\n", "<br />\n"));
		if (!requiredRoles.isEmpty()) {
			if (!requiredRoles.isEmpty()) {
				JFieldVar rolesfield = bridge.swaggerClass.field(JMod.PUBLIC | JMod.STATIC | JMod.FINAL,
						cm.ref(String.class).array(), (operation.getOperationId() + "_roles").toUpperCase());
				JArray array = JExpr.newArray(cm.ref(String.class));
				for (String role : requiredRoles) {
					array.add(JExpr.lit(role));
				}
				rolesfield.init(array);
				rolesfield.javadoc().add("the roles required for {@link #" + fetchMeth.name() + " this method}");
				fetchMeth.javadoc().add("\n<p>\nrequire the roles specified {@link #" + rolesfield.name() + " here}\n</p>");
			}
		}
	}

	////
	// creation of cache method based on fetch method
	////

	protected JDefinedClass cacheGroup;

	protected List<JVar> cacheParams = new ArrayList<>();

	protected AbstractJType cacheRetType;

	protected JMethod cacheMeth;

	/**
	 * how to handle the result of the fetch method in the cache method :
	 * Container puts in it a property, list put all the results in an observable
	 * list, and map puts the results in a map , with the key being specified by
	 * {@link #cacheRetUniqueField}
	 */
	protected static enum RETURNTYPE {
		CONTAINER, LIST, MAP
	}

	protected RETURNTYPE cacheRetTransform;

	protected AbstractJType cacheKeyType;

	protected void createCache() {
		String fieldName = operation.getOperationId().split("_")[1];
		cacheGroup = bridge.getCacheGroupClass(fieldName);

		// first we need to know the result.
		if (responseSchema.getType().equals(ArrayProperty.TYPE)) {
			findCacheRetUniqueField();
			if (cacheRetUniqueField != null) {
				cacheRetType = cm.ref(ObservableMap.class).narrow(cacheRetUniqueField.type().boxify(), resourceType.boxify());
				cacheRetTransform = RETURNTYPE.MAP;
			} else {
				cacheRetType = cm.ref(ObservableList.class).narrow(resourceType.boxify());
				cacheRetTransform = RETURNTYPE.LIST;
			}
		} else {
			cacheRetType = cm.ref(javafx.beans.property.Property.class).narrow(resourceType.boxify());
			cacheRetTransform = RETURNTYPE.CONTAINER;
		}

		cacheMeth = cacheGroup.method(JMod.PUBLIC, cacheRetType, operation.getOperationId());
		cacheMeth.javadoc().addTag("see").add(fetchMeth.name());

		// after that we need to know the parameters

		for (JVar v : allParams) {
			if (!v.name().equals(headerHandlerName) && !v.name().equals("page")) {
				cacheParams.add(cacheMeth.param(v.type(), v.name()));
			}
		}

		switch (cacheParams.size()) {
		case 0:
			cacheKeyType = null;
			switch (cacheRetTransform) {
			case CONTAINER:
				createCache_NoParam_Container();
				break;
			case LIST:
				createCache_NoParam_List();
				break;
			case MAP:
				createCache_NoParam_Map();
				break;
			default:
				throw new UnsupportedOperationException("handle case " + cacheRetTransform);
			}
			break;
		case 1:
			cacheKeyType = cacheParams.get(0).type().boxify();
			switch (cacheRetTransform) {
			case CONTAINER:
				createCache_SingleParam_Container();
				break;
			case LIST:
				createCache_SingleParam_List();
				break;
			case MAP:
				createCache_SingleParam_Map();
				break;
			default:
				throw new UnsupportedOperationException("handle case " + cacheRetTransform);
			}
			break;
		default:
			cacheKeyType = makeKeyParam(cacheParams);
			createCacheComplexMap();
		}
	}

	/**
	 * if the returned type of fetch is an array, the field of the subtype that
	 * should be used as key for the cache return map. Null if returns is not an
	 * array, or if 0 ore more than one fields are designated to be unique.
	 */
	protected JFieldVar cacheRetUniqueField = null;

	/** find out the correct field to identify a result of the fetch */
	protected void findCacheRetUniqueField() {
		List<String> uniqueFields = new ArrayList<>();
		// we only have fields for reponses that are of type Object[], eg int[]
		// can't have a unique field, nor Object[][]
		ArrayProperty ap = (ArrayProperty) responseSchema;
		if (ap.getItems().getType().equals(ObjectProperty.TYPE)) {
			ObjectProperty op = (ObjectProperty) ap.getItems();
			for (Entry<String, Property> esp : op.getProperties().entrySet()) {
				if (esp.getValue().getDescription().toLowerCase().startsWith("unique ")) {
					uniqueFields.add(esp.getKey());
					// System.err.println("accepted description " +
					// esp.getValue().getDescription());
				}
			}
		}
		if (uniqueFields.size() == 1) {
			String name = uniqueFields.get(0);
			AbstractJType fetchSub = ((JArrayClass) fetchRetType).elementType();
			if (fetchSub instanceof JDefinedClass) {
				cacheRetUniqueField = ((JDefinedClass) fetchSub).fields().get(name);
			} else {
				logger.error("can't manage type " + fetchSub);
			}
		}
		if (uniqueFields.size() > 0) {
			// System.err.println("path " + path + " response unique=" +
			// uniqueFields);
		}
	}

	protected AbstractJType makeKeyParam(List<JVar> cacheParams2) {
		JDefinedClass ret = bridge
				.getCacheKeyClass(cacheParams2.stream().collect(Collectors.toMap(JVar::name, JVar::type)));
		ret.javadoc().append("@see " + path + "\n");
		return ret;
	}

	/**
	 * create the cache body when cache has no parameter and the fetch method
	 * returns an object
	 */
	protected void createCache_NoParam_Container() {
		JFieldVar container = cacheGroup.field(JMod.PRIVATE,
				cm.ref(SimpleObjectProperty.class).narrow(resourceType.boxify()),
				cacheMeth.name() + "_holder");
		JBlock instanceBlock = cacheMeth.body()._if(container.eqNull())._then().synchronizedBlock(JExpr._this()).body()
				._if(container.eqNull())._then();
		instanceBlock.assign(container, JExpr._new(cm.ref(SimpleObjectProperty.class).narrowEmpty()));

		JVar finalcontainer = instanceBlock.decl(container.type(), "finalContainer").init(container);
		JInvocation invoke = instanceBlock.invoke(bridge.methFetchCacheObject()).arg(operation.getOperationId());
		invoke.arg(JExpr.direct("m->swagger." + fetchMeth.name() + "(m)"));
		JLambda lambdaset = new JLambda();
		JLambdaParam item = lambdaset.addParam("item");
		lambdaset.body().synchronizedBlock(finalcontainer).body().invoke(finalcontainer, "set").arg(item);
		invoke.arg(lambdaset);
		if (!requiredRoles.isEmpty()) {
			JArray array = JExpr.newArray(cm.ref(String.class));
			for (String s : requiredRoles) {
				array.add(JExpr.lit(s));
			}
			invoke.arg(array);
		}
		cacheMeth.body()._return(container);
	}

	/**
	 * create the cache body when no parameter and the fetch method returns a list
	 * of items with no unique field.
	 */
	protected void createCache_NoParam_List() {
		JFieldVar container = cacheGroup.field(JMod.PRIVATE, cacheRetType, cacheMeth.name() + "_holder");
		JBlock instanceBlock = cacheMeth.body()._if(container.eqNull())._then().synchronizedBlock(JExpr._this()).body()
				._if(container.eqNull())._then();
		// _holder = FXCollections.observableArrayList();
		JVar finalContainer = instanceBlock.decl(container.type(), "finalContainer")
				.init(cm.ref(FXCollections.class).staticInvoke("observableArrayList"));
		instanceBlock.assign(container, finalContainer);
		JInvocation invoke = instanceBlock.invoke(bridge.methFetchCacheArray()).arg(operation.getOperationId());

		invoke.arg(lambdaFetch());

		JLambda lambdaSet = new JLambda();
		JLambdaParam arr = lambdaSet.addParam("arr");
		lambdaSet.body().synchronizedBlock(finalContainer).body().invoke(finalContainer, "setAll").arg(arr);
		invoke.arg(lambdaSet);
		if (!requiredRoles.isEmpty()) {
			JArray array = JExpr.newArray(cm.ref(String.class));
			for (String s : requiredRoles) {
				array.add(JExpr.lit(s));
			}
			invoke.arg(array);
		}
		cacheMeth.body()._return(container);
	}

	protected JLambda lambdaFetch(JVar... params) {
		JLambda lambdaFetch = new JLambda();
		JLambdaParam page = lambdaFetch.addParam("page");
		JLambdaParam head = lambdaFetch.addParam("headerHandler");
		Map<String, IJExpression> paramsByName = new HashMap<>();
		paramsByName.put(page.name(), page);
		paramsByName.put(head.name(), head);
		for(JVar p : params) {
			paramsByName.put(p.name(), p);
		}
		JInvocation callmeth = JExpr.direct("swagger").invoke(fetchMeth);
		for (JVar v : fetchMeth.params()) {
			// System.err.println("getting arg " + v.name() + " from " +
			// paramsByName);
			callmeth.arg(paramsByName.get(v.name()));
		}
		if (resourceType.isPrimitive()) {
			IJExpression convert, toArr;
			AbstractJClass streamType;
			if (resourceType == cm.INT) {
				convert = JExpr.direct("Integer::valueOf");
				toArr = JExpr.direct("Integer[]::new");
				streamType = cm.ref(IntStream.class);
			} else if (resourceType == cm.LONG) {
				convert = JExpr.direct("Long::valueOf");
				toArr = JExpr.direct("Long[]::new");
				streamType = cm.ref(LongStream.class);
			} else {
				throw new UnsupportedOperationException("handle type " + resourceType);
			}
			callmeth = streamType.staticInvoke("of").arg(callmeth).invoke("mapToObj").arg(convert)
					.invoke("toArray").arg(toArr);
		}
		lambdaFetch.body().add(callmeth);
		return lambdaFetch;
	}

	protected void createCache_NoParam_Map() {
		JFieldVar container = cacheGroup.field(JMod.PRIVATE, cacheRetType, cacheMeth.name() + "_holder");
		JBlock instanceBlock = cacheMeth.body()._if(container.eqNull())._then().synchronizedBlock(JExpr._this()).body()
				._if(container.eqNull())._then();
		// _holder = FXCollections.observableHashMap();
		instanceBlock.assign(container, cm.ref(FXCollections.class).staticInvoke("observableHashMap"));
		JVar finalContainer = instanceBlock.decl(container.type(), "finalContainer").init(container);
		JInvocation invoke = instanceBlock.invoke(bridge.methFetchCacheArray()).arg(operation.getOperationId());

		invoke.arg(lambdaFetch());

		JLambda lambdaSet = new JLambda();
		JLambdaParam arr = lambdaSet.addParam("arr");
		JBlock setBody = lambdaSet.body().synchronizedBlock(finalContainer).body();
		// linkedhashmap<key, resource> newmap = new linkedhashmap<>();
		JVar newmap = setBody.decl(cm.ref(LinkedHashMap.class).narrow(cacheRetUniqueField.type()).narrow(resourceType), "newmap")
				.init(JExpr._new(cm.ref(LinkedHashMap.class).narrowEmpty()));
		// for (val : arr) newmap.put(val.unique, val)
		setBody.forEach(resourceType, "val", arr).body().invoke(newmap, "put")
		.arg(JExpr.direct("val." + cacheRetUniqueField.name())).arg(JExpr.direct("val"));
		// container.entrySet().retainAll(newMap.entrySet())
		setBody.invoke(finalContainer, "entrySet").invoke("retainAll").arg(newmap.invoke("entrySet"));
		// container.putAll(newmap)
		setBody.invoke(finalContainer, "putAll").arg(newmap);
		invoke.arg(lambdaSet);

		if (!requiredRoles.isEmpty()) {
			JArray array = JExpr.newArray(cm.ref(String.class));
			for (String s : requiredRoles) {
				array.add(JExpr.lit(s));
			}
			invoke.arg(array);
		}

		cacheMeth.body()._return(container);
	}

	/**
	 * Create the cache body when only one parameter and return a container of
	 * resourcetype.<br />
	 * Typically produces a map<cachekey, cacheret>
	 */
	protected void createCache_SingleParam_Container() {
		JVar container = cacheGroup.field(JMod.PRIVATE | JMod.FINAL,
				cm.ref(Map.class).narrow(cacheKeyType).narrow(cacheRetType), cacheMeth.name() + "_holder")
				.init(JExpr._new(cm.ref(HashMap.class).narrowEmpty()));
		JVar arg = cacheParams.get(0);
		JVar ret = cacheMeth.body().decl(cacheRetType, "ret").init(container.invoke("get").arg(arg));
		JBlock instanceBlock = cacheMeth.body()._if(ret.eqNull())._then().synchronizedBlock(container).body()
				.add(JExpr.assign(ret, container.invoke("get").arg(arg)))._if(ret.eqNull())._then();

		JVar finalret = instanceBlock.decl(cm.ref(SimpleObjectProperty.class).narrow(resourceType), "finalret").init(JExpr._new(cm.ref(SimpleObjectProperty.class).narrowEmpty()));
		instanceBlock.assign(ret, finalret);
		JInvocation invoke = instanceBlock.invoke(bridge.methFetchCacheObject()).arg(operation.getOperationId());
		invoke.arg(JExpr.direct("h->swagger." + fetchMeth.name() + "(" + arg.name() + ",h)"));
		JLambda lambdaset = new JLambda();
		JLambdaParam item = lambdaset.addParam("item");
		lambdaset.body().synchronizedBlock(finalret).body().invoke(finalret, "set").arg(item);
		invoke.arg(lambdaset);
		if (!requiredRoles.isEmpty()) {
			JArray array = JExpr.newArray(cm.ref(String.class));
			for (String s : requiredRoles) {
				array.add(JExpr.lit(s));
			}
			invoke.arg(array);
		}

		cacheMeth.body()._return(ret);
	}

	/**
	 * create the cache body when only one parameter.
	 */
	protected void createCache_SingleParam_List() {
		JVar container = cacheGroup.field(JMod.PRIVATE | JMod.FINAL,
				cm.ref(Map.class).narrow(cacheKeyType).narrow(cacheRetType), cacheMeth.name() + "_holder")
				.init(JExpr._new(cm.ref(HashMap.class).narrowEmpty()));
		JVar arg = cacheParams.get(0);
		JVar ret = cacheMeth.body().decl(cacheRetType, "ret").init(container.invoke("get").arg(arg));
		JBlock instanceBlock = cacheMeth.body()._if(ret.eqNull())._then().synchronizedBlock(container).body()
				.add(JExpr.assign(ret, container.invoke("get").arg(arg)))._if(ret.eqNull())._then();
		JVar finalRet = instanceBlock.decl(cacheRetType, "finalret")
				.init(cm.ref(FXCollections.class).staticInvoke("observableArrayList"));
		instanceBlock.assign(ret, finalRet);
		container.invoke("put").arg(arg).arg(ret);
		JInvocation invoke = instanceBlock.invoke(bridge.methFetchCacheArray()).arg(operation.getOperationId());

		invoke.arg(lambdaFetch(arg));

		JLambda lambdaSet = new JLambda();
		JLambdaParam arr = lambdaSet.addParam("arr");
		lambdaSet.body().synchronizedBlock(finalRet).body().invoke(finalRet, "setAll").arg(arr);
		invoke.arg(lambdaSet);
		if (!requiredRoles.isEmpty()) {
			JArray array = JExpr.newArray(cm.ref(String.class));
			for (String s : requiredRoles) {
				array.add(JExpr.lit(s));
			}
			invoke.arg(array);
		}
		cacheMeth.body()._return(ret);
	}

	/**
	 * create the cache body when only one parameter and returns an array of
	 * resources with a unique field, so a map of this field to the resources.
	 */
	protected void createCache_SingleParam_Map() {
		JVar container = cacheGroup.field(JMod.PRIVATE | JMod.FINAL,
				cm.ref(Map.class).narrow(cacheKeyType).narrow(cacheRetType), cacheMeth.name() + "_holder")
				.init(JExpr._new(cm.ref(HashMap.class).narrowEmpty()));
		JVar arg = cacheParams.get(0);
		JVar ret = cacheMeth.body().decl(cacheRetType, "ret").init(container.invoke("get").arg(arg));
		JBlock instanceBlock = cacheMeth.body()._if(ret.eqNull())._then().synchronizedBlock(container).body()
				.add(JExpr.assign(ret, container.invoke("get").arg(arg)))._if(ret.eqNull())._then();
		JVar finalRet = instanceBlock.decl(cacheRetType, "finalret")
				.init(cm.ref(FXCollections.class).staticInvoke("observableHashMap"));
		instanceBlock.assign(ret, finalRet);
		container.invoke("put").arg(arg).arg(ret);
		JInvocation invoke = instanceBlock.invoke(bridge.methFetchCacheArray()).arg(operation.getOperationId());

		invoke.arg(lambdaFetch(arg));

		JLambda lambdaSet = new JLambda();
		JLambdaParam arr = lambdaSet.addParam("arr");
		JBlock setBody = lambdaSet.body().synchronizedBlock(finalRet).body();
		// linkedhashmap<key, resource> newmap = new linkedhashmap<>();
		JVar newmap = setBody
				.decl(cm.ref(LinkedHashMap.class).narrow(cacheRetUniqueField.type()).narrow(resourceType), "newmap")
				.init(JExpr._new(cm.ref(LinkedHashMap.class).narrowEmpty()));
		// for (val : arr) newmap.put(val.unique, val)
		setBody.forEach(resourceType, "val", arr).body().invoke(newmap, "put")
		.arg(JExpr.direct("val." + cacheRetUniqueField.name())).arg(JExpr.direct("val"));
		// container.entrySet().retainAll(newMap.entrySet())
		setBody.invoke(finalRet, "entrySet").invoke("retainAll").arg(newmap.invoke("entrySet"));
		// container.putAll(newmap)
		setBody.invoke(finalRet, "putAll").arg(newmap);
		invoke.arg(lambdaSet);
		if (!requiredRoles.isEmpty()) {
			JArray array = JExpr.newArray(cm.ref(String.class));
			for (String s : requiredRoles) {
				array.add(JExpr.lit(s));
			}
			invoke.arg(array);
		}
		cacheMeth.body()._return(ret);
	}

	/** create the cache body when several parameter */
	protected void createCacheComplexMap() {
		// TODO
		cacheMeth.body().addSingleLineComment("TODO ");
		cacheMeth.body()._throw(JExpr._new(cm.ref(UnsupportedOperationException.class)));
	}

	// code to remove later
	protected void createCacheObject(Operation operation, JMethod meth, AbstractJType retType, List<String> requiredRoles,
			JDefinedClass cacheGroup) {
		JVar container = cacheGroup.field(JMod.PRIVATE, cm.ref(SimpleObjectProperty.class).narrow(retType),
				operation.getOperationId() + "_container").init(JExpr._null());
		JMethod retrieveMeth = cacheGroup.method(JMod.PUBLIC, cm.ref(javafx.beans.property.Property.class).narrow(retType),
				operation.getOperationId());
		JBlock instanceBlock = retrieveMeth.body()._if(container.eqNull())._then().synchronizedBlock(JExpr._this()).body()
				._if(container.eqNull())._then();
		instanceBlock.assign(container, JExpr._new(cm.ref(SimpleObjectProperty.class).narrowEmpty()));
		JInvocation invoke = instanceBlock.invoke(bridge.methFetchCacheObject()).arg(operation.getOperationId());
		invoke.arg(JExpr.direct("m->swagger." + meth.name() + "(m)"));
		invoke.arg(JExpr.direct(container.name() + "::set"));
		if (!requiredRoles.isEmpty()) {
			JArray array = JExpr.newArray(cm.ref(String.class));
			for (String s : requiredRoles) {
				array.add(JExpr.lit(s));
			}
			invoke.arg(array);
		}
		retrieveMeth.body()._return(container);
	}

	// code to remove later.
	protected void createCacheObject(Operation operation, JMethod meth, AbstractJType retType, List<String> requiredRoles,
			JDefinedClass containerClass, JVar parameter) {
		AbstractJClass mapKeyType = parameter.type().boxify();
		JVar container = containerClass.field(JMod.PRIVATE,
				cm.ref(HashMap.class).narrow(mapKeyType, cm.ref(SimpleObjectProperty.class).narrow(retType)),
				operation.getOperationId() + "_container").init(JExpr._new(cm.ref(HashMap.class).narrowEmpty()));
		JMethod retrieveMeth = containerClass.method(JMod.PUBLIC,
				cm.ref(javafx.beans.property.Property.class).narrow(retType), operation.getOperationId());
		JVar param = retrieveMeth.param(parameter.type(), parameter.name());
		JVar holder = retrieveMeth.body().decl(cm.ref(SimpleObjectProperty.class).narrow(retType), "holder");
		holder.init(container.invoke("get").arg(param));
		JBlock instanceBlock = retrieveMeth.body()._if(holder.eqNull())._then().synchronizedBlock(container).body()
				.assign(holder, container.invoke("get").arg(param))._if(holder.eqNull())._then();
		instanceBlock.assign(holder, JExpr._new(cm.ref(SimpleObjectProperty.class).narrowEmpty()));
		instanceBlock.invoke(container, "put").arg(param).arg(holder);
		JVar holder2 = instanceBlock.decl(cm.ref(SimpleObjectProperty.class).narrow(retType), "holderf").init(holder);
		JInvocation invoke = instanceBlock.invoke(bridge.methFetchCacheObject()).arg(operation.getOperationId());
		invoke.arg(JExpr.direct("header->swagger." + meth.name() + "(" + param.name() + ", header)"));
		invoke.arg(JExpr.direct("o-> {synchronized(" + holder2.name() + "){" + holder2.name() + ".set(o);}}"));
		if (!requiredRoles.isEmpty()) {
			JArray array = JExpr.newArray(cm.ref(String.class));
			for (String s : requiredRoles) {
				array.add(JExpr.lit(s));
			}
			invoke.arg(array);
		}
		retrieveMeth.body()._return(holder);
	}
}
