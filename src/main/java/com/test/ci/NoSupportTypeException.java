package com.test.ci;

public class NoSupportTypeException extends RuntimeException {
    NoSupportTypeException(String message) {
        super(message);
    }
}
