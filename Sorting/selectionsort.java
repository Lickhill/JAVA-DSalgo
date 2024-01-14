public class selectionsort {

    static void selectionsorting(int arr[]) {
        int n = arr.length;

        // int min = arr[0]; we can use this al well instead of int min = arr[i]; this
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    static void selectionsorting2(int arr[]) {
        int n = arr.length;

        // int min = arr[0]; we can use this al well instead of int min = arr[i]; this
        for (int i = 0; i < n - 1; i++) {
            int minindex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[minindex] > arr[j]) {
                    minindex = j;
                }
            }
            int temp = arr[minindex];
            arr[minindex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String args[]) {
        int a[] = { 9, 3, 4, 5, 3, 8, 2, 4 };
        selectionsorting(a);
        for (int element : a) {
            System.out.print(element + " ");
        }

        System.out.println();

        selectionsorting2(a);
        for (int element : a) {
            System.out.print(element + " ");
        }
    }
}
