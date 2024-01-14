import java.util.Stack;

public class stack_postfix_to_infix {
    public static String equation(String str) {
        Stack<String> st = new Stack<>();

        int i;
        for (i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            int ascii = (int) ch;

            if (ascii >= 48 && ascii <= 57)// '0'-->48 & '9'-->57 is ascii
            {
                String cha = "" + ch;
                st.push(cha);
            } else {
                String v1 = st.pop();
                String v2 = st.pop();
                st.push("(" + v2 + ch + v1 + ")");
            }
        }
        return st.peek();
    }

    public static void main(String[] args) {
        String str = "853+4*6/-";

        System.out.println(equation(str));

    }
}
