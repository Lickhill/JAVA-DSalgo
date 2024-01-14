import java.util.*;

public class stack_removeConsecutiveSubsequences {

    public static int[] remove(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            st.push(arr[i]);
            while (i < n) {
                if (i + 1 < n && st.peek() == arr[i + 1]) {
                    count++;
                    i++;
                } else {
                    break;
                }
            }
            if (count > 0) {
                st.pop();
                count = 0;
            }
        }
        System.out.println(st);

        int res[] = new int[st.size()];
        int m = res.length;
        for (int i = m - 1; i >= 0; i--) {
            res[i] = st.pop();
        }

        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 3, 4, 4, 5, 6, 7, 8, 9, 9, 9, 0, 0, 0, 0, 0, 98 };
        int res[] = remove(arr);

        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
