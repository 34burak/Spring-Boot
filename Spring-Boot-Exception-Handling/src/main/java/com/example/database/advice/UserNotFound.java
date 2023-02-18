package com.example.database.advice;

public class UserNotFound extends RuntimeException{

private  static final long SerialVersionUID=1L;
    public UserNotFound(String message) {
        super(message);
    }
}
