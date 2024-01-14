import java.util.*;

public class queueReorder {// half the queue and then add the ele in alternate order eg 12345678 make it 1
                           // 2 3 4 and 5 6 7 8 and then the new queue is 1 5 2 6 3 7 4 8//using a stack

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        Stack<Integer> st = new Stack<>();

        for (int i = 1; i <= 20; i++) {
            q.add(i);
        }
        q.add(21);

        System.err.println(q);
        int half = q.size() / 2;
        boolean even = false;

        if (q.size() % 2 == 0) {
            even = true;
        }

        for (int i = 0; i < half; i++) {
            st.push(q.remove());
        }

        if (!even) {
            st.push(q.remove());
        }

        while (!st.isEmpty()) {
            q.add(st.pop());
        }

        for (int i = 0; i < half; i++) {
            q.add(q.remove());
        }

        for (int i = 0; i < half; i++) {
            st.push(q.remove());
        }

        if (!even) {
            st.push(q.remove());
        }

        for (int i = 0; i < half; i++) {
            q.add(st.pop());
            q.add(q.remove());
        }

        if (st.size() > 0) {
            q.add(st.pop());
        }

        System.out.println(q);

    }
}
