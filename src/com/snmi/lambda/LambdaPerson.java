package com.snmi.lambda;

/**
 * Lambda person object
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class LambdaPerson {

    /**
     * Variables
     */
    private String firstName;
    private String lastName;
    private int age;

    /**
     * Default constructor
     */
    public LambdaPerson() {}

    /**
     * Custom constructor
     * @param firstName take the first name
     * @param lastName take the last name
     * @param age take the age
     */
    public LambdaPerson(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    /**
     * Setters and getters
     */
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Implementation of to string method
     * @return the lambda person presentation
     */
    @Override
    public String toString() {
        return "LambdaPerson{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

}
