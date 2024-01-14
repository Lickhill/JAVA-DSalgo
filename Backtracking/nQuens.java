public class nQuens {
    public static void main(String[] args) {
        int n = 4;
        Character board[][] = new Character[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        nqueens(board, 0);
    }

    private static void nqueens(Character[][] board, int row) {
        int n = board.length;
        if (row == n) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
            return;
        }

        for (int i = 0; i < n; i++) {
            if (isSafe(row, i, board)) {
                board[row][i] = 'Q';
                nqueens(board, row + 1);
                board[row][i] = '.';
            }
        }
    }

    private static boolean isSafe(int rows, int column, Character[][] board) {
        int n = board.length;
        int row = rows;
        int col = column;

        for (int i = 0; i < n; i++)// cheecking rows
        {
            if (board[row][i] == 'Q') {
                return false;
            }
        }

        for (int i = 0; i < n; i++)// checking cols
        {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        row = rows;
        col = column;
        while (row >= 0 && col < n)// chechking in the north east
        {
            if (board[row][col] == 'Q')
                return false;
            row--;
            col++;
        }

        row = rows;
        col = column;
        while (row >= 0 && col >= 0)// chechking in the north west
        {
            if (board[row][col] == 'Q')
                return false;
            row--;
            col--;
        }

        row = rows;
        col = column;
        while (row < n && col >= 0)// chechking in the south west
        {
            if (board[row][col] == 'Q')
                return false;
            row++;
            col--;
        }

        return true;
    }
}
