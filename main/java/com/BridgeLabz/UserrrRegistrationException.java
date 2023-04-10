package com.BridgeLabz;

public class UserrrRegistrationException extends Exception{
    public ExpectedType type;
    public enum ExpectedType{
        FIRSTNAME,LASTNAME, PHONENUMBER,EMAIL,PASSWORD
    }
    public UserrrRegistrationException(String message,ExpectedType type){
        super(message);
        this.type=type;
    }
}
