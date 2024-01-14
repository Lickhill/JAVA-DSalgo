import java.util.*;

public class pathcounter {

    public static int maze(int m, int n, int row, int col) {
        if (m == col - 1 || n == row - 1)
            return 1;

        return maze(m + 1, n, row, col) + maze(m, n + 1, row, col);

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the number of rows of the maze");
        int rows = sc.nextInt();
        System.out.println("\nEnter the number of column of the maze");
        int cols = sc.nextInt();
        System.out.println(maze(0, 0, rows, cols));
    }
}
