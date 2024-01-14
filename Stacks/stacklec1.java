import java.util.Stack;

public class stacklec1 {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        System.out.println(st.isEmpty());

        st.push(4);
        st.push(87);
        st.push(-9);
        st.push(45);
        st.push(8);
        st.push(-933);

        System.out.println("top ele:" + st.peek());

        System.out.println(st);

        st.pop();// pops the top most i.e tha last in ele i.e -933
        System.out.println(st);
        System.out.println("size is: " + st.size());

        // get the index 1 ele
        int index = 1;
        while (st.size() > index + 1) {// because of this now all the stack ele till index 1 is gone
            st.pop();
        }
        System.out.println(st.peek());

        System.out.println(st);// since we popped all the ele form size()-1 index to index =1;

        System.out.println(st.isEmpty());
    }
}