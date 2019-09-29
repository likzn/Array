package LeetCode.DP;

/**
 * @author: Li jx
 * @date: 2019/9/6 16:09
 * @description:
 */
public class Leet152 {
    public int maxProduct(int[] nums) {
        int[] dpMax = new int[nums.length];
        int[] dpMin = new int[nums.length];
        dpMax[0] = nums[0];
        dpMin[0] = nums[0];
        int imax = Integer.MIN_VALUE;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < 0) {
                int temp = dpMax[i - 1];
                dpMax[i - 1] = dpMin[i - 1];
                dpMin[i - 1] = temp;
            }
            dpMax[i] = Math.max(dpMax[i - 1] * nums[i], nums[i]);
            dpMin[i] = Math.min(dpMin[i - 1] * nums[i], nums[i]);
            imax = Math.max(dpMax[i], dpMin[i]);
        }
        return imax;
    }


}
