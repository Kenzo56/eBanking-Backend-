package com.example.ebankingbackend.exceptions;

public class BalanceNotSufficentException extends Exception {
    public BalanceNotSufficentException(String message) {
        super(message);
    }
}
