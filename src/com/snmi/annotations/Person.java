package com.snmi.annotations;

import java.lang.reflect.Field;

/**
 * Person object using annotations
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
@ControlBy(God.class)
@DeveloperHandler(isTalkWithClients = true)
public class Person {

    private static final String TALK = "I can talk!";

    /**
     * Talk method which show how works these two custom annotations
     */
    public void talk() {

        DeveloperHandler developerHandler = Person.class.getAnnotation(DeveloperHandler.class);
        if (developerHandler.isTalkWithClients()) {
            System.out.println(TALK);
        }

        ControlBy controlBy = Person.class.getAnnotation(ControlBy.class);
        Class<?> classB = controlBy.value();
        Field[] fields = classB.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName());
        }
    }

}
