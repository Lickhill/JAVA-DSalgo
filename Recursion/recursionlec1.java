public class recursionlec1 {

    public static int factorial(int num) {
        if (num == 1)
            return 1;

        return num * factorial((num - 1));
    }

    public static void fibo(long num, long a, long b, long c) {
        if (num == 0)
            return;

        System.out.print(a + " ");
        fibo(num - 1, b, c, b + c);

    }

    static int fibo2(int num) {
        if (num == 0 || num == 1)
            return num;

        return fibo2(num - 1) + fibo2(num - 2);
    }

    public static void main(String args[]) {
        int n = 5;
        System.out.println(factorial(n));
        int a = 0;
        int b = 1;
        int c = a + b;
        fibo(20, a, b, c);

        System.out.println();

        for (int i = 0; i < 20; i++) {
            System.out.print(fibo2(i) + " ");
        }

    }

}
