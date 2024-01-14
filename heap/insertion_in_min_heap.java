import java.util.ArrayList;

public class insertion_in_min_heap {

    public static void swap(ArrayList<Integer> heap, int parent, int element) {
        int temp = heap.indexOf(element);
        heap.set(heap.indexOf(parent), element);
        heap.set(temp, parent);
    }

    public static void send_up(ArrayList<Integer> heap, int element) {// for min heap only
        int indexOfElement = heap.indexOf(element);
        int parent = heap.get((indexOfElement - 1) / 2);
        if (parent > element) {
            swap(heap, parent, element);
        } else {
            return;
        }
        send_up(heap, element);

    }

    public static void insert(ArrayList<Integer> heap, int element) {
        heap.add(element);
        send_up(heap, element);
    }

    public static void positioning(ArrayList<Integer> heap, int maincharacter) {// for min heap only
        int index = heap.indexOf(maincharacter);
        int smallest = maincharacter;
        int right = (index * 2) + 2;
        int left = (index * 2) + 1;
        int n = heap.size() - 1;
        if (right <= n && heap.get(right) < smallest) {
            smallest = heap.get(right);
        }
        if (left <= n && heap.get(left) < smallest) {
            smallest = heap.get(left);
        }
        if (smallest == maincharacter) {
            return;
        } else {
            swap(heap, smallest, maincharacter);
            positioning(heap, maincharacter);
        }

    }

    public static void delete(ArrayList<Integer> heap)// always to the root gets deleted
    {// for min heap only
        swap(heap, heap.get(0), heap.get(heap.size() - 1));
        heap.remove(heap.size() - 1);
        int maincharacter = heap.get(0);
        positioning(heap, maincharacter);

    }

    public static void main(String[] args) {
        ArrayList<Integer> heap = new ArrayList<>();
        // heap.add(10);
        // heap.add(20);
        // heap.add(30);
        // heap.add(40);
        // heap.add(50);
        // heap.add(60);
        heap.add(5);
        heap.add(20);
        heap.add(10);
        heap.add(40);
        heap.add(50);
        heap.add(30);
        heap.add(60);

        // delete(heap);
        // insert(heap, 5);

        for (int i = 0; i < heap.size(); i++) {
            System.out.println(heap.get(i));
        }
    }
}