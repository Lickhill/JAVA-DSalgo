public class search_min_ele_in_roated_sorted_array {

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

    static int search_min_ele_in_roated_sorted_arr(int arr[], int start, int end) {
        // we can do linear seach--> O(n)--> worst case
        // we can check for fucntion arr[i]<arr[i-1] then index of min ele is i and ele
        // is arr[i] since we find a jerk in the continuous inc of sorted array at
        // i. and since the first ele of second sorted part of the array is the min
        // ele.-->O(n)-->worst case
        // so we use binary search
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < arr[mid - 1]) {
                ans = mid;
                return ans;
            } else if (arr[mid] > arr[0]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;

    }

    static int search_the_index_of_jerk_in_roated_sorted_arr_with_duplicates(int arr[], int start, int end) {
        int ans = 0;
        int j = 2;
        while (true) {
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (arr[mid] >= arr[mid - 1] && arr[mid] <= arr[mid + 1]) {
                    start = mid + 2;
                } else if (arr[mid] >= arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                    ans = mid + 1;
                    return ans - 1;
                } else {
                    ans = mid;
                    return ans - 1;
                }
            }
            if (ans != 0)
                break;
            else {
                start = 0;
                end = arr.length / j - 1;
                j *= 2;

            }
        }
        return ans - 1;
    }

    static void index_of_target_in_rotated_sortedarray(int arr[], int target, int start, int end) {
        int ans = search_min_ele_in_roated_sorted_arr(arr, start, end);// O(log n)
        if (arr[ans] < target && arr[0] < target) {
            System.out.println(binarysearching(arr, 0, ans - 1, target));// O(log n));
        } else {
            System.out.println(binarysearching(arr, ans + 1, arr.length - 1, target));
        }
    }

    public static void main(String args[]) {
        int arr[] = { 5, 6, 7, 8, 9, 10, 1, 2, 3, 4 };
        int arr2[] = { 0, 0, 1, 1, 1, 2, 2, 2, 0, 0 };
        int arr3[] = { 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        // 1 time rotated sorted array is {2,3,4,5,6,7,8,9,10,1}
        // 2 time rotated sorted array is {3,4,5,6,7,8,9,10,1,2}
        // 3 time rotated sorted array is {4,5,6,7,8,9,10,1,2,3}
        System.out.println(search_min_ele_in_roated_sorted_arr(arr, 0, arr.length - 1));

        index_of_target_in_rotated_sortedarray(arr, 4, 0, arr.length - 1);

        System.out.println(search_the_index_of_jerk_in_roated_sorted_arr_with_duplicates(arr3, 0, arr3.length - 1));
        System.out.println(search_the_index_of_jerk_in_roated_sorted_arr_with_duplicates(arr2, 0, arr2.length - 1));

    }

}
