package LeetCode.Array;

/**
 * @auther: Li jx
 * @date: 2019/4/27 15:50
 * @description:
 */
public class Leet674 {
    public int findLengthOfLCIS(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int size = 1;
        int big = 1;
        int a = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > a) {
                size++;
            } else {
                size = 1;
            }
            a = nums[i];
            big = Math.max(big, size);
        }
        return big;
    }
}
