package com.codewitharjun.CwABackend.exception;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(Long id) {
        super("could not find user " + id);
    }
}
