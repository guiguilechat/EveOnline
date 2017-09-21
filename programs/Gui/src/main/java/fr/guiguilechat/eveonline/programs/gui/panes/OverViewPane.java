package fr.guiguilechat.eveonline.programs.gui.panes;

import java.util.Date;
import java.util.LinkedHashSet;

import fr.guiguilechat.eveonline.database.apiv2.APIRoot;
import fr.guiguilechat.eveonline.database.apiv2.Account.Character;
import fr.guiguilechat.eveonline.database.apiv2.Char;
import fr.guiguilechat.eveonline.database.apiv2.Char.JobEntry;
import fr.guiguilechat.eveonline.programs.gui.Manager;
import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.SortType;
import javafx.scene.control.TableRow;
import javafx.scene.control.TableView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 * an overview pane contains a table of eventdata.
 */
public class OverViewPane extends VBox implements EvePane {

	protected Manager parent;

	@Override
	public Manager parent() {
		return parent;
	}

	protected SelectTeamPane selectTeamPane;
	protected CheckBox showJobBox;
	protected CheckBox showProvisionsBox;

	protected EvePane[] children;

	@Override
	public EvePane[] subEvePanes() {
		return children;
	}

	public static class EventData {
		public Date time;
		public String type;
		public String description;
		public String where;
		public String who;

		@Override
		public int hashCode() {
			return time.hashCode() + type.hashCode() + description.hashCode() + where.hashCode() + who.hashCode();
		}

		@Override
		public boolean equals(Object obj) {
			if (obj == null) {
				return false;
			}
			if (obj == this) {
				return true;
			}
			if (obj.getClass() != EventData.class) {
				return false;
			}
			EventData o = (EventData) obj;
			return time.equals(o.time) && type.equals(o.type) && description.equals(o.description) && where.equals(o.where)
					&& who.equals(o.who);
		}

		public boolean isIndustryJob() {
			return Char.activityNamesSet.contains(type);
		}
	}

	TableView<EventData> tvEvents = new TableView<>();

	protected boolean showJobs = false;

	protected boolean showProvisions = false;

	public OverViewPane(Manager parent) {
		this.parent = parent;
		HBox menubox = new HBox(10.0);
		selectTeamPane = new SelectTeamPane(parent);
		showJobBox = new CheckBox("show jobs");
		showJobBox.setAllowIndeterminate(false);
		showJobBox.setOnAction(e -> changeShowBox());
		showProvisionsBox = new CheckBox("show provisions");
		showProvisionsBox.setAllowIndeterminate(false);
		showProvisionsBox.setOnAction(e -> changeShowProvision());
		menubox.getChildren().addAll(selectTeamPane, new Label(" "), showJobBox, new Label(" "), showProvisionsBox);
		children = new EvePane[] { selectTeamPane };
		getChildren().addAll(menubox, tvEvents);

		TableColumn<EventData, Date> dateCol = new TableColumn<>("time");
		dateCol.setCellValueFactory(ed -> new ReadOnlyObjectWrapper<>(ed.getValue().time));
		dateCol.setSortable(true);
		dateCol.setSortType(SortType.ASCENDING);
		tvEvents.getColumns().add(dateCol);

		TableColumn<EventData, String> typeCol = new TableColumn<>("type");
		typeCol.setCellValueFactory(ed -> new ReadOnlyObjectWrapper<>(ed.getValue().type));
		tvEvents.getColumns().add(typeCol);
		TableColumn<EventData, String> desCol = new TableColumn<>("description");
		desCol.setCellValueFactory(ed -> new ReadOnlyObjectWrapper<>(ed.getValue().description));
		tvEvents.getColumns().add(desCol);
		TableColumn<EventData, String> whereCol = new TableColumn<>("where");
		whereCol.setCellValueFactory(ed -> new ReadOnlyObjectWrapper<>(ed.getValue().where));
		tvEvents.getColumns().add(whereCol);
		TableColumn<EventData, String> whoCol = new TableColumn<>("who");
		whoCol.setCellValueFactory(ed -> new ReadOnlyObjectWrapper<>(ed.getValue().who));
		tvEvents.getColumns().add(whoCol);
		tvEvents.getSortOrder().add(dateCol);

		tvEvents.setRowFactory(tv -> new TableRow<EventData>() {
			@Override
			public void updateItem(EventData item, boolean empty) {
				super.updateItem(item, empty);
				if (item == null) {
					setStyle("");
				} else if (item.time.getTime() <= System.currentTimeMillis()) {
					setStyle("-fx-background-color: palegreen;");
				} else {
					setStyle("");
				}
			}
		});
	}

	@Override
	public void onNewAPI(int key, String code) {
		checkAPI(key);
	}

	@Override
	public void onDelAPI(int key) {
		APIRoot api = parent.getAPI(key);
		if (api == null) {
			debug("can't find apiroot for id " + key);
			return;
		}
		for (Character c : api.account.characters()) {
			delCharInfo(c);
		}
	}

	public void checkAPI(int key) {
		APIRoot api = parent.getAPI(key);
		if (api == null) {
			debug("can't find apiroot for id " + key);
			return;
		}
		for (Character c : api.account.characters()) {
			delCharInfo(c);
			if (parent.getTeamCharacters().contains(c.name)) {
				addCharInfo(c, api);
			}
		}
		tvEvents.sort();
	}

	protected void delCharInfo(Character c) {
		tvEvents.getItems().removeIf(ev -> ev.who.equals(c.name));
	}

	protected void addCharInfo(Character c, APIRoot api) {
		if (showJobs) {
			addCharJobs(c, api);
		}
	}

	protected void addCharJobs(Character c, APIRoot api) {
		for (JobEntry e : api.chars.industryJobs(c.characterID)) {
			EventData ed = new EventData();
			ed.time = e.endDate;
			ed.type = Char.activityName(e.activityID);
			ed.description = e.blueprintTypeName;
			ed.where = e.solarSystemName;
			ed.who = c.name;
			tvEvents.getItems().add(ed);
		}
	}

	protected void addTeamProvisions() {

	}

	@Override
	public void onFocusedTeam(String teamName) {
		tvEvents.getItems().clear();
		LinkedHashSet<String> allowed = parent.getTeamCharacters();
		for (APIRoot api : parent.apis) {
			for (Character c : api.account.characters()) {
				if (allowed.contains(c.name)) {
					addCharInfo(c, api);
				}
			}
		}
		tvEvents.sort();
	}

	protected void changeShowBox() {
		if (showJobBox.isSelected()) {
			showJobs = true;
			for (APIRoot api : parent().apis) {
				for (Character c : api.account.characters()) {
					if (parent.getTeamCharacters().contains(c.name)) {
						addCharJobs(c, api);
					}
				}
			}
			tvEvents.sort();
		} else {
			showJobs = false;
			tvEvents.getItems().removeIf(EventData::isIndustryJob);
		}
	}

	protected void changeShowProvision() {
		if (showProvisionsBox.isSelected()) {
			showProvisions = true;
			addTeamProvisions();
			tvEvents.sort();
		} else {
			showProvisions = false;
			tvEvents.getItems().removeIf(ed -> ed.type.equals("provision"));
		}
	}

}
