package com.snmi.properties.model;

/**
 * User model
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class User {

    /**
     * Variables
     */
    private String firstName;
    private String lastName;
    private String username;

    /**
     * Default constructor
     */
    public User() {}

    /**
     * Custom constructor
     * @param firstName take the first name
     * @param lastName take the last name
     * @param username take the username
     */
    public User(String firstName, String lastName, String username) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
    }

    /**
     * Getters
     */
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUsername() {
        return username;
    }

    /**
     * Implementation of to string method
     * @return the user presentation
     */
    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}
