public class doublylinkedlist {

    public static class Node {
        int val;
        Node next;
        Node prev;

        Node(int val) {
            this.val = val;
        }
    }

    public static class doublyll {

        void display(Node head) {
            Node temp = head;

            while (temp != null) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        void displayrev(Node tail) {
            Node temp = tail;

            while (temp != null) {
                System.out.print(temp.val + " ");
                temp = temp.prev;
            }
            System.out.println();
        }

        void display_the_ll_when_a_random_middle_ele_is_given(Node ele) {
            Node temp = ele;
            while (temp.prev != null) {
                temp = temp.prev;
            }
            display(temp);
        }

        void insert_ele_at_head(int ele, Node head) {
            Node temp = new Node(ele);

            temp.next = head;
            head.prev = temp;
            head = temp;

            display(head);
        }

        void insert_ele_at_tail(int ele, Node tail, Node head) {
            Node temp = new Node(ele);

            tail.next = temp;
            temp.prev = tail;
            tail = temp;

            display(head);
        }

        void insert_ele_at_an_index(int ele, int index, Node head) {
            Node temp = new Node(ele);
            Node t = head;

            for (int i = 1; i < index; i++) {
                t = t.next;
            }
            Node flag = t.next;
            Node flag2 = t.prev;
            t.prev = temp;
            temp.next = t;
            temp.prev = flag2;
            flag2.next = temp;
            t.next = flag;
            flag.prev = t;

            display(head);
        }

        void deleteTheHead(Node head) {
            head = head.next;
            head.prev = null;
            display(head);
        }

        void deleteTheTail(Node head) {
            Node temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
            display(head);
        }

        void deleteTheTailMethod2(Node tail, Node head) {
            Node temp = tail;
            temp.prev.next.next = null;
            display(head);
        }
    }

    public static void main(String[] args) {

        doublyll obj = new doublyll();
        Node a = new Node(3);
        Node b = new Node(5);
        Node c = new Node(78);
        Node d = new Node(-9);
        Node e = new Node(0);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;

        a.prev = null;
        b.prev = a;
        c.prev = b;
        d.prev = c;
        e.prev = d;

        obj.display(a);
        obj.displayrev(e);
        obj.display_the_ll_when_a_random_middle_ele_is_given(c);
        obj.insert_ele_at_head(-987654, a);
        obj.insert_ele_at_tail(987654, e, a);
        obj.insert_ele_at_an_index(25, 3, a);
        obj.deleteTheHead(a);// deleting head from linkedlist 3 5 25 78 -9 0 987654 -->5 25 78 -9 0 987654
        obj.deleteTheTail(a);// delete tail from linkedlist 3 5 25 78 -9 0 987654 --> 3 5 25 78 -9 0
        obj.deleteTheTailMethod2(e, a);// delete tail from linkedllist 3 5 25 78 -9 0 987654 --> 3 5 25 78 -9 0

    }
}
