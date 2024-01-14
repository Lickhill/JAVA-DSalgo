public class insertionsort {

    static void insertionsorting(int arr[]) {// best time O(n) only when the array is already sorted
                                             // worst is O(n square)
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int j = i;
            while (j > 0 && arr[j] < arr[j - 1]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }
    }

    public static void main(String args[]) {

        int a[] = { 5, 4, 6, 1, 3 };

        insertionsorting(a);
        for (int ele : a) {
            System.out.print(ele + " ");
        }

    }
}
