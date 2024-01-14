public class queueCircularArrayImplementation {

    public static class arrayqueuecircular {
        int front = -1;
        int rear = -1;
        int size = 0;
        int arr[] = new int[8];

        void add(int val) {
            if (size == arr.length) {
                System.out.println("Queue is full!");
                return;
            }
            if (size == 0) {
                arr[++front] = val;
                arr[++rear] = val;
            } else if (rear == arr.length - 1) {
                arr[0] = val;
                rear = 0;
            } else {
                arr[++rear] = val;
            }
            size++;
        }

        int remove() {
            if (size == 0) {
                front = -1;
                rear = -1;
                System.out.println("Queue is empty!");
                return -999;
            } else {
                size--;
                return arr[front++];
            }
        }

        int peek() {
            if (size == 0) {
                front = -1;
                rear = -1;
                System.out.println("Queue is empty!");
                return -999;
            } else {
                return arr[front];
            }
        }

        void display() throws Exception {

            if (size == 0) {
                front = -1;
                rear = -1;
                throw new Exception("Queue is empty");// gives this message and then ends the porgrma by giving an error
            }

            if (rear >= front) {
                for (int i = front; i <= rear; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            } else {
                for (int i = 0; i <= rear; i++) {
                    System.out.print(arr[i] + " ");
                }
                if (rear < front) {
                    for (int i = rear + 1; i <= front - 1; i++) {
                        System.out.print("- ");
                    }
                }
                for (int i = front; i < arr.length; i++) {
                    System.out.print(arr[i] + " ");
                }

                System.out.println();
            }
        }

        int size() {
            return size;
        }

        void rearfront() {
            System.out.println("rear is: " + rear);
            System.out.println("front is: " + front);
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

        obj.rearfront();

        obj.add(456);
        System.out.println(obj.size());
        obj.display();
        obj.rearfront();

        obj.remove();
        obj.remove();
        obj.remove();

        obj.display();
        obj.rearfront();

    }
}
