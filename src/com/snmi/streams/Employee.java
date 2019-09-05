package com.snmi.streams;

/**
 * Employee object
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class Employee {

    /**
     * Variables
     */
    private String firstName;
    private int age;

    /**
     * Default constructor
     */
    public Employee() {}

    /**
     * Custom constructor
     * @param firstName take the first name
     * @param age take the age
     */
    public Employee(String firstName, int age) {
        this.firstName = firstName;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Implementation of to string method
     * @return the employee presentation
     */
    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", age=" + age +
                '}';
    }

}
