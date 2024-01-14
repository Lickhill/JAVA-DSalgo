import java.util.*;

public class tilingproblem {

    public static int tilesformat(int row, int col, int tilecol) {
        if (row < col)
            return 1;
        if (row == col)
            return 2;
        // hori+vert
        return tilesformat(row - 1, col, tilecol) + tilesformat(row - col, col, tilecol);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows in the floor");
        int row = sc.nextInt();
        System.out.println("Enter the number of column in the floor");
        int col = sc.nextInt();
        int tilecol = col;
        System.out.println(tilesformat(row, col, tilecol));
    }
}