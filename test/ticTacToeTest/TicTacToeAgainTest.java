package ticTacToeTest;

import org.junit.jupiter.api.Test;
import ticTacToe.TicTacToeAgain;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TicTacToeAgainTest {
    @Test
    public void TicTacToeExistsTest(){
        TicTacToeAgain TTT = new TicTacToeAgain();
        assertNotNull(TTT);
    }
}
