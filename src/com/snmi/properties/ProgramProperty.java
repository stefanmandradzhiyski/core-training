package com.snmi.properties;

import com.snmi.properties.workers.FileWorker;
import com.snmi.properties.workers.XMLWorker;

/**
 * The program showing one positive use of Properties library
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class ProgramProperty {

    /**
     * Constants
     */
    private static final String NOT_CREATED = "User hasn't created and loaded yet";

    public static void main(String[] args) {

        FileWorker.createFile("Stefan", "Mandradzhiyski", "snmi",
                "snmi.properties", "SNMI Data");
        printFileUser();
        FileWorker.loadFile("snmi.properties");
        printFileUser();

        XMLWorker.createXML("StefanXML", "MandradzhiyskiXML", "snmiXML",
                "snmi.xml", "SNMI XML Data");
        printXMLUser();
        XMLWorker.loadXML("snmi.xml");
        printXMLUser();
    }

    /**
     * Print the user from text file
     */
    private static void printFileUser() {
        if (FileWorker.getUser() != null) {
            System.out.println(FileWorker.getUser().toString());
        } else {
            System.out.println(NOT_CREATED);
        }
    }

    /**
     * Print the user from xml file
     */
    private static void printXMLUser() {
        if (XMLWorker.getUser() != null) {
            System.out.println(XMLWorker.getUser().toString());
        } else {
            System.out.println(NOT_CREATED);
        }
    }

}
