package com.snmi.exceptions;

/**
 * Custom letter exception
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class LetterException extends Exception {

    /**
     * Constants
     */
    private static final String LETTER_EXCEPTION = "%s doesn't contains a letter";

    /**
     * Variable
     */
    private String password;

    /**
     * Custom constructor
     * @param password take the password
     */
    public LetterException(String password) {
        this.password = password;
    }

    /**
     * Throw a exception message
     */
    public void throwExceptionMessage() {
        System.out.printf(LETTER_EXCEPTION, password);
        System.out.println();
    }

}
