package LeetCode.Array;

import java.util.HashMap;

/**
 * @author: Li jx
 * @date: 2019/7/29 13:56
 * @description:
 */
public class Leet523 {
    public boolean checkSubarraySum(int[] nums, int k) {
        if (nums.length < 2) {
            return false;
        }
        for (int i = 0; i < nums.length - 1; ++i) {
            if (nums[i] == 0 && nums[i + 1] == 0) {
                return true;
            }
        }
        if (k == 0) {
            return false;
        }
        if (k < 0) {
            k = -k;
        }
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (map.containsKey(sum % k)) {
                if (i - map.get(sum % k) > 1) {
                    return true;
                }
            }
            map.put(sum % k, i);
        }
        return false;
    }
}
