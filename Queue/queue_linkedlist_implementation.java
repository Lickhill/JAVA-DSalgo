public class queue_linkedlist_implementation {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class queuell {
        Node head = null;
        Node tail = null;
        int size = 0;

        void add(int val) {
            Node temp = new Node(val);
            if (size == 0) {
                head = temp;
                tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
            tail.next = head;
            size++;
        }

        int remove() {
            if (size == 0) {
                System.out.println("the queue is empty");
                return -9999;
            } else {
                int x = head.data;
                head = head.next;
                tail.next = head;
                size--;
                return x;
            }
        }

        void display() {
            System.out.print(head.data + " ");
            Node temp = head.next;
            while (temp != head) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        int peek() {
            if (size == 0) {
                System.out.println("the queue is empty");
                return -9999;
            } else {
                return head.data;
            }
        }

        int size() {
            return size;
        }
    }

    public static void main(String[] args) {
        queuell obj = new queuell();
        obj.add(5);
        obj.display();
        obj.add(6);
        obj.add(7);
        obj.add(8);
        obj.add(9);

        obj.display();

        obj.remove();
        obj.display();

        obj.add(-987);
        obj.display();

        System.out.println(obj.size());

        System.out.println(obj.peek());

    }
}