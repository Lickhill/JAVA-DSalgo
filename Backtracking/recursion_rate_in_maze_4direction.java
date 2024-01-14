public class recursion_rate_in_maze_4direction {

    static void rat(int[][] arr, int sr, int sc, String s, int m, int n, boolean[][] brr) {
        if (sr >= m || sc >= n)
            return;
        if (sr < 0 || sc < 0)
            return;
        if (brr[sr][sc] == true)
            return;
        if (sr == m - 1 && sc == n - 1) {
            System.out.println(s);
            return;
        }

        brr[sr][sc] = true;// marking true in every (i,j) visited so the rat does not go their again and
                           // gets trap in loop
        rat(arr, sr, sc + 1, s + "R ", m, n, brr);// going right

        rat(arr, sr + 1, sc, s + "D ", m, n, brr);// goinf down

        rat(arr, sr, sc - 1, s + "L ", m, n, brr);// going left

        rat(arr, sr - 1, sc, s + "U ", m, n, brr);// going up

        brr[sr][sc] = false;// making all the brr[sr][sc] = true; (i,j) to false because restart of rat to
                            // 0,0 for a new path to the destination

    }

    public static void main(String[] args) {
        int m = 3;
        int n = 3;
        int arr[][] = new int[m][n];
        boolean brr[][] = new boolean[m][n];

        rat(arr, 0, 0, "", m, n, brr);
    }
}
