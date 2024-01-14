import java.util.Stack;

public class stack_postfix_to_infix_equation_solver {

    public static int equation(String str) {
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int ascii = (int) ch;

            if (ascii >= 48 && ascii <= 57)// '0'-->48 & '9'-->57 is ascii
            {
                st.push(ascii - 48);
            } else {
                int v2 = st.pop();
                int v1 = st.pop();
                if (ch == '+')
                    st.push(v1 + v2);
                if (ch == '-')
                    st.push(v1 - v2);
                if (ch == '*')
                    st.push(v1 * v2);
                if (ch == '/')
                    st.push(v1 / v2);
            }
        }
        return st.peek();
    }

    public static void main(String[] args) {
        String str = "853+4*6/-";

        System.out.println(equation(str));

    }

}
