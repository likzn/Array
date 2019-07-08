package LeetCode.Math;

import java.util.HashMap;
import java.util.TreeMap;

/**
 * @auther: Li jx
 * @date: 2019/4/27 16:16
 * @description:
 */
public class Leet645 {
    public int[] findErrorNums(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        int[] ints = new int[2];
        for (int i = 1; i < nums.length + 1; i++) {
            if (!map.containsKey(i)) {
                ints[1] = i;
            }
            if (map.get(i) != null && map.get(i) == 2) {
                ints[0] = i;
            }
        }
        return ints;
    }
}
