package ticTacToe;

public class main {
    public static void main(String[] args) {
        TicTacToe ticTacToe = new TicTacToe(3, 3);
        ticTacToe.makeEmptyGameBoard();
        ticTacToe.displayGameBoard();
//        ticTacToe.play(1);
        ticTacToe.displayGameBoard();
    }
}
