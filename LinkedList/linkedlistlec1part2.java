public class linkedlistlec1part2 {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class linkedlistelementadding {
        Node head = null;
        Node tail = null;

        void insert_ele(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
            } else {
                tail.next = temp;
            }
            tail = temp;
        }

        void insert_at(int index, int val) {
            Node temp = head;
            Node t = new Node(val);
            if (index == 0)
                insert_ele_at_beginning(val);
            if (index == size2())
                insert_ele(val);

            for (int i = 1; i < index; i++) {
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
        }

        void insert_ele_at_beginning(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                temp.next = head;
                head = temp;
            }
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            size();
        }

        void size() {
            Node temp = head;// can use any name instead of temp since this Node is a new temp which has head
                             // assigned
            int count = 0;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            System.out.println("\nthe size is:" + count);
        }

        int size2() {
            Node temp = head;// can use any name instead of temp since this Node is a new temp which has head
                             // assigned
            int count = 0;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
        }

        void deletion(int index) {
            Node temp = head;
            if (index == 0) {
                head = head.next;
                return;
            }
            for (int i = 1; i < index; i++) {
                temp = temp.next;
            }
            temp.data = temp.next.data;
            temp.next = temp.next.next;// the index pos is temp.next and making that the next of temp.next hence
                                       // ignoreing the temp.next and assigning it to temp.next.next
            if (index == size2() - 1) {
                tail = temp;
            }
        }

        int getele(int index) {
            Node temp = head;
            if (index == 0) {
                return head.data;
            }
            for (int i = 1; i <= index; i++) {
                temp = temp.next;
            }
            return temp.data;
        }
    }

    public static void main(String args[]) {
        linkedlistelementadding obj = new linkedlistelementadding();
        obj.insert_ele(5);// linked list formed 5
        obj.insert_ele(6);// linked list formed 5->6
        obj.insert_ele(56);// linked list formed 5->6->56
        // elements are being inserted and also being connected to each other rather say
        // being singly linked to each other

        obj.insert_ele_at_beginning(345);
        obj.insert_ele_at_beginning(14679);

        obj.insert_at(3, -9);
        obj.deletion(2);
        obj.display();
        System.out.println(obj.size2());
        System.out.println(obj.getele(2));

    }

}
