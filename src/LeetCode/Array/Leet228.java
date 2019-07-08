package LeetCode.Array;

import HashTable.HashTable;

import java.util.*;

/**
 * @auther: Li jx
 * @date: 2019/4/27 15:50
 * @description:
 */
public class Leet228 {
    public List<String> summaryRanges(int[] nums) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        if (nums.length == 0) {
            return null;
        }
        map.put(nums[0], nums[0]);
        int j = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (map.get(j).equals(nums[i] - 1)) {
                map.put(j, nums[i]);
            } else {
                j = nums[i];
                map.put(j, j);
            }
        }
        List<String> list = new ArrayList<>();
        for (Integer i : map.keySet()) {
            if (!i.equals(map.get(i))) {
                String s = i + "->" + map.get(i);
                list.add(s);
            } else {

                list.add(String.valueOf(i));
            }
        }
        return list;
    }
}