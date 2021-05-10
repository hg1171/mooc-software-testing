package harold;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class calculationTest {

    @Test
    public void testPositive(){
        int[] testArr = {10,20,30,40};
        int max = calculation.findMax(testArr);
        Assertions.assertEquals(40,max);
    }
    @Test
    public void testNegative(){
        int[] testArr = {-40,-30,-20,-10};
        int max = calculation.findMax(testArr);
        Assertions.assertEquals(-10,max);
    }

}
