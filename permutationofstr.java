import java.util.*;

public class permutationofstr {

    public static void permutation(String sen, String perm) {
        if (sen.isEmpty()) {
            System.out.println(perm);
            return;
        }
        for (int i = 0; i < sen.length(); i++) {
            char currentchar = sen.charAt(i);
            String rest = sen.substring(0, i) + sen.substring(i + 1);
            permutation(rest, currentchar + perm);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:\n");
        String str = sc.next();
        System.out.println();
        permutation(str, "");
    }
}