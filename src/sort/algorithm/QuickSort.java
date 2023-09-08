package sort.algorithm;

/**
 * QuickSort$
 *
 * @author fldsjj-liy
 * @date 2023/9/8$
 */
/**
 * @description:快速排序，思想：选定一个值，作为“基准”，对于然后将大于该值的数存放在右边，小于该值的数存放在左边。
 * 处理完之后，对剩下两边的值，再次使用该算法（尝使用递归）。最后只剩下一个值的时候，即left==right及排序完成.
 * 时间复杂度nlog(n)

 * @return:升序数组

 */
public class QuickSort {
    public void sort(int[] arr, int left, int right) {
        int privot = 0;
        if (left < right) {
            privot = QSort(arr, left, right);
            sort(arr, privot + 1,right);
            sort(arr, left, privot - 1);
        }
    }
    public int QSort(int[] arr, int left, int right) {
        int privot = arr[left];
        while (left < right) {
            while ( privot <= arr[right] && left < right) {
                right--;
            }
            arr[left] = arr[right];
            while (privot >= arr[left] && left < right) {
                left++;
            }
            arr[right] = arr[left];
        }
        arr[left] = privot;
        return left;
    }
}
