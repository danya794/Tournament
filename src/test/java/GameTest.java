import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    @Test
    public void WhenFirstPlayerIsStrongerTest() {
        Game game = new Game();
        Player petya = new Player(1, "Петя", 100);
        Player dima = new Player(2, "Дима", 60);

        game.register(petya);
        game.register(dima);

        int actual = game.round("Петя", "Дима");
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void WhenSecondPlayerIsStrongerTest() {
        Game game = new Game();
        Player petya = new Player(1, "Петя", 100);
        Player dima = new Player(2, "Дима", 160);

        game.register(petya);
        game.register(dima);

        int actual = game.round("Петя", "Дима");
        int expected = 2;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void WhenDrawTest() {
        Game game = new Game();
        Player petya = new Player(1, "Петя", 100);
        Player dima = new Player(2, "Дима", 100);

        game.register(petya);
        game.register(dima);

        int actual = game.round("Петя", "Дима");
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void WhenFirstPlayerNotFoundTest() {
        Game game = new Game();
        Player petya = new Player(1, "Петя", 100);
        Player dima = new Player(2, "Дима", 100);

        //game.register(petya);
        game.register(dima);

        int actual = game.round("Петя", "Дима");
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void WhenSecondPlayerNotFoundTest() {
        Game game = new Game();
        Player petya = new Player(1, "Петя", 100);
        Player dima = new Player(2, "Дима", 100);

        game.register(petya);
        game.register(dima);

        int actual = game.round("Петя", "Дима");
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void WhenNobodyFoundTest() {
        Game game = new Game();
        Player petya = new Player(1, "Петя", 100);
        Player dima = new Player(2, "Дима", 100);

        game.register(petya);
        game.register(dima);

        int actual = game.round("Петя", "Дима");
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }


}