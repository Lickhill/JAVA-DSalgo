public class recursionRatInMaze_2direction {// only down and right // start from 0,0 to 3,4 i.e the last row,col of the
                                            // given matrix

    static void rat(int[][] arr, int sr, int sc, String s, int m, int n) {
        if (sr > m || sc > n)
            return;
        if (sr == m - 1 && sc == n - 1) {
            System.out.println(s);
            return;
        }

        rat(arr, sr, sc + 1, s + "R ", m, n);// going right

        rat(arr, sr + 1, sc, s + "D ", m, n);// goinf down

    }

    public static void main(String[] args) {
        int m = 3;
        int n = 3;
        int arr[][] = new int[m][n];

        rat(arr, 0, 0, "", m, n);
    }
}
