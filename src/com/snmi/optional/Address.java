package com.snmi.optional;

/**
 * Address object
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class Address {

    /**
     * Variables
     */
    private String street;
    private String city;
    private int streetNumber;

    /**
     * Default constructor
     */
    public Address() {}

    /**
     * Custom constructor
     * @param street take the street
     * @param city take the city
     * @param streetNumber take the street number
     */
    public Address(String street, String city, int streetNumber) {
        this.street = street;
        this.city = city;
        this.streetNumber = streetNumber;
    }

    /**
     * Setters and getters
     */
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
    }

    /**
     * Implementation of to string method
     * @return the address presentation
     */
    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", streetNumber=" + streetNumber +
                '}';
    }
}
