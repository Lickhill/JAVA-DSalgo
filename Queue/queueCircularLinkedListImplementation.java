public class queueCircularLinkedListImplementation {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class arrayqueuecircular {

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
            Node temp = head;
            while (temp != null) {
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

    public static void main(String[] args) throws Exception {

        arrayqueuecircular obj = new arrayqueuecircular();

        obj.display();
        obj.add(5);
        obj.add(6);
        obj.add(7);
        obj.add(8);

        obj.display();
        System.out.println(obj.size());

        obj.add(9);
        obj.add(10);
        obj.add(11);
        obj.add(12);

        obj.display();
        System.err.println(obj.size());

        obj.remove();
        System.out.println(obj.size());
        obj.display();

        obj.add(456);
        System.out.println(obj.size());
        obj.display();
        obj.remove();
        obj.remove();
        obj.remove();

        obj.display();
    }
}
