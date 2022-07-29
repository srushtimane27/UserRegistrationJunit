/**
 * Junit Prameterised Test to validate multiple entry for the Email address
 */

package com.Bridgelabz;

import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Collection;


@RunWith(Parameterized.class)
public class ValidEmailTest {
    private String email2Test;
    private boolean expectedResult;

    public ValidEmailTest(String email, boolean expectedResult){
        this.email2Test = email;
        this.expectedResult = expectedResult;
    }
    @Parameterized.Parameters
    public static Collection data(){
        return Arrays.asList(new Object[][] { {"abc@yahoo.com", true},
                                              {"abc-100@yahoo.com,",true},
                                              {"abc.100@yahoo.com",true},
                                              {"abc111@abc.com",true},
                                              {"abc-100@abc.net",true},
                                              {"abc.100@abc.com.au",true},
                                              {"abc@1.com",true},
                                              {"abc@gmail.com.com",true},
                                              {"abc+100@gmail.com",true} });
    }
    @Test
    public void givenEmail_WhenValid_shouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateEmailAddress(this.email2Test);
        Assertions.assertTrue(result);
    }
}
