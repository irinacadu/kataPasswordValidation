package org.example;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PasswordValidationTest {

    @Test
    void lessThanEightCharacters() {
        String password = "pass";
        
        Boolean isValid = PasswordValidator.validate(password);
        assertThat(isValid).isEqualTo(false);
    }

    @Test
    void EightCharacters() {
        String password = "password";

        Boolean isValid = PasswordValidator.validate(password);
        assertThat(isValid).isEqualTo(true);
    }

}
