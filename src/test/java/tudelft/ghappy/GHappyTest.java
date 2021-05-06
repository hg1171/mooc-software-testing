package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class GHappyTest {

    @Test
    public void test1() {
        GHappy happy = new GHappy();
        boolean isHappy = happy.gHappy("xxggxx");
        Assertions.assertTrue(isHappy);
    }

    @Test
    public void test2() {
        GHappy happy = new GHappy();
        boolean isHappy = happy.gHappy("xxgxx");
        Assertions.assertFalse(isHappy);
    }

    @Test
    public void test3() {
        GHappy happy = new GHappy();
        boolean isHappy = happy.gHappy("xxggyygxx");
        Assertions.assertFalse(isHappy);
    }

    @Test
    public void test4() {
        GHappy happy = new GHappy();
        boolean isHappy = happy.gHappy("ggxxggyyggxx");
        Assertions.assertFalse(isHappy);
    }

    @Test
    public void test5() {
        GHappy happy = new GHappy();
        boolean isHappy = happy.gHappy("ggxxggyyggxxgg");
        Assertions.assertFalse(isHappy);
    }

}
