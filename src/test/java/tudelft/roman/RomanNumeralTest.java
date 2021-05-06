package tudelft.roman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class RomanNumeralTest {

    private RomanNumeral roman;

    @BeforeEach
    void initialize() {
        this.roman = new RomanNumeral();
    }

    @Test
    void singleNumber() {
        int result = roman.convert("I");
        Assertions.assertEquals(1, result);
    }

    @Test
    void numberWithManyDigits() {
        int result = roman.convert("VIII");
        Assertions.assertEquals(8, result);
    }

    @Test
    void numberWithSubtractiveNotation() {
        int result = roman.convert("CIX");
        Assertions.assertEquals(109, result);
    }

    @Test
    void numberWithoutSubtractiveNotation() {
        int result = roman.convert("XLV");
        Assertions.assertEquals(45, result);
    }
}
