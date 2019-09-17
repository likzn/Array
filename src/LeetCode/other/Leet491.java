package LeetCode.other;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author: Li jx
 * @date: 2019/9/17 18:24
 * @description:
 */
public class Leet491 {
    Set<List<Integer>> set = new HashSet<>();
    public List<List<Integer>> findSubsequences(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new ArrayList<>();
        }
        dfs(new ArrayList<>(), 0, nums);
        return new ArrayList<>(set);
    }

    public void dfs(List<Integer> list,int index,int[] nums) {
        List<Integer> list1 = new ArrayList<>(list);
        if (list1.size() >= 2) {
            set.add(list1);
        }
        for (int i = index; i < nums.length; i++) {
            if (!list1.isEmpty() && list1.get(list1.size() - 1) > nums[i]) {
                continue;
            }
            list1.add(nums[i]);
            dfs(list1, i + 1, nums);
            list1.remove(list1.size() - 1);
        }
    }
}
