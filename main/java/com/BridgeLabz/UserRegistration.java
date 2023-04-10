package com.BridgeLabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    static String userFirstName = "^[A-Z][a-z]{3,}$";
    static String userLastname = "^[A-Z][a-z]{3,}$";
    static String userEmail ="^[A-Za-z0-9]+(.[A-Za-z0-9]+)*@[^_\\W]+(.[*_\\W]+)?(?=(.[^_\\W]{3,}$|.[a-zA-z]{2}$)).*$";
    static String userPhoneNumber="^(91)?[7-9][0-9]{9}";
    static String userPassword = "^(?=.*[0-9])(?=.*[!@#$%&^*)_(+}{?>:<]){1}+(?=.*[A-Z])([0-9A-Za-z]).{8,}$";
    public static ValidateFirstName validateFirstName =(String firstName) ->
    {
        Pattern pattern = Pattern.compile(userFirstName);
        Matcher matcher = pattern.matcher(firstName);
        try {
            if (matcher.matches()) {
                return true;
            }else{
                throw new UserrrRegistrationException("Enter valid firstName ", UserrrRegistrationException.ExpectedType.FIRSTNAME);
            }
        }catch (UserrrRegistrationException e){
            System.out.println(e);
            e.printStackTrace();
            return false;
        }


        public static ValidateLastName validateLastName =(String lastName) ->
        {
            Pattern pattern = Pattern.compile(userLastname);
            Matcher matcher = pattern.matcher(lastName);
            try {
                if (matcher.matches()) {
                    return true;
                }else{
                    throw new UserrrRegistrationException("Enter valid lastName ", UserrrRegistrationException.ExpectedType.LASTNAME);
                }
            }catch (UserrrRegistrationException e){
                System.out.println(e);
                e.printStackTrace();
                return false;
            }

            public static ValidateEmail validateEmail =(String Email) ->
            {
                Pattern pattern = Pattern.compile(userEmail);
                Matcher matcher = pattern.matcher(Email);
                try {
                    if (matcher.matches()) {
                        return true;
                    }else{
                        throw new UserrrRegistrationException("Enter valid firstName ", UserrrRegistrationException.ExpectedType.FIRSTNAME);
                    }
                }catch (UserrrRegistrationException e){
                    System.out.println(e);
                    e.printStackTrace();
                    return false;
                }

                public static ValidatePhoneNumber validatePhoneNumber =(String phoneNumber) ->
                {
                    Pattern pattern = Pattern.compile(userPhoneNumber);
                    Matcher matcher = pattern.matcher(phoneNumber);
                    try {
                        if (matcher.matches()) {
                            return true;
                        }else{
                            throw new UserrrRegistrationException("Enter valid phoneNumber ", UserrrRegistrationException.ExpectedType.PHONENUMBER);
                        }
                    }catch (UserrrRegistrationException e){
                        System.out.println(e);
                        e.printStackTrace();
                        return false;
                    }
    public static ValidatePassword validatePassword = (String password) ->
    {
        Pattern pattern = Pattern.compile(userPassword);
        Matcher matcher5 = pattern.matcher(password);
        try {
            if (matcher5.matches()) {
                return true;
            } else {
                throw new UserrrRegistrationException("Enter password", UserrrRegistrationException.ExpectedType.PASSWORD);
            }
        } catch (UserrrRegistrationException e) {
            System.out.println(e);
            e.printStackTrace();
            return false;
        }
    }
}
