package com.lcwd.electronic.store.exceptions;

public class BadApiRequestException extends Throwable {

    public BadApiRequestException(String message) {
        super(message);
    }

    public BadApiRequestException() {
        super("Bad Request !!");
    }

}
