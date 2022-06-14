package ticTacToe;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TicTacToe {

    private int row;
    private int column;
    private INDICATOR [][] gameBoard;
    private int playerNumber;
    private Scanner input = new Scanner(System.in);

    private boolean isEmpty;
    private int emptyElementCounter;
    private int gameTimer = 1;

    public TicTacToe(int row, int column) {
        gameBoard = new INDICATOR[this.row = row][this.column = column];
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

//    public void playGame(){
//        System.out.println("Enter cell number");
//        int cellNumber = input.nextInt();
//        play(cellNumber);
//    }
    public void play(int cellNumber) {
        if(cellNumber > 0 && cellNumber <= 9) {
            if (gameTimer % 2 != 0) {
                playerNumber = 1;
            } else {
                playerNumber = 2;
            }

            switch (cellNumber) {
                case 1 -> {
                    row = 0;
                    column = 0;
                }
                case 2 -> {
                    row = 0;
                    column = 1;
                }
                case 3 -> {
                    row = 0;
                    column = 2;
                }
                case 4 -> {
                    row = 1;
                    column = 0;
                }
                case 5 -> {
                    row = 1;
                    column = 1;
                }
                case 6 -> {
                    row = 1;
                    column = 2;
                }
                case 7 -> {
                    row = 2;
                    column = 0;
                }
                case 8 -> {
                    row = 2;
                    column = 1;
                }
                case 9 -> {
                    row = 2;
                    column = 2;
                }
                default -> {
                    row = -1;
                    column = -1;
                }
            }
            if (gameBoard[row][column] != INDICATOR.E) {
                System.out.println("Cell already filled!!! \nPlay again!");

//                play();
            }else if (gameTimer % 2 == 0) {
                gameBoard[row][column] = INDICATOR.O;
                emptyElementCounter--;
            } else {
                gameBoard[row][column] = INDICATOR.X;
                emptyElementCounter--;
            }
        }

        }


    public INDICATOR viewCellNumber(int cellNumber) {
        if(cellNumber > 0 && cellNumber <= 9){
            switch (cellNumber) {
                case 1:
                    return gameBoard[0][0];
                case 2:
                    return gameBoard[0][1];
                case 3:
                    return gameBoard[0][2];
                case 4:
                    return gameBoard[1][0];
                case 5:
                    return gameBoard[1][1];
                case 6:
                    return gameBoard[1][2];
                case 7:
                    return gameBoard[2][0];
                case 8:
                    return gameBoard[2][1];
                case 9:
                    return gameBoard[2][2];
            }
        }
        return null;

    }


    public void displayGameBoard() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(gameBoard[i][j] + " | ");
            }
            System.out.println();
        }
    }
}
