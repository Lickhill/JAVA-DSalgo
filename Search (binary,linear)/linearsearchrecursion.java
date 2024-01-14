public class linearsearchrecursion {

    static boolean linearseach(int arr[], int target, int index) {
        if (index == arr.length)// base case
            return false;

        if (arr[index] == target)// self work
            return true;

        return linearseach(arr, target, index + 1);// recursive work
    }

    static int findTheIndexOfEle(int a[], int target, int index) {
        if (index == a.length)
            return -1;

        if (a[index] == target)
            return index;

        return findTheIndexOfEle(a, target, index + 1);
    }

    // static void findAllTheIndexOfEle(int a[], int target, int index) {
    // if (index == a.length)
    // return;

    // if (a[index] == target) {
    // System.out.println(index);
    // }
    // findAllTheIndexOfEle(a, target, index + 1);
    // }

    static int findAllTheIndexOfEle(int a[], int target, int index) {
        if (index == a.length)
            return -1;

        if (a[index] == target) {
            System.out.println(index);
        }
        return findAllTheIndexOfEle(a, target, index + 1);

    }

    public static void main(String args[]) {
        int arr[] = new int[] { 10, 20, 30, 40, 50, 60, 70, -9, 124 };
        int a[] = new int[] { 10, 4, 4, 4, 4, 60, -9, 80, -9, 9, 98 };
        int target = -9;
        if (linearseach(arr, target, 0))
            System.out.println("YES");
        else
            System.out.println("NO");

        System.out.println(findTheIndexOfEle(a, target, 0));
        findAllTheIndexOfEle(a, target, 0);

    }
}