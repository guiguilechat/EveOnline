
package fr.guiguilechat.eveonline.model.sde.compiled.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface DefaultValue {


    public double value();

}
