package LeetCode.Array;

import jdk.nashorn.internal.objects.annotations.Getter;

/**
 * @auther: Li jx
 * @date: 2019/4/27 15:50
 * @description:
 */

public class Leet55 {
    public boolean canJump(int[] nums) {
        if (nums.length == 1) {
            return true;
        }
        if (nums[0] == 0) {
            return false;
        }
        int max =nums[0];
        int a = 0;
        for (int i = 1; i < nums.length; i++) {
            a = nums[i] + i ;
            max = Math.max(max, a);
            if (max >= nums.length-1) {
                return true;
            }
            if (i == max) {
                if (nums[i] < 1) {
                    return false;
                }
            }

        }
        return true;
    }
}