package com.BridgeLaz;

import com.BridgeLabz.UserRegistration;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;

public class UserRegistrationTest {
    static UserRegistration userRegistration;

    @BeforeAll
    public static void init() {
        System.out.println("Before all");
        userRegistration = new UserRegistration();
        @Test
        void givenFirstnameshouldreturnTrue () {
            boolean value = userRegistration.validateFirstName("Anuroop");
            Assertions.assertTrue(value);
            System.out.println("First Name Checked:- Successfully passed UC1");
        }
        @Test
        void givenLastNameShouldReturnTrue () {
            boolean LastName = userRegistration.validateLastname("Pulluru");
            Assertions.assertTrue(LastName);
            System.out.println("Last Name Checked :- Successfully passed UC2");
        }
        @Test
        void givenEmailidShouldReturnTrue () {
            boolean Email = userRegistration.validateEmail("anuroop@gmail.com");
            Assertions.assertTrue(Email);
            System.out.println("Email ID Checked :- Successfully Passed UC3");
        }
        @Test
        void givenMobileNumberShouldReturnTrue () {
            boolean PhoneNumber = userRegistration.validatPhoneNumber("919032939140");
            Assertions.assertTrue(PhoneNumber);
            System.out.println("PhoneNumber Checked :- Successfully Passed UC4");
        }
    }
}
