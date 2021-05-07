package tudelft.countletters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountLettersTest {

    @Test
    public void multipleMatchingWords() {
        int words = new CountLetters().count("cats dogs giraffes");
        Assertions.assertEquals(3, words);
    }

    @Test
    public void lastWordDoesNotMatch() {
        int words = new CountLetters().count("cats dog");
        Assertions.assertEquals(1, words);
    }

    @Test
    public void oneWordMatch() {
        int words = new CountLetters().count("fur");
        Assertions.assertEquals(1, words);
    }

    @Test
    public void twoWordMatch() {
        int words = new CountLetters().count("fur stars");
        Assertions.assertEquals(2, words);
    }

    @Test
    public void noWordMatch() {
        int words = new CountLetters().count("ox ");
        Assertions.assertEquals(0, words);
    }

}