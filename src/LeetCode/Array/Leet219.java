package LeetCode.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

/**
 * @auther: Li jx
 * @date: 2019/4/27 15:50
 * @description:
 */
public class Leet219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        TreeMap<Integer, Integer> map = new TreeMap();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                if (Math.abs(map.get(nums[i]) - i) <= k) {
                    return true;
                }
            }
                map.put(nums[i], i);
        }
        return false;
    }

}