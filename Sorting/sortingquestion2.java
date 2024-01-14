public class sortingquestion2 {// the array has no duplicates and only one swap will sort the array in
                               // ascending order

    static void swap(int arr[], int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    static void display(int arr[]) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    static void function(int arr[]) {// total time complexity is O(n)+ c1 + c2 == O(n) since ignore the smaller c1
                                     // and c2
        if (arr.length == 1)// base case
            return;

        int count = 0;
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {// O(n) time

            if (arr[i] > arr[i + 1]) {// const time let be c1
                if (temp == 0) {
                    count = i;
                    temp = i + 1;
                } else {
                    temp = i + 1;
                }
            }

        }
        swap(arr, count, temp);// const time let be c2
    }

    static void neg_followed_by_pos(int arr[]) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            if (arr[left] >= 0 && arr[right] < 0) {
                swap(arr, left, right);
                left++;
                right--;
            } else if (arr[left] < 0)
                left++;
            else if (arr[right] >= 0)
                right--;
            else {
                left++;
                right--;
            }
        }
    }

    // 0 - low == 0
    // low+1 - mid==1
    // mid+1-hig==unknown
    // high+1 - arr.length-1 == 2
    // plan is to slowly do pos++ -- and make unknown range contain no number and
    // mid becomes high so only three ranges in total containing 0 1 2 respectively
    static void zero_followedby_one_followedby_twos(int arr[]) {
        int low = 0, mid = 1, high = arr.length - 1;
        while (mid <= high) {
            if (arr[low] != 0 && arr[mid] == 0) {
                swap(arr, mid, low);
                low++;
            }
            if (arr[mid] == 2 && arr[high] != 2) {
                swap(arr, mid, high);
                high--;
            }
            if (arr[low] == 0)
                low++;
            if (arr[mid] == 1)
                mid++;
            if (arr[high] == 2)
                high--;

        }
    }
    // this can also be done with count sorting, make three variables count 0 1 2 so
    // that they hold the frequency of 0 1 and 2s and then do overwrite in the arr
    // but this way O(n) with three passes as we have to count the freq and then
    // again overwrite it in arr hence not very efficient

    public static void main(String args[]) {
        // int arr[] = { 3, 8, 6, 7, 5, 9, 10 };
        // int arr[] = { 3, 5, 6, 7, 9, 8, 10 };
        // int arr[] = { 9, 5, 6, 7, 8, 3, 10 };
        int arr[] = { 10, 5, 6, 7, 8, 9, 3 };
        // int arr[] = { 9 };
        int arr2[] = { 0, 9, -5, 567, -76, -7, -8, -4, 345, 9, 9 };
        int arr3[] = { 0, 1, 2, 0, 0, 1, 1, 2, 2, 0, 0, 2, 0, 2, 1, 0 };

        function(arr);
        display(arr);

        neg_followed_by_pos(arr2);
        display(arr2);

        zero_followedby_one_followedby_twos(arr3);
        display(arr3);

    }

}
