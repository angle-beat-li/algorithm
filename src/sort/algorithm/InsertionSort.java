package sort.algorithm;

/**
 * InsertionSort$
 *
 * @author fldsjj-liy
 * @date 2023/9/8$
 */
/**
 * @description: 插入排序，思想：第i次都是针对前i个的序列，找到第i个数的相应为，将值插入进去，大于该值的数都依次后移。
 * 时间复杂度：n^2
 * @return:

 */
public class InsertionSort {
    public void sort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            int idxTmp = i - 1;
            while (idxTmp >= 0 && arr[idxTmp] > temp) {
                arr[idxTmp + 1] = arr[idxTmp];
                idxTmp--;
            }
            arr[idxTmp + 1] = temp;
        }
    }
}
