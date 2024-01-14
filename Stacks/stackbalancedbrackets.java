import java.util.Stack;

public class stackbalancedbrackets {

    public static Boolean isbalance(String str) {
        Stack<Character> st = new Stack<>();
        int n = str.length();
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (ch == '(') {
                if (i == n - 1) {
                    return false;
                }
                st.push(ch);
            } else {
                if (st.isEmpty())
                    return false;
                st.pop();
            }
        }
        if (st.isEmpty() == false) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "(())())(()()))";

        System.out.println(isbalance(str));
    }
}
