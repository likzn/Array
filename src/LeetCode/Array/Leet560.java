package LeetCode.Array;

import java.util.HashMap;

/**
 * @author: Li jx
 * @date: 2019/8/13 17:20
 * @description:
 */
public class Leet560 {
    public int subarraySum(int[] nums, int k) {
        int[] ints = new int[nums.length+1];
        int s = 0;
        int sum = 0;
        ints[0] = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            ints[i+1] = sum;
        }
        for (int i = 0; i < nums.length+1; i++) {
            for (int j = 0; j < i; j++) {
                if (ints[i]-ints[j]==k) {
                    s++;
                }
            }
        }
        return s;
    }
}
