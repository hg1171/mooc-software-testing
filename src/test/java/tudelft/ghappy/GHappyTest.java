package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class GHappyTest {

    @Disabled("Trial test")
    @Test
    public void test1() {
        GHappy happy = new GHappy();
        boolean isHappy = happy.gHappy("xxggxx");
        Assertions.assertTrue(isHappy);
    }
    @Disabled("Trial test")
    @Test
    public void test2() {
        GHappy happy = new GHappy();
        boolean isHappy = happy.gHappy("xxgxx");
        Assertions.assertFalse(isHappy);
    }
    @Disabled("Trial test")
    @Test
    public void test3() {
        GHappy happy = new GHappy();
        boolean isHappy = happy.gHappy("xxggyygxx");
        Assertions.assertFalse(isHappy);
    }
    @Disabled("Trial test")
    @Test
    public void test4() {
        GHappy happy = new GHappy();
        boolean isHappy = happy.gHappy("ggxxggyyggxx");
        Assertions.assertTrue(isHappy);
    }
    @Disabled("Trial test")
    @Test
    public void test5() {
        GHappy happy = new GHappy();
        boolean isHappy = happy.gHappy("ggxxggyyggxxgg");
        Assertions.assertTrue(isHappy);
    }
    @Disabled("Trial test")
    @Test
    public void test6() {
        GHappy happy = new GHappy();
        boolean isHappy = happy.gHappy("ggxxggyyggxxg");
        Assertions.assertFalse(isHappy);
    }
    @Disabled("Trial test")
    @Test
    public void test7() {
        GHappy happy = new GHappy();
        boolean isHappy = happy.gHappy("gxxggyyggxxgg");
        Assertions.assertFalse(isHappy);
    }

    @Test
    public void testAll() {
        GHappy happy = new GHappy();
        Assertions.assertAll("Test all",
                () -> Assertions.assertTrue(happy.gHappy("xxggxx")),
                () -> Assertions.assertFalse(happy.gHappy("xxgxx")),
                () -> Assertions.assertFalse(happy.gHappy("xxggyygxx")),
                () -> Assertions.assertTrue(happy.gHappy("ggxxggyyggxx")),
                () -> Assertions.assertTrue(happy.gHappy("ggxxggyyggxxgg")),
                () -> Assertions.assertFalse(happy.gHappy("ggxxggyyggxxg")),
                () -> Assertions.assertFalse(happy.gHappy("gxxggyyggxxgg"))
                );
    }
}
