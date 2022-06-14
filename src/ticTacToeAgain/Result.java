package ticTacToeAgain;

public class Result {
    public boolean check(Player player, State[][] board) {
        if(checkForRows(player,board,0)){return true;}
        else if(checkForRows(player,board,1)){return true;}
        else if(checkForRows(player,board,2)){return true;}
        else if(checkForColumns(player,board,0)){return true;}
        else if(checkForColumns(player,board,1)){return true;}
        else if(checkForColumns(player,board,2)){return true;}
        else if(checkForDiagonal1(player,board)){return true;}
        else if(checkForDiagonal2(player,board)){return true;}
        return false;
    }

    private boolean checkForRows(Player player, State[][] board, int row) {
        return board[row][0].equals(player.getTag()) && board[row][1].equals(player.getTag()) && board[row][2].equals(player.getTag());
    }

    private boolean checkForColumns(Player player, State[][] board, int column) {
        return board[0][column].equals(player.getTag()) && board[1][column].equals(player.getTag()) && board[2][column].equals(player.getTag());
    }

    private boolean checkForDiagonal1(Player player, State[][] board) {
        return board[0][0].equals(player.getTag()) && board[1][1].equals(player.getTag()) && board[2][2].equals(player.getTag());
    }

    private boolean checkForDiagonal2(Player player, State[][] board) {
        return board[0][2].equals(player.getTag()) && board[1][1].equals(player.getTag()) && board[2][0].equals(player.getTag());
    }

}
