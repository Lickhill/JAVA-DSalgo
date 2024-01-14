public class gcd {

    static int hcf(int num1, int num2) {
        if (num2 % num1 == 0)
            return num1;

        return hcf(num2 % num1, num1);
    }

    public static void main(String args[]) {
        int num1 = 24;
        int num2 = 36;
        // if (num2 > num1) {

        // } else {
        // int temp = num1;
        // num1 = num2;
        // num2 = temp;
        // }

        // the swapping is not really necessary since in recursion the value will swap
        // automatically as it is the Euclids algo

        int count = 0;
        int f = 1;
        for (int i = 2; i <= num2; i++) {
            if (num1 % i == 0 && num2 % i == 0)
                count = i;

        }
        System.out.println("the LCM is: " + count * (num1 / count) * (num2 / count));
        System.out.println("The GCD is: " + count);
        System.out.println(hcf(num1, num2));
    }
}
