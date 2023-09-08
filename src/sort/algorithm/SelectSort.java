package sort.algorithm;

/**
 * SelectSort$
 *
 * @author fldsjj-liy
 * @date 2023/9/8$
 */
/**
 * @description: 选择排序， 思想：每一次找出最小或者最大值的下标，然后将下标对应的数组和当前位置数值进行交换
 * 时间复杂度：n^2

 * @return:

 */
public class SelectSort {
    public void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minValue = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minValue] > arr[j]) {
                    minValue = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minValue];
            arr[minValue] = temp;
        }
    }
}
