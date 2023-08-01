package com.example.AOP.exception;

public class NotFound extends RuntimeException{
    public NotFound() {
    }

    public NotFound(String message) {
        super(message);
    }

    public NotFound(String message, Throwable cause) {
        super(message, cause);
    }
}
