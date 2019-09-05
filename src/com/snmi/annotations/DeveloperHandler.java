package com.snmi.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Developer Handler annotations
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface DeveloperHandler {

     boolean isTalkWithClients() default false;

}
