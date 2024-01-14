import java.util.*;

public class subsequences {

    public static void subsequenString(String sen, int index, String rest) {
        if (index == sen.length()) {
            System.out.println(rest);
            return;
        }
        // dont
        subsequenString(sen, index + 1, rest + "_");
        // do
        subsequenString(sen, index + 1, rest + sen.charAt(index));
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        subsequenString(str, 0, "");

    }
}
