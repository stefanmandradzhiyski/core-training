package com.snmi.serialization;

import java.io.Serializable;

/**
 * Animal object
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class Animal implements Serializable {

    /**
     * Variables
     */
    private String name;
    private int age;

    /**
     * Default constructor
     */
    public Animal() {}

    /**
     * Custom constructor
     * @param name take the name
     * @param age take the age
     */
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * Setters and getters
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Implementation of to string method
     * @return the presentation of animal
     */
    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
