import java.util.Stack;

public class stack_algebra_equation_solver {

    public static int bracket(String str, int i) {

        int count = 0;
        i = i + 1;
        String f = "";
        while (str.charAt(i) != ')') {
            if (str.charAt(i) == '(') {
                count++;
            }
            f = f + str.charAt(i);
            i++;
        }

        if (count > 0) {
            for (int j = 0; j < count; j++) {
                while (str.charAt(i) != ')') {
                    f = f + str.charAt(i + 1);
                    i++;
                }
            }
        }
        return equation(f, i);
    }

    public static int equation(String str, int k) {
        Stack<Integer> st = new Stack<>();
        Stack<Character> op = new Stack<>();

        int i;
        for (i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // if (ch == '(') {
            // st.push(bracket(str, i));
            // }

            if (ch == '(') {
                int count = 0;
                i = i + 1;
                String f = "";
                while (str.charAt(i) != ')') {
                    if (str.charAt(i) == '(') {
                        count++;
                    }
                    f = f + str.charAt(i);
                    i++;
                }

                if (count > 0) {
                    for (int j = 0; j < count; j++) {
                        while (str.charAt(i) != ')') {
                            f = f + str.charAt(i + 1);
                            i++;
                        }
                    }
                }
                st.push(equation(f, i));
            }

            int ascii = (int) ch;

            if (ascii >= 48 && ascii <= 57)// '0'-->48 & '9'-->57 is ascii
            {
                st.push(ascii - 48);
            } else if (op.size() == 0) {
                op.push(ch);
            } else {
                if (ch == '+' || ch == '-') {
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
        }
        return st.peek();
    }

    public static void main(String[] args) {
        String str = "8-(5+3)*4/6";

        System.out.println(equation(str, 0));

    }
}
