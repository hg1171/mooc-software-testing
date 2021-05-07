package tudelft.blackjack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BlackJackLineCoverageTest {

    @Test
    public void bothPlayersGoTooHigh() {
        int result = new BlackJack().play(5, 30);
        Assertions.assertEquals(5, result);
    }

    /*@Test
    public void leftPlayerWins() {
        int result = new BlackJack().play(10, 9);
        Assertions.assertEquals(10, result);
    }*/
}
