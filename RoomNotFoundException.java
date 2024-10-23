package com.jv7.booking;

public class RoomNotFoundException extends Exception{
    public RoomNotFoundException(String message){
        super(message);
    }
}
