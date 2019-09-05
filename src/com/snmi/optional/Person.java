package com.snmi.optional;

/**
 * Person object
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class Person {

    /**
     * Variables
     */
    private String firstName;
    private String lastName;
    private int age;
    private Address address;

    /**
     * Default constructor
     */
    public Person() {}

    /**
     * Custom constructor
     * @param firstName take the first name
     * @param lastName take the last name
     * @param age take the age
     */
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    /**
     * Custom constructor
     * @param firstName take the first name
     * @param lastName take the last name
     * @param age take the age
     * @param address take the address
     */
    public Person(String firstName, String lastName, int age, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    /**
     * Implementation of to string method
     * @return the person presentation
     */
    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }
}
