package refactoring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class TennisGameTest {

    @Test
    public void testNormalScore() {
        TennisGame game = new TennisGame("Alice", "Bob");
        game.wonPoint("Alice");
        assertEquals("Fifteen-Love", game.getScore());

        game.wonPoint("Bob");
        assertEquals("Fifteen-Fifteen", game.getScore());

        game.wonPoint("Alice");
        assertEquals("Thirty-Fifteen", game.getScore());

        game.wonPoint("Bob");
        assertEquals("Thirty-All", game.getScore());

        game.wonPoint("Alice");
        assertEquals("Forty-Thirty", game.getScore());

        game.wonPoint("Bob");
        assertEquals("Forty-All", game.getScore());
    }

    @Test
    public void testTieScore() {
        TennisGame game = new TennisGame("Alice", "Bob");
        for (int i = 0; i < 3; i++) {
            game.wonPoint("Alice");
            game.wonPoint("Bob");
        }
        assertEquals("Forty-All", game.getScore()); // tie score 3-3

        game.wonPoint("Alice");
        game.wonPoint("Bob");
        assertEquals("Deuce", game.getScore()); // tie score >=4
    }

    @Test
    public void testAdvantageAndWin() {
        TennisGame game = new TennisGame("Alice", "Bob");
        for (int i = 0; i < 4; i++) game.wonPoint("Alice");
        for (int i = 0; i < 3; i++) game.wonPoint("Bob");
        assertEquals("Advantage Alice", game.getScore());

        game.wonPoint("Alice");
        assertEquals("Alice wins", game.getScore());

        game = new TennisGame("Alice", "Bob");
        for (int i = 0; i < 4; i++) game.wonPoint("Bob");
        for (int i = 0; i < 3; i++) game.wonPoint("Alice");
        assertEquals("Advantage Bob", game.getScore());

        game.wonPoint("Bob");
        assertEquals("Bob wins", game.getScore());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUnknownPlayer() {
        TennisGame game = new TennisGame("Alice", "Bob");
        game.wonPoint("Charlie");
    }
}
