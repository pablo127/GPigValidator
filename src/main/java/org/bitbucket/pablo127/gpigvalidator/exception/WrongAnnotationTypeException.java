package org.bitbucket.pablo127.gpigvalidator.exception;

public class WrongAnnotationTypeException extends RuntimeException {

    public WrongAnnotationTypeException(String message) {
        super(message);
    }

    public WrongAnnotationTypeException() {
        super();
    }
}