package com.Bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserValidatorTest {
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue(){
        UserValidator validator = new UserValidator();
        boolean result = validator.validateFirstName("Srushti");
        Assertions.assertTrue(result);
    }
    @Test
    public void givenFirstName_WhenShort_ShouldReturnFalse(){
        UserValidator validator = new UserValidator();
        boolean result = validator.validateFirstName("Sr");
        Assertions.assertTrue(result);
    }
    @Test
    public void givenFirstName_WhenFirstLetterCapital_ShouldReturnTrue(){
        UserValidator validator = new UserValidator();
        boolean result = validator.validateFirstName("Narayan");
        Assertions.assertTrue(result);
    }


}
