package LeetCode.other;

import java.util.Comparator;
import java.util.HashSet;
import java.util.PriorityQueue;

/**
 * @author: Li jx
 * @date: 2019/9/19 11:59
 * @description:
 */
public class Leet414 {
    public int thirdMax(int[] nums) {
        int one = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (one < nums[i]) {
                one = nums[i];
            }
        }
        int two = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (two < nums[i] && nums[i] != one) {
                two = nums[i];
            }
        }
        boolean flag = false;
        int three = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (three < nums[i] && nums[i] != one&& nums[i] != two) {
                three = nums[i];
                flag = true;
            }
        }
        if (flag) {
            return three;
        }
        return one;
    }
}
