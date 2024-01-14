import java.util.ArrayList;

public class FindAllIndicesOfArrayInArrayList {

    static ArrayList<Integer> findallindices(int arr[], int target, int index, ArrayList<Integer> ans) {
        if (index == arr.length) {
            return ans;
        }
        if (arr[index] == target) {
            ans.add(index);
        }
        return findallindices(arr, target, index + 1, ans);
    }

    public static void main(String args[]) {
        int a[] = new int[] { 10, 4, 4, 4, 4, 60, -9, 80, -9, -9, 98 };
        ArrayList<Integer> list = new ArrayList<>();
        int target = -9;
        System.out.println(findallindices(a, target, 0, list));
    }
}
