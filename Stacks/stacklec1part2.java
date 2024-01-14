import java.util.Stack;

public class stacklec1part2 {

    public static void reverse(Stack<Integer> st1, Stack<Integer> st2, Stack<Integer> st0) {
        while (!st0.isEmpty()) {
            st1.push(st0.peek());
            st0.pop();
        } // here idk why but the global stack st is being emptied, call by value is not
          // being followd here rather pass by reference is working

        System.out.println(st1);// reverse

        while (st1.isEmpty() == false) {
            // st2.push(st1.peek());
            // st1.pop();

            st2.push(st1.pop());// does the same thing.
        }

        System.out.println(st2);// again the same st copied in st2
    }

    public static void insertEleInIndexIn_st(int index, Stack<Integer> rt, int element) {
        Stack<Integer> arr = new Stack<Integer>();

        // Pop elements from rt and push them to arr until the desired index is reached
        while (rt.size() > index) {
            arr.push(rt.pop());
        }

        // Push the new element at the desired index
        rt.push(element);

        // Push back the elements from arr to rt
        while (!arr.isEmpty()) {
            rt.push(arr.pop());
        }

        // Print the entire stack
        System.out.println(rt);
    }

    public static void reverse_recursion(Stack<Integer> st2) {// here although a new stack<Iteger> is not created but
                                                              // the call stack still uses up memory so here aswell the
                                                              // spacecomplexity is not less than O(n) and here the time
                                                              // is O(n)
        if (st2.size() == 0) {
            return;
        }
        int top = st2.pop();
        System.out.print(top + " ");
        reverse_recursion(st2);
        st2.push(top);// st2 is not chaged or emptied as all the same elemebts are pushed back into
                      // the st2
    }

    public static void insertAtAnIndexUsingRecursion(Stack<Integer> st2, int index, int element) {
        if (st2.size() == index) {
            st2.push(element);
            return;
        }
        int top = st2.pop();
        insertAtAnIndexUsingRecursion(st2, index, element);
        st2.push(top);
    }

    public static void reverse_the_stack_properly_Using_recursion(Stack<Integer> st2) {
        if (st2.size() == 1) {
            return;
        }

        int top = st2.pop();
        reverse_the_stack_properly_Using_recursion(st2);// this basically asks the recursion to reverse the stack after
                                                        // the top element is popped

        insertAtAnIndexUsingRecursion(st2, 0, top);// after the rest of stack is reversed then the top element is being
                                                   // inserted at the bottom
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(4);
        st.push(87);
        st.push(-9);
        st.push(45);
        st.push(8);
        st.push(-933);

        System.out.println(st);

        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();

        reverse(st1, st2, st);

        insertEleInIndexIn_st(2, st2, 325);

        System.out.println(st2);// now st2 has changed

        reverse_recursion(st2);
        System.out.println();
        System.out.println(st2);

        insertAtAnIndexUsingRecursion(st2, 2, 0);
        System.out.println(st2);

        reverse_the_stack_properly_Using_recursion(st2);
        System.out.println(st2);

    }
}
