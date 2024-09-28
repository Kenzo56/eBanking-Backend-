package com.example.ebankingbackend.exceptions;

public class CustomerNotFountException extends RuntimeException {
    public CustomerNotFountException(String message) {
        super(message);
    }
}
