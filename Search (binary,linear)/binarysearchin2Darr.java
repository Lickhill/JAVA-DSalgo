public class binarysearchin2Darr {

    static void find_target_in_2d_Array(int arr[][], int start, int end, int target) {// we make 2d array to 1d since
                                                                                      // the 2d is sorted array
        int numofrows = arr.length;
        int numofcol = arr[0].length;
        int r = -1, c = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int midele = arr[mid / numofcol][mid % numofcol];// remember this code

            if (midele == target) {
                r = mid / numofcol;
                c = mid % numofcol;
            }

            if (midele > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        System.out.println("index of target in array is (" + r + "," + c + ")");
    }

    static boolean find_target_in_2d_Array_method2(int arr[][], int i, int j, int target) {
        while (i < arr.length && j >= 0) {
            if (arr[i][j] == target)
                return true;

            if (arr[i][j] < target)
                i++;
            else
                j--;
        }
        return false;
    }

    public static void main(String args[]) {
        int arr[][] = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
        find_target_in_2d_Array(arr, 0, (arr.length * arr[0].length) - 1, 34);
        System.out.println(find_target_in_2d_Array_method2(arr, 0, arr[0].length - 1, 34));

    }
}