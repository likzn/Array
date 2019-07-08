package LeetCode.other;

import java.util.Arrays;
import java.util.TreeMap;

/**
 * @auther: Li jx
 * @date: 2019/4/28 10:39
 * @description:
 */
public class Leet594 {
    public int findLHS(int[] nums) {
        TreeMap<Integer, Integer> map = new TreeMap();
        for (Integer i : nums) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }
        int sum = 0;
        int a = 0;
        for (Integer i : map.keySet()) {
            if (map.containsKey(i + 1)) {
                a = map.get(i) + map.get(i + 1);
            }
            sum = Math.max(a, sum);
        }
        return sum;
    }
}
