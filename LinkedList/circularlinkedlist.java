public class circularlinkedlist {

    public static class Node {
        int val;
        Node next;
        Node prev;

        Node(int val) {
            this.val = val;
        }
    }

    public static class circular {
        void display(Node head) {
            Node temp = head;
            System.out.print(temp.val + " ");
            temp = temp.next;
            while (temp != head) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        circular obj = new circular();

        Node a = new Node(3);
        Node b = new Node(5);
        Node c = new Node(78);
        Node d = new Node(-9);
        Node e = new Node(0);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = a;

        a.prev = e;
        b.prev = a;
        c.prev = b;
        d.prev = c;
        e.prev = d;

        obj.display(a);

    }

}
