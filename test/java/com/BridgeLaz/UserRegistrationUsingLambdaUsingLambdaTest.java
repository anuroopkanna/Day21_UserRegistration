package com.BridgeLaz;

import com.BridgeLabz.*;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;

public class UserRegistrationUsingLambdaUsingLambdaTest {
    static UserRegistrationUsingLambdaUsingLambdaTest userRegistration;

    @BeforeAll
    public static void init() {
        System.out.println("Before all");
        userRegistration = new UserRegistrationUsingLambdaUsingLambdaTest();
    }
        @Test
        void givenFirstnameshouldreturnTrue() throws FirstNameException {
            boolean value = userRegistration.validateFirstName("Anuroop");
            Assertions.assertTrue(value);
            System.out.println("First Name Checked");
        }
        @Test
        void givenLastNameShouldReturnTrue() throws LastNameException {
            boolean LastName = userRegistration.validateLastname("Pulluru");
            Assertions.assertTrue(LastName);
            System.out.println("Last Name Checked");
        }
        @Test
        void givenEmailidShouldReturnTrue () throws EmailException {
            boolean Email = userRegistration.validateEmail("anuroop@gmail.com");
            Assertions.assertTrue(Email);
            System.out.println("Email ID Checked");
        }
    @Test
        void givenMobileNumberShouldReturnTrue () throws PhoneNumberException {
            boolean PhoneNumber = userRegistration.validatPhoneNumber("919032939140");
            Assertions.assertTrue(PhoneNumber);
            System.out.println("PhoneNumber Checked" +
                    "");
        }
        @Test
        void checkPasswordShouldReturnTrue() throws PasswordExpection{
            boolean Password = userRegistration.validatePassword("Password1@");
            Assertions.assertTrue(Password);
            System.out.println("Password Checked(Rule1 & Rule2 & Rule3,Rule4,Rule5) :- Successfully Passes UC5,UC6,UC7,UC8");
        }
        @Test
        void checkEmailShouldReturnTrue(){
            String Arr[] = {"abc@yahoo.com","abc@yahoo.com","abc-100@yahoo.com","abc111@abc.com","abc-100@abc.net","abc.100@abc.com.au","abc@1.com","abc@gmail.com.com","abc+100@gmail.com","abc@yahoo.com"};
            for(int i=0;i< Arr.length;i++)
            {
                boolean email = userRegistration.validateEmail(Arr[i]);
                Assertions.assertTrue(email);
                System.out.println(i+1+") Email sample Checked");
            }
            System.out.println("All test case successfully Passed!!!!");
        }
    }
