import java.util.Stack;

public class Stack_algebra_solver_method2 {

    public static int equation(String str) {
        Stack<Integer> st = new Stack<>();
        Stack<Character> op = new Stack<>();

        int i;
        for (i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            int ascii = (int) ch;

            if (ascii >= 48 && ascii <= 57)// '0'-->48 & '9'-->57 is ascii
            {
                st.push(ascii - 48);
            } else if (op.size() == 0 || ch == '(' || op.peek() == '(') {
                op.push(ch);
            } else {
                if (ch == '+' || ch == '-' || ch == ')') {
                    int v2 = st.pop();
                    int v1 = st.pop();
                    if (op.peek() == '+')
                        st.push(v1 + v2);
                    if (op.peek() == '-')
                        st.push(v1 - v2);
                    if (op.peek() == '*')
                        st.push(v1 * v2);
                    if (op.peek() == '/')
                        st.push(v1 / v2);
                    op.pop();
                    op.push(ch);
                }

                if (ch == '*' || ch == '/') {

                    if (op.peek() == '*' || op.peek() == '/') {
                        int v2 = st.pop();
                        int v1 = st.pop();
                        if (op.peek() == '*')
                            st.push(v1 * v2);
                        if (op.peek() == '/')
                            st.push(v1 / v2);
                        op.pop();
                        op.push(ch);
                    } else {
                        op.push(ch);
                    }

                }
            }
        }

        while (!op.isEmpty()) {
            if (op.peek() != '(' && op.peek() != ')') {

                int v2 = st.pop();
                int v1 = st.pop();

                if (op.peek() == '+')
                    st.push(v1 + v2);
                if (op.peek() == '-')
                    st.push(v1 - v2);

                if (op.peek() == '*')
                    st.push(v1 * v2);
                if (op.peek() == '/')
                    st.push(v1 / v2);
            }
            op.pop();
        }
        return st.peek();
    }

    public static void main(String[] args) {
        String str = "8-(5+3)*4/6";

        System.out.println(equation(str));

    }
}
