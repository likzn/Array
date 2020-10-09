package LeetCode.other;

import Array.Array;

import java.util.Arrays;

/**
 * @author: Li jx
 * @date: 2019/10/4 14:42
 * @description:
 */
public class Leet747 {
    public int dominantIndex(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }
        int[] ints = Arrays.copyOfRange(nums, 0, nums.length);
        Arrays.sort(ints);
        if (ints[ints.length - 1] < 2*ints[ints.length - 2]) {
            return -1;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == ints[ints.length - 1]) {
                return i;
            }
        }
        return -1;
    }
}
