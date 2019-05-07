package LeetCode.Array;

/**
 * @auther: Li jx
 * @date: 2019/4/21 16:38
 * @description:
 */
public class leet655 {
    public boolean checkPossibility(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            nums[i] = nums[i] - nums[i + 1];
        }
        int sum = 0;
        for (int i = 0; i < nums.length ; i++) {
            if (nums[i] <= 0) {
                sum++;
            }
        }
        return sum == 1 ? true : false;
    }
}
