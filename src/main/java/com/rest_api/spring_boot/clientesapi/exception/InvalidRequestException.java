package com.rest_api.spring_boot.clientesapi.exception;

public class InvalidRequestException extends RuntimeException{

    public InvalidRequestException(String message) {
        super(message);
    }

    public InvalidRequestException() {
        super("ID not Found");
    }
}
