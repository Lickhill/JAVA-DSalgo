import java.util.ArrayDeque;
import java.util.Deque;

public class queueDequeConcept {
    public static void main(String[] args) {
        Deque dq = new ArrayDeque<>();
        dq.add(5);
        System.out.println(dq);
        dq.add(6);
        dq.add(7);
        dq.add(8);

        System.out.println(dq);

        dq.addFirst(-987);
        dq.addLast(987);

        System.out.println(dq);

        dq.add(5);// adds at the last just like queue
        dq.add(76);
        dq.add(5);

        System.out.println(dq);

        dq.removeFirstOccurrence(5);
        System.out.println(dq);

        dq.removeLastOccurrence(5);
        System.out.println(dq);

        dq.remove();// removes from first just like queue
        System.out.println(dq);

        dq.removeLast();
        System.out.println(dq);

    }
}
