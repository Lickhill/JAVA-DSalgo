public class recursionlec5 {

    static void printarrayelements(int arr[], int size) {
        if (size < 0)
            return;

        printarrayelements(arr, size - 1);
        System.out.println(arr[size]);
    }

    static int maxelementinarray(int arr[], int max, int index, int size) {
        if (size == 0)
            return max;

        if (max < arr[size])
            max = arr[size];
        return maxelementinarray(arr, max, size, size - 1);
    }

    static int maxInArraypart2(int arr[], int index) {// second method for finding max element in array
        if (index == arr.length - 1)
            return arr[index];

        return Math.max(arr[index], maxInArraypart2(arr, index + 1));// self work was index 0 ka nikal lena and usme se
                                                                     // math.max karke baki ka index 1 to arr.lenght-1
                                                                     // tak ka elements ka max se compare karna
    }

    static int sumOfArrayElements(int arr[], int index) {
        if (index == arr.length)
            return 0;

        return arr[index] + sumOfArrayElements(arr, index + 1);
    }

    public static void main(String args[]) {
        int arr[] = new int[] { 10, 20, 30, 40, 50, 9, -987, 23456 };
        printarrayelements(arr, arr.length - 1);
        System.out.println();
        System.out.println(maxelementinarray(arr, 0, 0, arr.length - 1));
        System.out.println(maxInArraypart2(arr, 0));
        System.out.println("sum of ele is : " + sumOfArrayElements(arr, 0));
    }
}