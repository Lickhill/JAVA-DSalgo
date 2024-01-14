public class recursionlec9 {

    static int frog_jump(int arr[], int index) {

        if (index == arr.length - 1)
            return 0;
        int op1 = frog_jump(arr, index + 1) + Math.abs(arr[index] - arr[index + 1]);
        if (index == arr.length - 2)
            return op1;

        int op2 = Math.abs(arr[index] - arr[index + 2]) + frog_jump(arr, index + 2);

        return Math.min(op1, op2);
    }

    static void digits(String alphabets[], String number, int index, String ans) {

        if (index >= number.length()) {
            System.out.println(ans);
            return;
        }
        int num = number.charAt(index) - '0';
        for (int i = 0; i < alphabets[num].length(); i++) {
            digits(alphabets, number, index + 1, ans + alphabets[num].charAt(i));
        }
    }
    /*
     * in this we take time complexity of worst case
     * here worst case is number having n number of 7 and 9 for whcih the array has
     * 4 letter string
     * to time complexity= number of (recursive call x time taken in one call)
     * the recursive call is 4 times every number so for n levels it is 4 to the
     * power n
     */

    public static void main(String args[]) {
        int arr[] = new int[] { 10, 30, 40, 20 };
        System.out.println(frog_jump(arr, 0));

        String number = "237";
        String alphabets[] = new String[] { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

        digits(alphabets, number, 0, "");

    }
}