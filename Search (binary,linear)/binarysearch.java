public class binarysearch {

    static void print(int arr[]) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();

    }

    // linear search is O(n) -->if n==Math.pow(10,8) then time complex is pow(10,8)
    // binary search is O(log n base 2)--> if n==Math.pow(10,8) then time complex is
    // around 29.
    static int binarysearching(int arr[], int start, int end, int target) {
        if (arr.length == 1)
            return 0;// we can also use (start+end)/2 but what if start + end value overflws the
                     // limit of int which is Math.pow(2,31) -1
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    static int firstindexoftarget_binarysearching(int arr[], int start, int end, int target) {
        if (arr.length == 1)
            return 0;// we can also use (start+end)/2 but what if start + end value overflws the
                     // limit of int which is Math.pow(2,31) -1
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                while (arr[mid] == arr[mid - 1]) {
                    mid--;
                }
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    static int lastindexoftarget_binarysearching(int arr[], int start, int end, int target) {
        if (arr.length == 1)
            return 0;// we can also use (start+end)/2 but what if start + end value overflws the
                     // limit of int which is Math.pow(2,31) -1
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                // while (arr[mid] == arr[mid - 1]) {
                // mid++;
                // }
                ans = mid;
                start = mid + 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

    static int binarysearch_recursion(int arr[], int target, int start, int end, int ans) {
        if (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                binarysearch_recursion(arr, target, start, mid - 1, ans);
            } else {
                binarysearch_recursion(arr, target, mid + 1, end, ans);
            }
        }
        return ans;
    }

    public static void main(String args[]) {
        int arr[] = { -81, 2, 3, 4, 4, 4, 4, 6, 78 };
        System.out.println(binarysearching(arr, 0, arr.length - 1, 6));
        System.out.println(firstindexoftarget_binarysearching(arr, 0, arr.length - 1, 4));
        System.out.println(lastindexoftarget_binarysearching(arr, 0, arr.length - 1, 4));
        System.out.println(binarysearch_recursion(arr, 4, 0, arr.length - 1, -1));
    }
}
