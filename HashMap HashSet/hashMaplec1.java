import java.util.*;

public class hashMaplec1 {
    public static void main(String[] args) {
        Map<Integer, String> mp = new HashMap<>();// key is integer and value is string and it could be string,integer
                                                  // then value would be name and key would be the integer/ number

        mp.put(1, "Likhil");
        mp.put(3, "Hinata");
        mp.put(2, "NItin");

        System.out.println(mp);

        System.out.println(mp.containsKey(2));
        System.out.println(mp.containsValue("Likhil"));
        System.out.println(mp.containsKey(4));

        mp.put(2, "Adarsh");// overrides
        System.out.println(mp);

        mp.putIfAbsent(2, "HInata");
        System.out.println(mp);
        mp.putIfAbsent(4, "kaguya");
        System.out.println(mp);

        System.out.println(mp.size());

        System.out.println(mp.get(2));
        System.out.println(mp.get(5));
        System.out.println();

        Map<String, Integer> mt = new HashMap<>();
        mt.put("luffy", 1);
        mt.put("zoro", 10);
        mt.put("nami", 420);
        mt.put("god usopp", 11);

        System.out.println(mt);

        mt.put("zoro", 9);
        System.out.println(mt);
        mt.putIfAbsent("robin", 12);
        mt.putIfAbsent("nami", 9);
        System.out.println(mt);// unordered

        System.out.println(mt.containsKey("zoro"));

        System.out.println(mt.keySet());// get all keys and here the keys are the string
        System.out.println(mt.values());
        System.out.println(mt.entrySet());// get all the elment with key and value in list format
        System.out.println();

        for (String key : mt.keySet()) {
            System.out.printf("The level of %s is %d\n", key, mt.get(key));
        }

        System.out.println();

        for (Map.Entry<String, Integer> name : mt.entrySet()) {
            System.out.printf("The bounty of %s is %d.\n", name.getKey(), name.getValue());
        }
        System.out.println();

        for (var e : mt.entrySet()) {
            System.out.printf("The rate of %s is %d.\n", e.getKey(), e.getValue());
        }
        // three different ways

    }
}
