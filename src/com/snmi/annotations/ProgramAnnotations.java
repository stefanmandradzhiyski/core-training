package com.snmi.annotations;

/**
 * The program shows little logic part of annotations
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
@DeveloperHandler
public class ProgramAnnotations {

    public static void main(String[] args) {
        Person person = new Person();
        person.talk();
    }

}
