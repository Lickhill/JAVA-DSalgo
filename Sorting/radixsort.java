public class radixsort {// total time compelxity is d*(4*O(n)+10+const)==d*O(n)

    static void display(int arr[]) {// time--> O(n)
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    static int findthemaxele(int arr[]) {// time--> O(n)
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i])
                max = arr[i];
        }
        return max;
    }

    static void countarray(int arr[], int digit, int j) {// time--> 10 iterations
        int count[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            count[(arr[i] / j) % 10]++;// 10 times run
        }

        newcountcumulative(count, arr, j, digit);
    }

    static void newcountcumulative(int count[], int arr[], int j, int digit) {// O(n)

        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        newarray(count, arr, j, digit);
    }

    static void newarray(int count[], int arr[], int j, int digit) {// tota time --> 2*O(n) approx is O(n)
        int newarr[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {// time --> O(n)
            newarr[i] = arr[i];
        }

        for (int i = newarr.length - 1; i >= 0; i--) {// time-->O(n)
            arr[count[(newarr[i] / j) % 10] - 1] = newarr[i];
            count[(newarr[i] / j) % 10]--;
        }
        if (j == Math.pow(10, digit - 1))// const time
            display(arr);
    }

    static void radix(int arr[]) {
        int max = findthemaxele(arr);
        int count = 0;
        while (max > 0) {// time--> O(d) d is the number of digits in the max number
            max /= 10;
            count++;
        }
        int j = 1;
        for (int i = 1; i <= count; i++) {// time--> O(d) d is the number of digits in the max number
            countarray(arr, count, j);
            j *= 10;
        }

    }

    public static void main(String args[]) {
        // int arr[] = { 5, 4, 6, 7, 8, 4, 3, 12, 0, 8, 4, 5, 4, 4 };
        int arr[] = { 17, 2, 45, 807, 0, 89, 345, 32, 6, 7, 8, 34567 };
        // int arr[] = { 2, 3, 2, 4, 0, 1, 4, 1, 0, 2 };
        radix(arr);

    }

}
