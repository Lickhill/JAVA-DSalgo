import java.util.ArrayList;
import java.util.Collections;

public class bucketsort {

    public static void display(double[] arr) {
        for (double val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static void bucketSort(double[] arr) {
        if (arr.length == 0) {
            return;
        }

        int n = arr.length;
        ArrayList<Double>[] buckets = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            buckets[i] = new ArrayList<>();
        }

        for (int i = 0; i < n; i++) {
            int bucketIndex = (int) (n * arr[i]);
            buckets[bucketIndex].add(arr[i]);
        }

        for (int i = 0; i < n; i++) {
            Collections.sort(buckets[i]);// sorting
        }

        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < buckets[i].size(); j++) {
                arr[index++] = buckets[i].get(j);
            }
        }
    }

    public static void main(String args[]) {
        double[] arr = { 0.8, 0.2, 0.5, 0.1, 0.6, 0.9, 0.3, 0.7, 0.4 };
        // double[] arr = { 8, 2, 5, 1, 6, 9, 3, 7, 4 };

        bucketSort(arr);
        display(arr);
    }

}
