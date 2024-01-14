public class QuickSort2 {

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

    static int partition(int arr[], int pivotindex, int left, int right) {
        while (left <= right) {
            while (arr[left] <= arr[pivotindex])
                left++;
            while (arr[right] > arr[pivotindex])
                right--;
            if (left < right) {
                swap(arr, left, right);
                left++;
                right--;
            }
        }
        return pivotindex;
    }

    static int pivotindexfinder(int arr[], int start, int end) {
        int pivot = arr[start];
        int i = start;
        for (int j = start + 1; j <= end; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, start, i);
        return i;
    }

    static void quicksorting(int arr[], int start, int end) {
        if (start < end) {
            int pi = pivotindexfinder(arr, start, end);
            quicksorting(arr, start, pi - 1);
            quicksorting(arr, pi + 1, end);
        }
    }

    public static void main(String args[]) {
        int arr[] = { 6, 6, 3, 1, 5, 5, 4 };
        quicksorting(arr, 0, arr.length - 1);
        display(arr);
    }
}
