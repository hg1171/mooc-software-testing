package tudelft.countletters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CountLettersTest {

    @ParameterizedTest
    @CsvSource({"cats dogs giraffes,3","cats dog,1","fur,1","fur stars,2", "'ox ',0"})
    public void matchingWords(String word, int count){
        CountLetters countWords = new CountLetters();
        int num = countWords.count(word);
        Assertions.assertEquals(count,num);
    }
}