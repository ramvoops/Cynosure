package data;

/**
 * Represents an Exception that is thrown if user does not enter 1 or 0
 * as an integer.
 */

public class NotBinaryException extends Exception {

    /**
     * Public constructor
     *
     * @param message the message carried by this Exception.
     */
    public NotBinaryException(String message) {
        super(message);
    }
}