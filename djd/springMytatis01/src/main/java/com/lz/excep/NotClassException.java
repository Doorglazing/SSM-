package com.lz.excep;

public class NotClassException extends RuntimeException {
    public NotClassException() {
        super();
    }

    public NotClassException(String message) {
        super(message);
    }
}
