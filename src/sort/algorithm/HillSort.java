package sort.algorithm;

/**
 * HillSort$
 *
 * @author fldsjj-liy
 * @date 2023/9/8$
 */
/**
 * @description:希尔排序，
 * 思想：插入排序的改进，插入排序每次循环是比较一个值，
 * 而希尔排序，每一次就是选择行的比较值，比如当增量为2的时候，就会比较0-2-4-5.。。等位置上的值，并对他们进行排序。
 * 然后不断降低增量，直到增量为1的时候
 * 时间复杂度nlog(n)

 * @return:

 */
public class HillSort {
    public void sort(int[] arr) {
        for (int step = arr.length / 2; step > 0; step /= 2) {
            for (int i = step; i < arr.length; i++) {
                int j = i;
                int minValue = arr[i];
                while (j - step >= 0 && arr[j - step] > minValue) {
                    arr[j] = arr[j - step];
                    j -= step;
                }
                arr[j] = minValue;
            }
        }
    }
}
