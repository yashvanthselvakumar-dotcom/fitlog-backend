package com.example.FitLog.Exception;

public class BusinessValidationException extends RuntimeException {

    public BusinessValidationException() {
        super();
    }

    public BusinessValidationException(String message) {
        super(message);
    }
}