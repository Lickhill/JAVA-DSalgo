public class countsortmethod2 {

    static void display(int arr[]) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    static int findthemaxele(int arr[]) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i])
                max = arr[i];
        }
        return max;
    }

    static void countarray(int arr[]) {
        int count[] = new int[findthemaxele(arr) + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        display(count);
        newcountcumulative(count, arr);
    }

    static void newcountcumulative(int count[], int arr[]) {

        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }
        display(count);
        newarray(count, arr);
    }

    static void newarray(int count[], int arr[]) {
        int newarr[] = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            newarr[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }
        display(newarr);
    }

    public static void main(String args[]) {
        int arr[] = { 5, 4, 6, 7, 8, 4, 3, 12, 0, 8, 4, 5, 4, 4 };
        // int arr[] = { 6, 4, 6, 1, 1, 4, 6, 4, 4, 3 };
        // int arr[] = { 2, 3, 2, 4, 0, 1, 4, 1, 0, 2 };
        countarray(arr);

    }

}
