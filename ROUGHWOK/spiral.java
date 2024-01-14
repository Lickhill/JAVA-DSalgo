import java.util.*;

public class spiral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows");
        int n = sc.nextInt();
        System.out.println("Enter the coloumnss");
        int m = sc.nextInt();
        System.out.println("Enter the array elements");
        int i, j;
        int[][] arr = new int[n][m];
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        int rowstart = 0, rowend = 0, colstart = 0, colend = 0;
        i = 0;

        for (colstart = i; colstart < m - i; colstart++) {
            System.out.println(arr[rowstart][colstart] + " ");
        }
        colstart--;

        for (rowstart = i; rowstart < n - i; rowstart++) {
            System.out.println(arr[rowstart][colstart]);
        }
        rowstart--;

        for (; colstart >= 0 - i; colstart--) {
            System.out.println(arr[rowstart][colstart]);
        }
        colstart++;

        for (; rowstart > 0; rowstart--) {
            System.out.println(arr[rowstart][colstart]);
        }
        i++;

    }
}