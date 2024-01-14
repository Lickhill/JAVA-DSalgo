import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class queue_lec1_concepts {
    public static void main(String[] args) {
        Queue<Integer> st = new LinkedList<>();
        Queue<Integer> qt = new ArrayDeque<>();// one more way of initializing queue
        qt.add(34);
        System.out.println(qt);
        System.out.println(st.isEmpty());
        st.add(5);// first in into the queue
        st.add(4);
        System.out.println(st.isEmpty());
        st.add(3);
        st.add(2);
        st.add(1);
        st.add(0);

        System.out.println(st);

        st.remove();// st.poll() same thing
        // remove form the front since this is first in first out
        System.out.println(st);

        st.poll();
        System.out.println(st);

        int a = st.size();
        System.out.println(a);

    }
}
