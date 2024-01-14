public class rough2 {
    public static void main(String args[]) {
        int num = 34;
        int rev = 0;
        int i = 0;

        while (num > 0) {
            int div = num % 10;
            rev = (rev * 10) + div;
            i++;
            num /= 10;
        }
        System.out.println(rev);
    }
}