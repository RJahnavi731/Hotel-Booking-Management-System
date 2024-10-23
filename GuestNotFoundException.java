package com.jv7.booking;

public class GuestNotFoundException extends Exception {
    public GuestNotFoundException(String message){
        super(message);
    }
}