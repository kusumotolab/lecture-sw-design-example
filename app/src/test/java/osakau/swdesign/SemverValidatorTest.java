package osakau.swdesign;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class SemverValidatorTest {
	@ParameterizedTest
	@ValueSource(strings = {
			"1.2.3",
			"1.2.99",
			"1.2.0",
			"0.0.0",
			"10.20.30",
			"99999999.99999999.99999999",
			})
    void isValid(final String ver) {
        assertTrue(SemverValidator.isValid(ver));
    }

	@ParameterizedTest
	@ValueSource(strings = {
			"1",
			"1.2",
			"1.2.",
			"1.2.3.",
			"1..3",
			"aaa",
			"1.01.1",
			"1. 2.3",
			"1.-2.3",
			})
    void isInvalid(final String ver) {
        assertFalse(SemverValidator.isValid(ver));
    }
}
