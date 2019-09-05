package com.snmi.exceptions;

/**
 * Custom number exception
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class NumberException extends Exception {

    /**
     * Constants
     */
    private static final String NUMBER_EXCEPTION = "%s doesn't contains a number";

    /**
     * Variable
     */
    private String password;

    /**
     * Custom constructor
     * @param password take the password
     */
    public NumberException(String password) {
        this.password = password;
    }

    /**
     * Throw a exception message
     */
    public void throwExceptionMessage() {
        System.out.printf(NUMBER_EXCEPTION, password);
        System.out.println();
    }
}
