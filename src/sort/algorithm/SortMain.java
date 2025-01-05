package sort.algorithm;

/**
 * SortMain$
 *
 * @author fldsjj-liy
 * @date 2023/9/8$
 */
public class SortMain {
    public static void main(String[] args) {
        int[] arr = {10,7,2,4,7,62,3,4,2,1,8,9,88};
        MergeSort sort = new MergeSort();
        sort.sort(arr);
        myPrint(arr);
    }
    public static void myPrint(int[] arr) {
        for (int i : arr) {
            System.out.print(i + "  ");
            //1  2  2  3  4  4  7  7  8  9  10  62  88
            //1  2  2  3  4  4  7  7  8  9  10  62  88
        }
    }
}
