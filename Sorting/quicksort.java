public class quicksort {

    static void display(int arr[]) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }

    static void swap(int arr[], int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    static int partition(int arr[], int start, int end) {

        int cnt = 0;
        for (int i = start + 1; i <= end; i++) {
            if (arr[i] <= arr[start])
                cnt++;
        }
        int pivotindex = start + cnt;
        swap(arr, start, pivotindex);

        while (start < pivotindex && end > pivotindex) {
            while (arr[start] <= arr[pivotindex])
                start++;
            while (arr[end] > arr[pivotindex])
                end--;
            if (start < pivotindex && end > pivotindex) {
                swap(arr, start, end);
                start++;
                end--;
            }
        }
        return pivotindex;
    }

    // static void partition(int arr[], int pivotindex, int start, int end) {
    // while (start < pivotindex && end > pivotindex) {
    // while (arr[start] <= arr[pivotindex])
    // start++;
    // while (arr[end] > arr[pivotindex])
    // end--;
    // if (start < pivotindex && end > pivotindex) {
    // swap(arr, start, end);
    // start++;
    // end--;
    // }
    // }
    // return;
    // }

    // static int pivotindexfinder(int arr[], int start, int end) {
    // int cnt = 0;
    // for (int i = start + 1; i <= end; i++) {
    // if (arr[i] <= arr[start])
    // cnt++;
    // }
    // int pivotindex = start + cnt;
    // swap(arr, start, pivotindex);
    // partition(arr, pivotindex, start, end);
    // return pivotindex;
    // }

    static void quicksorting(int arr[], int start, int end) {
        if (start >= end)
            return;
        int pi = partition(arr, start, end);
        quicksorting(arr, start, pi - 1);
        quicksorting(arr, pi + 1, end);

    }

    public static void main(String args[]) {
        int arr[] = { 6, 6, 3, 1, 5, 5, 4, 5, 6, 7, 34, 56, -9, 0 };
        quicksorting(arr, 0, arr.length - 1);
        display(arr);

    }
}