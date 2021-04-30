package tudelft.gettingstarted;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GettingStartedTest {

    @Test
    public void addSevenTo20() {
        int result = new GettingStarted().addSeven(20);
        Assertions.assertEquals(27,result);
    }

//    UNCOMMENT THE CODE BELOW, AND FILL THE GAPS!

    @Test
    public void addSevenToZero() {
        int result = new GettingStarted().addSeven(0);
        Assertions.assertEquals(7, result);
    }

    @Test
    public void addSevenToMinus20() {
        int result = new GettingStarted().addSeven(-20);
        Assertions.assertEquals(-13,result);
    }
}
