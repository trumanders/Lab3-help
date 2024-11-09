import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidatorTest {
    Validator validator;

    @BeforeEach
    public void föreTester() {
        validator = new Validator();
    }

    @Test
    public void statsWithZero() {

        String phoneNumber = "0707899889";
        assertTrue(Validator.isPhoneNumberValid(phoneNumber));

    }

    @DisplayName("Negative Test")
    @Test
    public void notStartsWithZero() {
        String phoneNumber = "98765456";
        assertFalse(Validator.isPhoneNumberValid(phoneNumber));

    }

    @Test
    public void lengthOfPhoneNumber() {
        String phoneNumber = "070789567";
        assertTrue(Validator.isPhoneNumberValid(phoneNumber));

    }
    @DisplayName("Phone number is less than 5")
    @Test
    public void lengthOfPhoneNumber2() {
        String phoneNumber = "0707";
        assertFalse(Validator.isPhoneNumberValid(phoneNumber));

    }
    @DisplayName("Phone number is more than 10 ")
    @Test
    public void moreThanTen(){
        String phoneNumer = "09877865432";
        assertFalse(Validator.isEmailValid(phoneNumer));


    }
    @Test
    public void emailIsValid(){
        String email= "emrendeye06@gmail.com";
        assertTrue(Validator.isEmailValid(email));

        if (Validator.isEmailValid(email)){
            System.out.println("Email is valid");
        }
    }
    @DisplayName("Negative Test")
    @Test
    public void emailIsNotValid(){
        String email = "emrendeye06gmail.com";
        assertFalse(Validator.isEmailValid(email));

        if (!Validator.isEmailValid(email)){
            System.out.println("Email is not valid");
        }

    }
    @Test
    public void withoutAt(){
        String email = "emrendeye06gmail.com";
        assertFalse(Validator.isEmailValid(email));

    }
    @Test
    public void onlyNumbers(){
        String email = "123456@gmail.com";
        assertTrue(Validator.isEmailValid(email));

    }
    @Test
    public void withoutDott(){
        String email = "emredsadak.com";
        assertFalse(Validator.isEmailValid(email));

    }

}