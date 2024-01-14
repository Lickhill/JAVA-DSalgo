public class stack_array_implementation {
    public static class Arr {
        int arr[];
        int top;
        int size;

        Arr(int n) {
            size = n;
            top = -1;
            arr = new int[size];
        }

        void push(int element) {
            if (top == size - 1) {
                System.out.println("Stack is full!");
                return;
            }
            top++;
            arr[top] = element;

        }

        int pop() {
            if (top == -1) {
                System.out.println("Stack is empty!");
                return -999;
            }
            int temp = arr[top];
            top--;
            return temp;
        }

        void peek() {
            if (top == -1) {
                System.out.println("[]");
                return;
            }
            System.out.println(arr[top]);
        }

        void display() {
            int i = 0;
            while (i <= top) {
                System.out.print(arr[i] + " ");
                i++;
            }
            System.out.println();
        }

        int size() {
            int count = 0;
            int flag = top;
            while (top >= 0) {
                count++;
                top--;
            }
            top = flag;
            return count;
        }

    }

    public static void main(String[] args) {
        Arr st = new Arr(5);

        st.push(87);
        st.push(65);
        st.display();
        System.out.println(st.size());

        st.push(76);
        st.push(5);
        st.display();
        st.push(0);
        st.display();
        st.push(-98);// this is the 6th ele so cannot be pushed hence gets a msg Stack is full!
        st.display();// displayed the stack without -98

        st.pop();// popped 0 from the top of stack not -98 since -98 wa never pushed due to stack
                 // overflow
        st.display();

        st.peek();
    }
}
