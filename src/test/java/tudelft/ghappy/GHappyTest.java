package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

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
        Assertions.assertTrue(isHappy);
    }

    @Test
    public void test5() {
        GHappy happy = new GHappy();
        boolean isHappy = happy.gHappy("ggxxggyyggxxgg");
        Assertions.assertTrue(isHappy);
    }

    @Test
    public void test6() {
        GHappy happy = new GHappy();
        boolean isHappy = happy.gHappy("ggxxggyyggxxg");
        Assertions.assertFalse(isHappy);
    }

    @Test
    public void test7() {
        GHappy happy = new GHappy();
        boolean isHappy = happy.gHappy("gxxggyyggxxgg");
        Assertions.assertFalse(isHappy);
    }

    /*@ParameterizedTest
    @ValueSource(strings = {"xxggxx","xxgxx","xxggyygxx","ggxxggyyggxx",
            "ggxxggyyggxxgg","ggxxggyyggxxg","gxxggyyggxxgg"})
    public void isHappy(String testString){
        GHappy happy = new GHappy();
        boolean isHappy = happy.gHappy(testString);
        Assertions.assertTrue(isHappy);
    }*/

}
