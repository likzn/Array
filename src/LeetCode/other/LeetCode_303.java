package LeetCode.other;

/**
 * @auther: Li jx
 * @date: 2019/4/16 15:48
 * @description:
 */
public class LeetCode_303 {
    private int[] ints;
    public LeetCode_303(int[] nums) {
        ints = new int[nums.length+1];
        for (int i = 1; i < nums.length+1; i++) {
            ints[i] = ints[i - 1] + nums[i - 1];
        }
    }

    public int sumRange(int i, int j) {
        return ints[j + 1] - ints[i];
    }

}
