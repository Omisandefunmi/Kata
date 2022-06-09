package ticTacToe;

import java.util.Arrays;

public class GameBoard {

    private int row;
    private int column;
    private INDICATOR [][] gameBoard;
//    private INDICATOR indicator;
    private boolean isEmpty;
    private int emptyElementCounter;

    public GameBoard(int row, int column) {
        gameBoard = new INDICATOR[this.row = row][this.column = column];
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public boolean isEmpty(){
        if(emptyElementCounter == 9){return isEmpty = true;}
        else {return isEmpty = false;}
    }

    public void makeEmptyGameBoard(){
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column ; j++) {
                gameBoard[i][j] = INDICATOR.E;
                emptyElementCounter++;
            }
        }
    }

    @Override
    public String toString(){
        return Arrays.deepToString(gameBoard);
    }
}
