public class n_knights {
    public static void main(String[] args) {
        int n = 4;
        char[][] board = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        helper(board, 0, 0, 0);
    }

    public static void helper(char board[][], int row, int col, int max) {
        int n = board.length;
        if (row == n && max >= n) {
            if (max >= n) {
                System.out.println(max);
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        System.out.print(board[i][j] + " ");
                    }
                    System.out.println();
                }
                System.out.println();

                return;
            }
        }

        else if (issafe(board, row, col, n)) {
            board[row][col] = 'K';

            if (col != n - 1)
                helper(board, row, col + 1, max + 1);
            else
                helper(board, row + 1, 0, max + 1);

            board[row][col] = '.';
        }

        if (col != n - 1)
            helper(board, row, col + 1, max);
        else
            helper(board, row + 1, 0, max);

    }

    public static boolean issafe(char board[][], int row, int col, int n) {
        // top right
        int i = row;
        int j = col;
        i = i - 2;
        j++;
        if (i >= 0 && j < n) {
            if (board[i][j] == 'K') {
                return false;
            }
        }

        // top left
        i = row;
        j = col;
        i = i - 2;
        j--;
        if (i >= 0 && j >= 0) {
            if (board[i][j] == 'K') {
                return false;
            }
        }

        // bottom right
        i = row;
        j = col;
        i = i + 2;
        j++;
        if (i < n && j < n) {
            if (board[i][j] == 'K') {
                return false;
            }
        }

        // bottom left
        i = row;
        j = col;
        i = i + 2;
        j--;
        if (i < n && j >= 0) {
            if (board[i][j] == 'K') {
                return false;
            }
        }

        // left top
        i = row;
        j = col;
        j = j - 2;
        i--;
        if (i >= 0 && j >= 0) {
            if (board[i][j] == 'K') {
                return false;
            }
        }

        // left bottom
        i = row;
        j = col;
        j = j - 2;
        i++;
        if (i < n && j >= 0) {
            if (board[i][j] == 'K') {
                return false;
            }
        }

        // right top
        i = row;
        j = col;
        j = j + 2;
        i--;
        if (i >= 0 && j < n) {
            if (board[i][j] == 'K') {
                return false;
            }
        }

        // right bottom
        i = row;
        j = col;
        j = j + 2;
        i++;
        if (i < n && j < n) {
            if (board[i][j] == 'K') {
                return false;
            }
        }
        return true;
    }
}
