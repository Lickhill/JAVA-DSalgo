import java.util.HashMap;
import java.util.Map;

public class hashmapques1 {
    public static void main(String[] args) {
        Map<Integer, Integer> mp = new HashMap<>();
        int arr[] = { 1, 2, 3, 1, 4, 5, 1, 2, 3, 4, 5, 1, 1, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 32, 1, 1, 1, 1, 1, 1,
                1, 1, 2, 4, 4, 2, 2, 2, 2, 2, 4, 3, 3 };
        mp.put(arr[0], 1);
        for (int i = 1; i < arr.length; i++) {
            if (mp.containsKey(arr[i]) == false) {
                mp.put(arr[i], 1);
            } else {
                mp.put(arr[i], mp.get(arr[i]) + 1);
            }
        }
        System.out.println(mp.entrySet());
        int max = -9999;
        int count = -99;

        for (var key : mp.keySet()) {
            if (count < mp.get(key)) {
                max = key;
                count = mp.get(key);
            }
        }
        System.out.println(max);

    }
}
