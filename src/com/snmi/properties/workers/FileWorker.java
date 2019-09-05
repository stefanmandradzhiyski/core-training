package com.snmi.properties.workers;

import com.snmi.properties.model.User;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

/**
 * Util File Worker which operate with text files
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class FileWorker {

    /**
     * Constants
     */
    private static final String FIRST_NAME_PROPERTY = "firstName";
    private static final String LAST_NAME_PROPERTY = "lastName";
    private static final String USERNAME_PROPERTY = "username";
    private static final String CREATING_A_FILE = "The program is creating a file with your data...";
    private static final String CREATING_COMPLETE = "The file is created successfully!";
    private static final String LOADING_A_FILE = "The program is loading a file with your data...";
    private static final String LOADING_COMPLETE = "The file is loaded successfully and the user is created!";

    /**
     * Variable
     */
    private static User user;

    /**
     * Private constructor
     */
    private FileWorker() {}

    /**
     * Create a text file
     * @param firstName take the user first name
     * @param lastName take the user last name
     * @param username take the user username
     * @param fileName take the text file name
     * @param fileComment take the text file comment
     */
    public static void createFile(String firstName, String lastName, String username, String fileName, String fileComment) {
        System.out.println(CREATING_A_FILE);

        Properties properties = new Properties();
        properties.setProperty(FIRST_NAME_PROPERTY, firstName);
        properties.setProperty(LAST_NAME_PROPERTY, lastName);
        properties.setProperty(USERNAME_PROPERTY, username);

        try (Writer writer = Files.newBufferedWriter(Paths.get(fileName))) {
            properties.store(writer,fileComment);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(CREATING_COMPLETE);
    }

    /**
     * Loading a text file and create user
     * @param fileName take the text file name
     */
    public static void loadFile(String fileName) {
        System.out.println(LOADING_A_FILE);

        Properties properties = new Properties();
        try (Reader reader = Files.newBufferedReader(Paths.get(fileName))) {
            properties.load(reader);
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
     * @return created user
     */
    public static User getUser() {
        return user;
    }
}
