public class recursionlec3 {

    static void multiples(int num, int k) {
        if (k == 0)
            return;
        multiples(num, k - 1);
        System.out.print(num * k + " ");

    }

    static int intervaladdsubs(int num) {
        if (num == 0)
            return 0;

        if (num % 2 == 0)
            return (-num) + intervaladdsubs(num - 1);
        else
            return num + intervaladdsubs(num - 1);
    }

    public static void main(String args[]) {
        int num = 8;

        multiples(num, 78);
        System.out.println(intervaladdsubs(10));

    }
}
