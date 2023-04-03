package com.BridgeLabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public boolean validateFirstName(String value) {
        Pattern pattern = Pattern.compile("^[A-Z][a-z]{3,}$");
        Matcher matcher = pattern.matcher(value);
        if (matcher.matches())
            return true;
        else
            return false;
    }

    public boolean validateLastname(String Lastname) {
        Pattern pattern = Pattern.compile("^[A-Z][a-z]{3,}$");
        Matcher matcher = pattern.matcher(Lastname);
        if (matcher.matches())
            return true;
        else
            return false;
    }
}
