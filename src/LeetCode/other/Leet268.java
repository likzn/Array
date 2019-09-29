package LeetCode.other;

/**
 * @author: Li jx
 * @date: 2019/9/28 12:21
 * @description:
 */
public class Leet268 {
    public int missingNumber(int[] nums) {
        int length = nums.length;
        int oldSum = (1 + length) * length / 2;
        for (int i = 0; i < nums.length; i++) {
            oldSum -= nums[i];
        }
        return oldSum;
    }
}
