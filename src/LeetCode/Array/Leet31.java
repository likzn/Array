package LeetCode.Array;

import java.util.Arrays;

/**
 * @author: Li jx
 * @date: 2019/9/22 14:02
 * @description:
 */
public class Leet31 {
    public void nextPermutation(int[] nums) {
        for (int i = nums.length - 1; i >0; i--) {
            if (nums[i] > nums[i - 1]) {
                for (int j = nums.length - 1; j >= i; j--) {
                    if (nums[i - 1] < nums[j]) {
                        int temp = nums[i - 1];
                        nums[i - 1] = nums[j];
                        nums[j] = temp;
                        Arrays.sort(nums, i, nums.length);
                        return;
                    }
                }
            }
        }
        Arrays.sort(nums);
    }
}
