package LeetCode.other;

import LeetCode.Tree.TreeNode;

import java.util.*;

/**
 * @author: Li jx
 * @date: 2019/9/27 13:01
 * @description:
 */
public class Leet506 {
    public String[] findRelativeRanks(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],i);
        }
        String[] strings = new String[nums.length];
        Arrays.sort(nums);
        if (nums.length == 1) {
            strings[map.get(nums[nums.length - 1])] ="Gold Medal";
            return strings;
        }
        strings[map.get(nums[nums.length - 1])] ="Gold Medal";
        if (nums.length == 2) {
            strings[map.get(nums[nums.length - 2])] ="Silver Medal";
            return strings;
        }
        strings[map.get(nums[nums.length - 2])] ="Silver Medal";
        if (nums.length == 3) {
            strings[map.get(nums[nums.length - 3])] ="Bronze Medal";
            return strings;
        }
        strings[map.get(nums[nums.length - 3])] ="Bronze Medal";
        for (int i = nums.length - 4; i >= 0; i--) {
            strings[map.get(nums[i])] = "" + (nums.length - i);
        }
        return strings;
    }
}
