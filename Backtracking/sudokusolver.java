import java.util.*;

class Solution {
    public void solveSudoku(char[][] board) {
        char[][] grid = new char[9][9];
        solve(board, 0, 0, grid);
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                board[i][j] = grid[i][j];
            }
        }
    }

    public void solve(char[][] board, int row, int col, char[][] grid) {
        if (row == 9) {
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    grid[i][j] = board[i][j];
                }
            }
            return;
        } else if (board[row][col] != '.') {
            if (col != 8) {
                solve(board, row, col + 1, grid);
            } else {
                solve(board, row + 1, 0, grid);
            }
        } else {
            for (char ch = '1'; ch <= '9'; ch++) {
                if (isvalid(board, row, col, ch)) {
                    board[row][col] = ch;
                    if (col != 8) {// you have to move forward to check the next number in the board
                        solve(board, row, col + 1, grid);
                    } else {
                        solve(board, row + 1, 0, grid);
                    }
                    board[row][col] = '.';// backtracking
                }
            }
        }
    }

    public boolean isvalid(char[][] board, int row, int col, char num) {
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == num) {
                return false;
            }
        }

        for (int i = 0; i < 9; i++) {
            if (board[row][i] == num) {
                return false;
            }
        }

        int mainboxrow = row / 3 * 3;
        int mainboxcol = col / 3 * 3;

        for (int i = mainboxrow; i < mainboxrow + 3; i++) {
            for (int j = mainboxcol; j < mainboxcol + 3; j++) {
                if (board[i][j] == num) {
                    return false;
                }
            }
        }

        return true;
    }

    // public static void main(String[] args) {
    // char[][] grid = new char[9][9];
    // Scanner sc=new Scanner(System.in);
    // for(int i=0;i<9;i++)
    // {
    // for(int j=0;j<9;j++)
    // {
    // grid[i][j]=sc.nextChar();
    // }
    // }
    // }

}