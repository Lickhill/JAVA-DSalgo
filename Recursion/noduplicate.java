import java.util.*;

public class noduplicate {

    public static String duplicate(String sen, boolean A[], int index) {
        if (index == sen.length()) {
            return "";
        }

        if (A[sen.charAt(index) - 'a']) {
            return duplicate(sen, A, index + 1);
        } else {
            A[sen.charAt(index) - 'a'] = true;
            return sen.charAt(index) + duplicate(sen, A, index + 1);

        }

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        boolean arr[] = new boolean[26];
        System.out.println(duplicate(str, arr, 0));
    }
}
