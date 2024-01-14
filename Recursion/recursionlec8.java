import java.lang.reflect.Array;
import java.util.ArrayList;

public class recursionlec8 {

    static ArrayList<String> permutation(String str, int index) {
        ArrayList<String> ans = new ArrayList<>();
        if (index >= str.length()) {
            ans.add("");
            return ans;
        }

        ArrayList<String> newans = permutation(str, index + 1);
        for (String s : newans) {
            ans.add(s);
            ans.add(str.charAt(index) + s);
        }
        return ans;
    }

    static void separately_subs(String str, int index, String ans) {
        if (index >= str.length()) {
            System.out.println(ans);
            return;
        }
        separately_subs(str, index + 1, ans + str.charAt(index));
        separately_subs(str, index + 1, ans);

    }

    static void sum_of_elements_of_all_Substring(int arr[], int index, int sum) {
        if (index >= arr.length) {
            System.out.println(sum);
            return;
        }

        sum_of_elements_of_all_Substring(arr, index + 1, sum + arr[index]);
        sum_of_elements_of_all_Substring(arr, index + 1, sum);
    }

    public static void main(String args[]) {
        ArrayList<String> list = new ArrayList<>();
        String str = "abc";
        int arr[] = new int[] { 2, 4, 5 };
        System.out.println(permutation(str, 0));// print the arraylist of subsequences

        for (int i = 0; i < permutation(str, 0).size(); i++) {
            System.out.println(permutation(str, 0).get(i));// print all subsequences separately
        }

        System.out.println();

        separately_subs(str, 0, "");

        sum_of_elements_of_all_Substring(arr, 0, 0);

    }
}
