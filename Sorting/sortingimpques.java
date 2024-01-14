public class sortingimpques {
    static void allzeroinlast(int arr[]) {// bubble sorting is the key
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] == 0 && arr[j + 1] != 0) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    static void lexicography_order(String arr[]) {
        int n = arr.length;

        int i, j;
        for (i = 0; i < n - 1; i++) {
            int min = i;
            for (j = i + 1; j < n; j++) {
                if (arr[min].compareTo(arr[j]) >= 0) {
                    min = j;
                }
            }
            String temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;

        }
    }

    public static void main(String args[]) {

        int a[] = { 9, 0, 8, 0, 7, 0, 4, 0, 5, 0, 0, 3, 4, 5, 0 };
        allzeroinlast(a);
        String arr[] = { "Likhil", "Adarsh", "Nitin", "Jay", "Amit" };
        for (int element : a) {
            System.out.print(element + " ");
        }
        System.out.println();

        lexicography_order(arr);
        for (String element : arr) {
            System.out.print(element + " ");
        }
    }
}