package ticTacToeTest;

import org.junit.jupiter.api.Test;
import ticTacToe.TicTacToe;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TicTacToeTest {

    @Test
    public void testThatTicTacToeCanBeCreated(){
        TicTacToe ticTacToe = new TicTacToe();
        assertNotNull(ticTacToe);
    }

    @Test
    public  void testThatTicTacToeHasFirstPlayer(){
        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.setNameOfFirstPlayer("funmi");
        assertEquals("funmi",ticTacToe.getNameOfFirstPlayer());
    }
}
