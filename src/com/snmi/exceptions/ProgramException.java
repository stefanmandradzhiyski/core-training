package com.snmi.exceptions;

/**
 * The program shows a little implementation of custom exceptions
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class ProgramException {

    public static void main(String[] args) {
        String password = "**A";

        try {
            if (!password.matches(".*[a-zA-Z].*")) {
                throw new LetterException(password);
            }

            if (!password.matches(".*[0-9].*")) {
                throw new NumberException(password);
            }
        } catch (LetterException le) {
            le.throwExceptionMessage();
        } catch (NumberException ne) {
            ne.throwExceptionMessage();
        }

    }

}
