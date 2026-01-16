package com.flightontime.api.infra;

public class ValidatorException extends RuntimeException {
    private String field;

    public ValidatorException(String field, String message) {
        super(message);
        this.field = field;
    }

    public String getField() {
        return field;
    }
}
