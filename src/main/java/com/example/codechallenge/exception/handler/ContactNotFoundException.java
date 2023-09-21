package com.example.codechallenge.exception.handler;

public class ContactNotFoundException extends RuntimeException {
    public ContactNotFoundException(Long id) {
        super("Could not find employee " + id);
    }
}
