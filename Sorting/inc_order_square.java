import java.util.*;

public class inc_order_square {// without the use of sorting technique i.e by the use of two pointer

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void reverse(int[] arr, int size) {
        int left = 0, right = size - 1;
        while (left < right) {
            if (arr[left] > arr[right]) {
                swap(arr, left, right);
                left++;
                right--;
            }
        }
    }

    public static void print(int[] arr, int size) {
        int i;
        for (i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void actualjobfunctoin(int[] arr, int size, int[] krr) {// the use of two pointer technique
        int k = 0;
        int left = 0, right = size - 1;
        while (left <= right) {
            if (Math.abs(arr[left]) > Math.abs(arr[right])) {
                krr[k] = arr[left] * arr[left];
                k++;
                left++;
            } else {
                krr[k] = arr[right] * arr[right];
                k++;
                right--;
            }
        }
        reverse(krr, size);

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int krr[] = new int[n];
        System.out.println("Enter the array elements:");
        int i;
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The original array is:");
        print(arr, n);
        System.out.println("The inc order square array is:");
        actualjobfunctoin(arr, n, krr);
        print(krr, n);

    }
}
