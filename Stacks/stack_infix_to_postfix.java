import java.util.Stack;

public class stack_infix_to_postfix {
    public static String equation(String str) {
        Stack<String> st = new Stack<>();
        Stack<Character> op = new Stack<>();

        int i;
        for (i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            int ascii = (int) ch;

            if (ascii >= 48 && ascii <= 57)// '0'-->48 & '9'-->57 is ascii
            {
                String cha = "" + ch;
                st.push(cha);
            } else if (op.size() == 0 || ch == '(' || op.peek() == '(') {
                op.push(ch);
            } else {
                if (ch == '+' || ch == '-' || ch == ')') {
                    String v2 = st.pop();
                    String v1 = st.pop();
                    st.push(v1 + v2 + op.peek());
                    op.pop();
                    op.push(ch);
                }

                if (ch == '*' || ch == '/') {

                    if (op.peek() == '*' || op.peek() == '/') {
                        String v2 = st.pop();
                        String v1 = st.pop();
                        st.push(v1 + v2 + op.peek());
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
                String v2 = st.pop();
                String v1 = st.pop();

                st.push(v1 + v2 + op.peek());
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
