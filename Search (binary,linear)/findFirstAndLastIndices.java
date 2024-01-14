import java.util.ArrayList;

public class findFirstAndLastIndices {
    static ArrayList<Integer> firstandlast(int arr[], int target, int index, ArrayList<Integer> ans, int temp) {
        if (index < 0 || ans.size() == 2)
            return ans;

        if (arr[index] == target) {
            ans.add(index);
            index = arr.length;
            temp = -1;
        }
        return firstandlast(arr, target, index + temp, ans, temp);

    }

    public static void main(String args[]) {
        int a[] = new int[] { 10, 4, 4, 4, 4, 60, -9, 80, -9, -9, 98 };
        int target = -9;
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(firstandlast(a, target, 0, list, 1));

    }
}