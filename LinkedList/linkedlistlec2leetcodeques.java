public class linkedlistlec2leetcodeques {

    public static class Node {
        Node next;
        int data;

        Node(int data) {
            this.data = data;
        }
    }

    public static class linkedlistques {

        Node head = null;
        Node tail = null;
        Node head2 = null;
        Node tail2 = null;

        int get_nth_ele_from_last(int index) {// O(n square)
            Node temp = head;// nth from end = size()-index or lastindex-index+1 position from beginning

            for (int i = 1; i <= size() - index; i++) {
                temp = temp.next;
            }
            return temp.data;
        }

        int get_nth_ele_from_lastmethod2(int index) {// O(n)
            Node fast = head;
            Node slow = head;

            for (int i = 1; i <= index; i++) {
                fast = fast.next;
            }
            while (fast != null) {
                slow = slow.next;
                fast = fast.next;
            }
            return slow.data;
        }

        void delete_nth_from_end(int index) {
            Node fast = head;
            Node slow = head;

            for (int i = 1; i <= index; i++) {
                fast = fast.next;
            }
            if (fast == null) {
                head = head.next;
                display();
                return;
            }
            while (fast.next != null) {
                slow = slow.next;
                fast = fast.next;
            }

            slow.next = slow.next.next;
            display();
        }

        void check_the_element_from_which_boht_the_linkedlist_continous_to_have_same_elements() {
            Node temp1 = head;
            Node temp2 = head2;
            if (size() > size2()) {
                for (int i = 1; i <= size() - size2(); i++) {
                    temp1 = temp1.next;
                }

            }
            if (size() < size2()) {
                for (int i = 1; i <= size2() - size(); i++) {
                    temp2 = temp2.next;
                }

            }
            // while (temp1 != null) {
            // if (temp1.data == temp2.data) {
            // int ans = temp1.data;
            // System.out.println(ans);
            // return;
            // } else {
            // temp1 = temp1.next;
            // temp2 = temp2.next;
            // }
            while (temp1.data != temp2.data) {
                temp1 = temp1.next;
                temp2 = temp2.next;
            }
            System.out.println(
                    "the_element_from_which_boht_the_linkedlist_continous_to_have_same_elements is:" + temp1.data);

        }

        void find_the_mid_ele_of_linkedlist()// condition is that time complexity should be O(n) not more
        {
            Node fast = head;
            Node slow = head;

            while (fast.next != null && fast.next.next != null) {
                fast = fast.next.next;
                slow = slow.next;
            }
            System.out.println("the mid ele of this linkedlist is: " + slow.data);
        }

        void delete_the_mid_ele() {
            if (head.next == null) {
                head = head.next;
                return;
            }
            if (head.next.next == null) {
                head = head.next;
                return;
            }
            Node fast = head.next;
            Node slow = head;

            while (fast.next != null && fast.next.next != null && fast.next.next.next != null) {
                fast = fast.next.next;
                slow = slow.next;
            }
            slow.next = slow.next.next;
            display();

        }

        public static Node reverse(Node head) {
            if (head.next == null) {
                System.out.println();
                return head;
            }
            Node newhead = reverse(head.next);
            head.next.next = head;
            head.next = null;
            return newhead;
        }

        public static Node reverse_iterative_method(Node head) {
            Node prev = null;
            Node curr = head;
            Node agla = head;

            while (curr != null) {
                agla = curr.next;
                curr.next = prev;
                prev = curr;
                curr = agla;
            }
            return prev;
        }

        void display3(Node head) {
            if (head == null)
                return;
            System.out.print(head.data + " ");
            display3(head.next);
        }

        int size() {
            int count = 0;
            Node temp = head;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
        }

        int size2() {
            int count = 0;
            Node temp = head2;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
        }

        void insert_ele(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
            } else {
                tail.next = temp;
            }
            tail = temp;

        }

        void insert_ele2(int val) {
            Node temp = new Node(val);
            if (head2 == null) {
                head2 = temp;
            } else {
                tail2.next = temp;
            }
            tail2 = temp;

        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
            // System.out.println("\n" + size() + "\n");
        }

        void display2() {
            Node temp = head2;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
            // System.out.println("\n" + size() + "\n");
        }

    }

    public static void main(String args[]) {
        linkedlistques obj = new linkedlistques();

        // for (int i = 0; i < 30; i += 3) {
        // obj.insert_ele(i);
        // }
        // obj.insert_ele(30);
        // obj.display();

        // for (int i = 8; i < 10; i += 2) {
        // obj.insert_ele2(i);
        // }
        // for (int i = 12; i < 30; i += 3) {
        // obj.insert_ele2(i);
        // }
        // obj.insert_ele2(30);
        // obj.display2();

        // System.out.println(obj.get_nth_ele_from_last(10));
        // System.out.println(obj.get_nth_ele_from_lastmethod2(10));
        // obj.delete_nth_from_end(10);
        // obj.delete_nth_from_end(7);

        // obj.check_the_element_from_which_boht_the_linkedlist_continous_to_have_same_elements();

        // obj.find_the_mid_ele_of_linkedlist();

        // obj.delete_the_mid_ele();

        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8);
        Node e = new Node(45);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;

        obj.display3(a);// hear a is head is 5 and rest continuous

        a = obj.reverse(a);// hear a is tail is 45 and rest continuous till 5
        obj.display3(a);

        a = obj.reverse_iterative_method(a);// hear a is head is 5 and rest continuous since head from 45 to 5 reversed
                                            // by this iteratice method
        System.out.println();
        obj.display3(a);

    }

}
