package LeetCode.剑指offer;

import java.util.Stack;

/**
 * @author: Li jx
 * @date: 2019/11/8 14:26
 * @description:
 */
public class Offer6 {
    public int minNumberInRotateArray(int [] array) {
        int low = 0;
        int high = array.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (array[mid] > array[low]) {
                low = mid + 1;
            } else if (array[mid] == array[high]) {
                high--;
            } else {
                high = mid;
            }
        }
        return array[low];
    }
}
