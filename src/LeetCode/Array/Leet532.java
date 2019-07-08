package LeetCode.Array;

import Array.Array;

import java.util.*;

/**
 * @auther: Li jx
 * @date: 2019/4/27 15:50
 * @description:
 */
public class Leet532 {
    public int findPairs(int[] nums, int k) {
        if (k < 0) {
            return 0;
        }
        int ans = 0;
        HashMap<Integer, Integer> map = new HashMap();
        for (int num : nums) {
            map.put(num, map.containsKey(num) ? 1 + map.get(num) : 1);
        }
        if (k == 0) {
            for (int num : map.keySet()) {
                if (map.get(num) > 1)
                    ans++;
            }
        } else {
            for (int num : map.keySet()) {
                if (map.containsKey(num + k))
                    ans++;
            }
        }
        return ans;
    }
}