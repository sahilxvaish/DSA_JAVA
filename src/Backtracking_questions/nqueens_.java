package Backtracking_questions;

import java.util.List;

public class nqueens_ {
    public boolean isSafe(int row, int col, char[][] board){
        for (int j =0; j<board.length; j++){
            if (board[row][j] == 'Q'){
                return false;
            }
        }
        for (int i = 0; i <board[0].length; i++){
            if (board[i][col] == 'Q'){
                return false;
            }
        }

        int r = row;
        for (int c = col; c>=0 && r>=0; c--, r--){
            if (board[r][c] == 'Q'){
                return false;
            }
        }
        r = row;
        for (int c = col; col< board.length && r>=0; r--, c++){
            if (board[r][c] == 'Q'){
                return false;
        }
            r = row;
            for (int c= col; col>= 0 && r < board.length; r++, c--) {
                if (board[r][c] == 'Q') {
                    return false;
                }
                for(int c = col; col<board.length && r< board.length; c++, r++){
                    if (board[r][c] == 'Q'){
                        return false;
                }



            }

    }

    public void helper(char[][] board, List<List<String>> allBoards, int col){
        if (col == board.length){
            saveBoard(board, allBoards);
            return;
        }
    }
        for(int row= 0; row<board.length; row ++){
            if (isSafe(row, col, board)){
                board[row][col] = 'Q';
                helper(board, allBoards, col+1);
                board[row][col]= '.';
            }
        }
    }
    public List<List<String>> solveNQueens(int n){
        List<List<String>> allBoards = new ArrayList<>();
        char[][] board = new board[n][n];

        helper(board, allBoards, 0);
    }


