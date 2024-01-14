import java.util.Comparator;
import java.util.PriorityQueue;

public class queuePriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();// min priority means the min ele in queue will be peeked
                                                          // irrespetive of its position/ index
        pq.add(10);
        pq.add(-98);
        pq.add(87);
        pq.add(6);
        pq.add(8);

        System.out.println(pq);// min at first and rest in random order
        System.out.println(pq.peek());// the min is -98 hence

        pq.remove();
        System.out.println(pq);
        pq.remove();// alwasy after removeing
        System.out.println(pq);// the least one comes to the front

        PriorityQueue<Integer> pt = new PriorityQueue<>(Comparator.reverseOrder());// max at front

        pt.add(10);
        pt.add(-98);
        pt.add(87);
        pt.add(6);
        pt.add(8);

        System.out.println(pt);// max at first and rest in random order
        System.out.println(pt.peek());

        pt.remove();
        System.out.println(pt);
        pt.remove();// alwasy after removeing
        System.out.println(pt);// the greatest one comes to the front

    }
}