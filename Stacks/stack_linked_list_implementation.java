public class stack_linked_list_implementation {

    public static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    public static class llstack {
        Node head = null;

        void push(int element) {
            Node temp = new Node(element);
            temp.next = head;
            head = temp;

        }

        int pop() {
            if (head == null) {
                System.out.println("Stack is empty!");
                return -999;
            }
            int x = head.val;
            head = head.next;
            return x;

        }

        void display() {
            displayrev(head);
            System.out.println();
        }

        void displayrev(Node head) {
            Node temp = head;
            if (temp == null) {
                return;
            }
            displayrev(temp.next);
            System.out.print(temp.val + " ");
        }

        int size() {
            Node temp = head;
            int count = 0;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
        }

        void peek() {
            System.out.println(head.val);
        }
    }

    public static void main(String[] args) {

        llstack st = new llstack();

        st.push(87);
        st.push(65);
        st.display();
        System.out.println(st.size());

        st.push(76);
        st.push(5);
        st.display();
        st.push(0);
        st.display();
        st.push(-98);
        st.display();

        st.pop();

        st.display();

        st.peek();

    }
}
