package LeetCode.other;

/**
 * @author: Li jx
 * @date: 2019/10/8 16:47
 * @description:
 */
public class Leet485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int time = 0;
        int max = 0;
        for (int num : nums) {
            if (num == 0) {
                time = 0;
                continue;
            }
            time++;
            max = Math.max(max, time);
        }
        return max;
    }
}
