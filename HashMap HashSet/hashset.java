import java.util.HashMap;
import java.util.HashSet;

public class hashset {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();

        hs.add(4);
        hs.add(5);
        hs.add(6);
        hs.add(7);
        hs.add(8);

        System.out.println(hs);
        hs.add(4);// since hs already has 4 so next 4 will not be added
        hs.add(5);
        hs.add(4);
        hs.add(98);
        hs.add(75);

        System.out.println(hs);// unorder
        // the set is not 4 5 6 7 8 98 75

        hs.remove(5);
        System.out.println(hs);

        System.out.println(hs.contains(6));
        System.out.println(hs.size());
    }
}
