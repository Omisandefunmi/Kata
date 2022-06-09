package ticTacToeTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ticTacToe.INDICATOR;
import ticTacToe.TicTacToe;

import static org.junit.jupiter.api.Assertions.*;

public class TicTacToeTest {
    private TicTacToe ticTacToe;

    @BeforeEach
    public void alwaysStartWith(){
         ticTacToe = new TicTacToe(3,3);
         ticTacToe.makeEmptyGameBoard();
    }

    @Test
    public void testThatTicTacToeCanBeCreated(){
        assertNotNull(ticTacToe);
    }

    @Test
    public void testThatGameBoardCanBeMadeEmpty(){
        ticTacToe.makeEmptyGameBoard();
        assertTrue(ticTacToe.isEmpty());
    }

    @Test
    public void testThatTicTacToeCanDisplayGameBoard(){
        ticTacToe.displayGameBoard();
    }

    @Test
    public void testThatWhenPlayerPlays_GameBoardIsNoLongerEmpty(){
//        ticTacToe.play(1);
        assertFalse(ticTacToe.isEmpty());
    }

    @Test
    public void testThatCellNumberEnteredIsFilled(){
//        ticTacToe.play(1);
        assertEquals(INDICATOR.X, ticTacToe.viewCellNumber(1));
    }

    @Test
    public void testThatXBelongsToPlayer1_andOBelongsToPlayer2(){
        ticTacToe.displayGameBoard();
//        ticTacToe.play(2);
//        ticTacToe.play(8);
        ticTacToe.displayGameBoard();
//        assertEquals(INDICATOR.X, ticTacToe.viewCellNumber(2));
//        assertEquals(INDICATOR.O, ticTacToe.viewCellNumber(8));
    }

    @Test
    public void testThatBothPlayersCanNotPlayBeyondNineTimes(){
//        ticTacToe.play();
//        ticTacToe.play();
//        ticTacToe.play(3);
//        ticTacToe.play();
//        ticTacToe.play(5);
//        ticTacToe.play(6);
//        ticTacToe.play(7);
//        ticTacToe.play(8);
//        ticTacToe.play(9);

        ticTacToe.displayGameBoard();

//        assertThrows(ArrayIndexOutOfBoundsException.class, () ->  ticTacToe.play(10));
    }

    @Test
    public void testThatAlreadyFilledCellCanNotBeFilledAgain(){
        ticTacToe.playGame();
//        ticTacToe.play(3);
//        ticTacToe.play();
//        ticTacToe.play();
        assertEquals(INDICATOR.X, ticTacToe.viewCellNumber(3));
//        assertEquals(INDICATOR.O, ticTacToe.viewCellNumber(1));
    }

    @Test
    public void testThatWinsAndLossesCanBeEvaluated(){
//        ticTacToe.play();
//        ticTacToe.play();
//        ticTacToe.play();
//        ticTacToe.play();
//        ticTacToe.play(5);
//        ticTacToe.play(6);
//        ticTacToe.play(7);
//        ticTacToe.play(8);
//        ticTacToe.play(2);
        ticTacToe.displayGameBoard();

    }
}
