public class linkedlistlec1 {

    public static class Node {// this is list node
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static void printlinkedlist_usingrecursion(Node flag) {
        if (flag == null)
            return;

        System.out.print(flag.data + " ");
        printlinkedlist_usingrecursion(flag.next);
    }

    public static void main(String args[]) {
        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8);
        Node e = new Node(45);

        // a b c d e
        // abcde are 5 distict nodes which are later connected by .next function

        System.out.println(a);
        System.out.println(a.next);

        System.out.println(b);

        a.next = b;// this does is connect a to b so now the linked list is like a->b c d e

        System.out.println(a.next);
        System.out.println(b);
        System.out.println(b.data);// gives 3
        System.out.println(a.next.data);// gives 3 since a is connect to b by a.next=b

        a.next = b;
        b.next = c;// c is b.next --> a.next.next
        c.next = d;
        d.next = e;// c.next.next=e --> a.next.next.next.next==e

        System.out.println(e.data);
        System.out.println(a.next.next.next.next.data);
        // both gives 45

        // a->b->c->d->e//all connected
        // 5->3->9->8->45
        // this is linked list
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

        Node temp = a;
        System.out.println(a.data);
        System.out.println(temp.data);
        // both same

        Node flag = a;
        int count = 0;
        while (true) {
            if (flag == null) {
                System.out.println();
                break;
            }
            System.out.print(flag.data + " ");
            flag = flag.next;
            count++;
        }
        System.out.println("The length of linkedlist is: " + count);

        printlinkedlist_usingrecursion(a);

    }

}
