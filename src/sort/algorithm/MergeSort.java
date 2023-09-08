package sort.algorithm;

/**
 * MergeSort$
 *
 * @author fldsjj-liy
 * @date 2023/9/8$
 */
/**
 * @description: 归并排序，思想：不断分割成俩个子序列，直至序列中只有一个元素为止，然后不断将俩个子序列合并。最有变成一个有序的序列。
 * 对于其子序列，内部是有序的，所以依次比较大小，将小的值放入数组，最后的到依旧是有序的。
 * 时间复杂度nlog(n)

 * @return:

 */
public class MergeSort {
    int[] arrTmp;
    public void sort(int[] arr) {
        arrTmp = new int[arr.length];
        merge(arr,0,arr.length - 1);
    }
    public void merge(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = left + right >> 1;
        merge(arr,left,mid);
        merge(arr,mid + 1,right);
        group(arr, left,mid, right);
    }
    public void group(int[] arr,int left, int mid, int right) {
        int l1 = 0, l2 = mid + 1;
        int r1 = mid - left, r2 = right;
        for (int i = 0; i <= r1; i++) {
            arrTmp[i] = arr[left + i];
        }
        while (l1 <= r1) {
            if (l2 <= r2 && arr[l2] < arrTmp[l1]) {
                arr[left++] = arr[l2++];
            } else {
                arr[left++] = arrTmp[l1++];
            }
        }
    }
}
