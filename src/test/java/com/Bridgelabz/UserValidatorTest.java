//Test Cases For User Registration

package com.Bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserValidatorTest {

    //Test Cases For First Name
    @Test
    public void givenFirstName_WhenStartsWithCapsAndHasMinimumThreeCharacters_ShouldReturnTrue(){
        UserValidator validator = new UserValidator();
        boolean result = validator.validateFirstName("Alka");
        Assertions.assertTrue(result);
    }

    //Test Cases For Last Name
    @Test
    public void givenLastName_WhenStartsWithCapsAndHasMinimumThreeCharacters_ShouldReturnTrue(){
        UserValidator validator = new UserValidator();
        boolean result = validator.validateLastName("Mane");
        Assertions.assertTrue(result);
    }
    @Test
    public void givenEmail_WhenValid_ShouldReturnTrue(){
        UserValidator validator = new UserValidator();
        boolean result = validator.validateEmailAddress("abc@gmail.com");
        Assertions.assertTrue(result);
    }



}
