public class recursionlec2 {

    static int sum(int num, int count) {
        if (num <= 0) {
            System.out.println("the number of digits is " + count);
            return 0;
        }
        count++;
        return num % 10 + sum((num / 10), count);

    }

    static int power(int p, int q) {
        if (q == 0)
            return 1;

        // return p * power(p, q - 1);

        // alternative method

        if (q % 2 == 0) {
            int smallpower = power(p, q / 2);
            return smallpower * smallpower;// return power(p,q/2) * power(p,q/2) -----> this will have more time
                                           // complexity since same method is called twice
        } else {
            int smallpower = power(p, q / 2);
            return smallpower * smallpower * p;
        }

    }

    public static void main(String args[]) {
        int num = 12345;
        int p = 5;
        int q = 4;
        System.out.println(sum(num, 0));
        System.out.println(power(p, q));

    }
}
