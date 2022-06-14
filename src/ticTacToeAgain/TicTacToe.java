package ticTacToeAgain;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

import static ticTacToeAgain.State.*;

public class TicTacToe {
    private final State[][] state;
    private final Result result = new Result();
    private final Scanner input = new Scanner(System.in);
    private Player player1;
    private Player player2;


    public TicTacToe() {
        state = new State[3][3];
    }

    public State[][] getDisplayBoard() {
        return state;
    }

    public void showDisplayBoard(){
        for (State[] states : state) {
            for (State value : states) {
                System.out.print(value + " | ");
            }
            System.out.println();
        }
    }

    public void fillDisplayBoardWithEmpty(){
        for (int i = 0; i < state.length; i++) {
            Arrays.fill(state[i], E);
        }
    }
    public void makeMove(Player player,int number){
        switch (number) {
            case 1 -> player.makeMove(0, 0, state);
            case 2 -> player.makeMove(0, 1, state);
            case 3 -> player.makeMove(0, 2, state);
            case 4 -> player.makeMove(1, 0, state);
            case 5 -> player.makeMove(1, 1, state);
            case 6 -> player.makeMove(1, 2, state);
            case 7 -> player.makeMove(2, 0, state);
            case 8 -> player.makeMove(2, 1, state);
            case 9 -> player.makeMove(2, 2, state);
            default -> {
                System.out.println("Enter a valid number!");
                input.nextLine();
                number = input.nextInt();
                makeMove(player, number);
            }
        }
    }
    private boolean isEmpty(int number){
        int row = 10;
        int column = 10;
        if(number == 1){row = 0; column = 0;}
        if(number == 2){row = 0; column = 1;}
        if(number == 3){row = 0; column = 2;}
        if(number == 4){row = 1; column = 0;}
        if(number == 5){row = 1; column = 1;}
        if(number == 6){row = 1; column = 2;}
        if(number == 7){row = 2; column = 0;}
        if(number == 8){row = 2; column= 1;}
        if(number == 9){row = 2; column= 2;}
        if(number == 10){return false;}
        if(number <= 0 || number > 10){return false;
        }
        return state[row][column] == E;
    }

    public boolean isBoardFull(){
        int counter = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(!state[i][j].equals(E)){
                    counter++;
                }
            }
        }
        if(counter == 9){
            System.out.println("Nobody won! Game over!");
            return true;
        }
        return false;
    }

    public boolean checkResult(Player player){
        return result.check(player,state);
    }

    private void chooseTag(){
        fillDisplayBoardWithEmpty();
        System.out.println("Welcome!");
        System.out.println("Please enter the tag you would like to use (X or O)");
        String tag = input.nextLine();
        switch (tag.toUpperCase()) {
            case "X" -> {
                player1 = new Player(1, X);
                System.out.println("The second player tag is O");
                player2 = new Player(2, O);
            }
            case "O" -> {
                player1 = new Player(1, O);
                System.out.println("The second player tag is X");
                player2 = new Player(2, X);
            }
            default -> chooseTag();
        }
    }
    private void playGame(Player player){
        System.out.printf("%s turn: ",player);
        System.out.println("Select number between 1 and 9 to play");
        try{
            int number = input.nextInt();

            if(isEmpty(number)){makeMove(player,number); showDisplayBoard();}
            else{
                System.out.println("Not available to be filled, please play again!");
                playGame(player);
            }
        }

        catch (InputMismatchException | IllegalArgumentException e){
            System.out.println("Enter a valid number!");
            playGame(player);
        }
        if(checkResult(player)){
            System.out.printf("%s wins!%n",player);
            System.exit(0);
        }
        if(isBoardFull()) {
            System.exit(0);
        }
    }
    public void play(){
        chooseTag();
        for (int i = 0; i < 9; i++) {
            playGame(player1);
            playGame(player2);
        }

    }
}
