package LeetCode.other;

/**
 * @auther: Li jx
 * @date: 2019/4/16 20:01
 * @description:
 */
public class LeetCode_169 {
    public int majorityElement(int[] nums) {

        int sum = 0;
        int a = -1;
        for (int i = 0; i < nums.length; i++) {
            if (sum == 0) {
                a = nums[i];
                sum = 1;
            } else if (nums[i] != a) {

                sum--;
            } else
                sum++;
        }
        return a;
    }
}
