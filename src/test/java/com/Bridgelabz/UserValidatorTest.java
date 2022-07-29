//Test Cases For User Registration

package com.Bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class UserValidatorTest {

    /**
     * Test Cases For First Name
     */
    
    
    @Test
    public void givenFirstName_WhenStartsWithCapsAndHasMinThreeLetters_ShouldReturnTrue(){
        UserValidator validator = new UserValidator();
        boolean result = validator.validateFirstName("Srushti");
        Assertions.assertTrue(result);
    }
    @Test
    public void givenFirstName_WhenShort_ShouldReturnFalse(){
        UserValidator validator = new UserValidator();
        boolean result = validator.validateFirstName("Sr");
        Assertions.assertFalse(result);
    }
    @Test
    public void givenFirstName_WhenStartsWithSmallLetter_ShouldReturnFalse(){
        UserValidator validator = new UserValidator();
        boolean result = validator.validateFirstName("srushti");
        Assertions.assertFalse(result);
    }
    

    /**
     * Test Case For Last Name
     */
    

    @Test
    public void givenLastName_WhenLastLetterCapitalAndHasMinThreeLetters_ShouldReturnTrue(){
        UserValidator validator = new UserValidator();
        boolean result = validator.validateLastName("Abcdef");
        Assertions.assertTrue(result);
    }
    @Test
    public void givenLastName_WhenShort_ShouldReturnFalse(){
        UserValidator validator = new UserValidator();
        boolean result = validator.validateLastName("Ab");
        Assertions.assertFalse(result);
    }
    @Test
    public void givenLastName_WhenStartsWithSmallLetters_ShouldReturnFalse(){
        UserValidator validator = new UserValidator();
        boolean result = validator.validateLastName("abcd");
        Assertions.assertFalse(result);
    }

}
