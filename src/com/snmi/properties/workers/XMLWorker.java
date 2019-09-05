package com.snmi.properties.workers;

import com.snmi.properties.model.User;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

/**
 * Util XML Worker which operate with xml files
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class XMLWorker {

    /**
     * Constants
     */
    private static final String FIRST_NAME_PROPERTY = "firstName";
    private static final String LAST_NAME_PROPERTY = "lastName";
    private static final String USERNAME_PROPERTY = "username";
    private static final String CREATING_A_XML = "The program is creating a xml file with your data...";
    private static final String CREATING_COMPLETE = "The xml file is created successfully!";
    private static final String LOADING_A_XML = "The program is loading a xml file with your data...";
    private static final String LOADING_COMPLETE = "The xml file is loaded successfully and the user is created!";

    /**
     * Variable
     */
    private static User user;

    /**
     * Private constructor
     */
    private XMLWorker() {}

    /**
     * Create a xml file
     * @param firstName take the user first name
     * @param lastName take the user last name
     * @param username take the user username
     * @param XMLFileName take the xml file name
     * @param XMLComment take the comment of xml file
     */
    public static void createXML(String firstName, String lastName, String username, String XMLFileName, String XMLComment) {
        System.out.println(CREATING_A_XML);

        Properties properties = new Properties();
        properties.setProperty(FIRST_NAME_PROPERTY, firstName);
        properties.setProperty(LAST_NAME_PROPERTY, lastName);
        properties.setProperty(USERNAME_PROPERTY, username);

        try (OutputStream outputStream = Files.newOutputStream(Paths.get(XMLFileName))) {
            properties.storeToXML(outputStream,XMLComment);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(CREATING_COMPLETE);
    }

    /**
     * Loading the user data form created file
     * @param XMLFileName take the xml file name
     */
    public static void loadXML(String XMLFileName) {
        System.out.println(LOADING_A_XML);

        Properties properties = new Properties();
        try (InputStream inputStream = Files.newInputStream(Paths.get(XMLFileName))) {
            properties.loadFromXML(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

        user = new User(properties.getProperty(FIRST_NAME_PROPERTY),
                        properties.getProperty(LAST_NAME_PROPERTY),
                        properties.getProperty(USERNAME_PROPERTY));

        System.out.println(LOADING_COMPLETE);
    }

    /**
     * Get the user
     * @return return the user
     */
    public static User getUser() {
        return user;
    }
}
