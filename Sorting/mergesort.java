public class mergesort {

    static void mergethesortedarray(int arr[], int l, int r, int mid) {
        int n1 = mid - l + 1;
        int n2 = r - mid;
        int left[] = new int[n1];
        int right[] = new int[n2];

        for (int i = 0; i < n1; i++) {
            left[i] = arr[l + i];
        }
        for (int j = 0; j < n2; j++) {
            right[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0, k = l;
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }
        while (i < n1) {
            arr[k++] = left[i++];
        }
        while (j < n2) {
            arr[k++] = right[j++];
        }
    }

    static void mergesorting(int arr[], int l, int r) {
        if (l >= r)
            return;

        int mid = (l + r) / 2;

        mergesorting(arr, l, mid);
        mergesorting(arr, mid + 1, r);

        mergethesortedarray(arr, l, r, mid);
    }

    static void print(int arr[]) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }

    public static void main(String args[]) {
        int arr[] = { 6, 5, 2, 7 };
        mergesorting(arr, 0, arr.length - 1);
        print(arr);
    }

}