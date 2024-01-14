public class recursion_backtracking_rat_in_an_actual_maze {

    static void rat(int[][] arr, int sr, int sc, String s, int m, int n) {
        if (sr >= m || sc >= n)
            return;
        if (sr < 0 || sc < 0)
            return;
        if (arr[sr][sc] == 0)
            return;
        if (sr == m - 1 && sc == n - 1) {
            System.out.println(s);
            return;
        }

        arr[sr][sc] = 0;// marking true in every (i,j) visited so the rat does not go their again and
                        // gets trap in loop
        rat(arr, sr, sc + 1, s + "R ", m, n);// going right

        rat(arr, sr + 1, sc, s + "D ", m, n);// goinf down

        rat(arr, sr, sc - 1, s + "L ", m, n);// going left

        rat(arr, sr - 1, sc, s + "U ", m, n);// going up

        arr[sr][sc] = 1;

    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 0, 1, 1 }, { 1, 1, 1, 1 }, { 1, 1, 0, 1 } };

        rat(arr, 0, 0, "", 3, 4);

    }
}
