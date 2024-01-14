import java.util.*;

public class firstandlastoccurence {

    public static void firstandlast(String sen, String element, int index, int first, int last) {
        if (index == sen.length()) {
            return;
        }

        if (sen.charAt(index) == element.charAt(0)) {
            if (first == -1) {
                first = index;
                System.out.println(first);
            } else {
                last = index;
                System.out.println(last);
            }
        }
        firstandlast(sen, element, index + 1, first, last);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        System.out.println("Enter the element");
        String ele = sc.next();
        firstandlast(str, ele, 0, -1, -1);

    }

}
