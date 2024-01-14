public class bubblesort {
    static void BubbleSort(int ar[]) {
        int n = ar.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (ar[j] > ar[j + 1]) {
                    int temp = ar[j];
                    ar[j] = ar[j + 1];
                    ar[j + 1] = temp;
                }
            }
        }
    }

    static void BubbleSort2(int ar[]) {// does the same sorting but due to flag check, if the array is already sorted
                                       // then it will just run for O(n) and then it will stop
        int n = ar.length; // best time complexity is O(n)
        Boolean flag = false;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (ar[j] > ar[j + 1]) {
                    int temp = ar[j];
                    ar[j] = ar[j + 1];
                    ar[j + 1] = temp;
                    flag = true;
                }
                if (!flag)
                    return;
            }
        }
    }

    public static void main(String args[]) {
        int a[] = { 6, 5, 4, 3, 2, 1, 0, 8 };
        BubbleSort(a);// as the func is void to by callin the func by giving the previous array it
                      // changes the elements
        for (int elements : a) {
            System.out.print(elements + " ");
        }
        System.out.println();
        BubbleSort2(a);
        for (int elements : a) {
            System.out.print(elements + " ");
        }
    }
}