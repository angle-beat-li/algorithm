package sort.algorithm;

/**
 * BubbleSort$
 *
 * @author fldsjj-liy
 * @date 2023/9/8$
 */
/**
 * @description:冒泡排序，
 * 思想：遍历n^2次，遇到俩数大小相反的，交换位置。即每一次，都会将一个最大值，移到元素末尾。
 * 空间复杂度：n^2

 * @return:

 */
public class BubbleSort {
    public void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0 ; j < arr.length - i - 1; j++){
                if (arr[j + 1] < arr[j]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
