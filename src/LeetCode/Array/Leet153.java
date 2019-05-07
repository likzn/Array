package LeetCode.Array;

import java.util.Arrays;

/**
 * @auther: Li jx
 * @date: 2019/4/27 15:50
 * @description:
 */
public class Leet153 {
    public int findMin(int[] nums) {
        int a = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > a) {
                a = nums[i];
                continue;
            }
            a = nums[i];
            break;
        }
        return a;
    }
}