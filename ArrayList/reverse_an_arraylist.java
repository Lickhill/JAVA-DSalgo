import java.util.*;

public class reverse_an_arraylist {

    public static void print(ArrayList<Integer> list) {
        System.out.println(list);
    }

    public static void reverse(ArrayList<Integer> arr, int size) {
        int left = 0, right = size - 1;
        while (left < right) {
            Integer temp = arr.get(left);
            arr.set(left, arr.get(right));
            arr.set(right, temp);

            left++;
            right--;

        }
        print(arr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter the arraylist elements:");
        for (int i = 0; i < 7; i++) {
            list.add(sc.nextInt());
        }
        System.out.println(list.size());
        System.out.println("The original arraylist is");
        print(list);

        System.out.println("The sorted arraylist is:");
        reverse(list, list.size());
    }
}
