import java.util.*;

public class stacks_nextgreaternumber {

    public static int[] function(int[] arr) {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int res[] = new int[n];

        st.push(arr[n - 1]);
        res[n - 1] = -1;

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > st.peek()) {
                st.pop();
                st.push(arr[i]);
                res[i] = -1;
            } else {
                if (arr[i] < arr[i + 1]) {
                    res[i] = arr[i + 1];
                } else if (arr[i] < res[i + 1]) {
                    res[i] = res[i + 1];
                } else {
                    res[i] = st.peek();
                }
            }
        }
        return res;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 5, 3, 2, 1, 6, 3, 4 };

        int res[] = function(arr);

        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}