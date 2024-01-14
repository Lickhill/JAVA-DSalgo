import java.util.*;

public class example {

    // public static void sum(int num, int sum) {
    // if (num > 100) {
    // System.out.println(sum);
    // return;
    // }
    // sum += num;
    // sum(num + 1, sum);
    // }

    // public static void prdt(int num, int p) {
    // if (num > 5) {
    // System.out.println(p);
    // return;
    // }
    // p *= num;
    // prdt(num + 1, p);

    // }

    // public static void fibonacci(int num1, int num2, int c, int sum) {
    // if (c <= 0)
    // return;
    // sum = num1 + num2;
    // System.out.println(sum);
    // fibonacci(num2, sum, c - 1, sum);

    // }

    // public static void main(String args[]) {
    // Scanner sc = new Scanner(System.in);
    // // int n = 1;
    // // sum(n, 0);
    // // prdt(n, 1);
    // int a = 0, b = 1;
    // System.out.println("fibo of how many numbers?");
    // int number = sc.nextInt();
    // System.out.println("0 ");
    // System.out.println("1 ");
    // fibonacci(a, b, number - 2, 0);

    // =========================================================================================

    // StringBuilder sb = new StringBuilder("Jelo");
    // sb.setCharAt(0, 'S');
    // System.out.println(sb);
    // sb.insert(0, 's');
    // System.out.println(sb);

    // System.out.println("enter the size of array: ");
    // int n = sc.nextInt();
    // int[] arr = new int[n];
    // int i, j;
    // ---------------------------------------------------------------------------------------
    // for (i = 0; i < n; i++) {
    // arr[i] = sc.nextInt();
    // }

    // // unsorted array
    // System.out.println("the unsorted array is:");
    // for (i = 0; i < n; i++) {
    // System.out.println(arr[i]);
    // }

    // // sorted array
    // System.out.println("The sorted array is:");
    // for (i = 0; i < n; i++) {
    // for (j = i + 1; j < n; j++) {
    // while (true) {
    // if (arr[j] < arr[i]) {
    // int temp = arr[j];
    // arr[j] = arr[i];
    // arr[i] = temp;
    // } else {
    // break;
    // }
    // }
    // }
    // }
    // for (i = 0; i < n; i++) {
    // System.out.println(arr[i]);
    // }
    // ------------------------------------------------------------------------------------------------

    public static void towerOfHanoi(int n, String src, String helper, String dest) {
        if (n == 1) {
            System.out.println("transfer disk " + n + " from " + src + " to " + dest);
            return;
        }
        // transfer top n-1 from src to helper using dest as 'helper'
        towerOfHanoi(n - 1, src, dest, helper);
        // transfer nth from src to dest
        System.out.println("transfer disk " + n + " from " + src + " to " + dest);
        // transfer n-1 from helper to dest using src as 'helper'
        towerOfHanoi(n - 1, helper, src, dest);
    }

    public static void main(String args[]) {
        int n = 3;
        towerOfHanoi(n, "A", "B", "C");
    }
}
