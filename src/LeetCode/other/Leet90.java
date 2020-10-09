package LeetCode.other;

import Array.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: Li jx
 * @date: 2019/10/15 17:16
 * @description:
 */
public class Leet90 {
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        dfs(nums, new ArrayList<>(), 0);
        return res;
    }

    public void dfs(int[] nums, List<Integer> curList, int index) {
        List<Integer> newList = new ArrayList<>(curList);
        res.add(newList);
        for (int i = index; i < nums.length; i++) {
            if (i > index && nums[i] == nums[i - 1]) {
                continue;
            }
            newList.add(nums[i]);
            dfs(nums, newList, i + 1);
            newList.remove(newList.size() - 1);
        }
    }

    public static void main(String[] args) {
        new Leet90().subsetsWithDup(new int[]{1, 2, 2});
    }
}
