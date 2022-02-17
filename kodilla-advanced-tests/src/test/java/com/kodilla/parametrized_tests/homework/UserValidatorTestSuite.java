package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTestSuite {
    private UserValidator userValidator = new UserValidator();

    @ParameterizedTest
    @ValueSource (strings = {"mirek", "Mir", "mireK1.", "2_a", "m-2", ".--" })
    public void shouldReturnTrueForStringFromRegex(String username) {
        boolean result = userValidator.validateUsername(username);
        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource (strings = {"Mi", "M/ir", "!mireK1.", "2_a@#$%^&*()", "m-2{}:<>?:|", ".-`~~-" })
    public void shouldReturnFalseForStringOutOfRegex(String username) {
        boolean result = userValidator.validateUsername(username);
        assertFalse(result);
    }

    @ParameterizedTest
    @ValueSource (strings = {"mirek.sid@com.pl", "Mi@r.pl", "mireK1._@mireK1.hu", "2_a@2.a", "m-2@1.Hi", "_.--@Q-1.aa.ku" })
    public void shouldReturnTrueForEmailFromRegex(String email) {
        boolean result = userValidator.validateEmail(email);
        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource (strings = {"Mi@c.l12345678", "M/ir@r.pl", "!mireK1.@mireK1.hu", "2_a@#$%^&*()1.Hi", "m-2{}:<>?:|@2.a", ".-`~~-@Q-1.aa.ku", "_.--@Q-1.a_a.ku", "_.--@Q-1.a_a-.ku" })
    public void shouldReturnFalseForEmailOutOfRegex(String email) {
        boolean result = userValidator.validateEmail(email);
        assertFalse(result);
    }


}