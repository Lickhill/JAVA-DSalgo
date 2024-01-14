import java.util.Stack;

public class stack_prefix_to_postfix {

    public static String equation(String str) {
        Stack<String> st = new Stack<>();

        int i;
        for (i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);

            int ascii = (int) ch;

            if (ascii >= 48 && ascii <= 57)// '0'-->48 & '9'-->57 is ascii
            {
                String cha = "" + ch;
                st.push(cha);
            } else {
                String v1 = st.pop();
                String v2 = st.pop();
                st.push(v1 + v2 + ch);
            }
        }
        return st.peek();
    }

    public static void main(String[] args) {
        String str = "-8/*+5346";

        System.out.println(equation(str));

    }
}
