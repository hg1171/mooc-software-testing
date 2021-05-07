package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CaesarShiftCipherTest {

    @ParameterizedTest
    @CsvSource({"abc,3,def","xyz,3,abc","ijk,4,mno","zab,-3,wxy","Harold,3,invalid"})
    public void caesarCipher(String whatToCipher, int shift, String expected){
        CaesarShiftCipher cipherIt = new CaesarShiftCipher();
        Assertions.assertEquals(expected,cipherIt.CaesarShiftCipher(whatToCipher, shift));
    }

}
