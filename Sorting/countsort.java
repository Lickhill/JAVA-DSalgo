public class countsort {

    static void display(int arr[]) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    static void swap(int arr[], int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
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
        int i = 0, j = 0;

        while (i < count.length) {
            if (count[i] != 0) {
                for (int k = 0; k < count[i]; k++) {
                    arr[j] = i;
                    j++;
                }
                i++;
            } else
                i++;
        }
        display(arr);
    }

    public static void main(String args[]) {
        int arr[] = { 5, 4, 6, 7, 8, 4, 3, 12, 0, 8, 4, 5, 4, 4 };
        countarray(arr);

    }
}