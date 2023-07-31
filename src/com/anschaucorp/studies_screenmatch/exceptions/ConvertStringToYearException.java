package com.anschaucorp.studies_screenmatch.exceptions;

public class ConvertStringToYearException extends RuntimeException {
    private String message;

    public ConvertStringToYearException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
