package LeetCode.other;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * @author: Li jx
 * @date: 2019/9/17 18:37
 * @description:
 */
public class Leet78 {
    List<List<Integer>> allList = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new ArrayList<>();
        }
        dfs(nums, 0, new ArrayList<>());
        return allList;

    }

    public void dfs(int[] nums, int index, List<Integer> list) {
        List<Integer> list1 = new ArrayList<>(list);
        allList.add(list1);
        for (int i = index; i < nums.length; i++) {
            list1.add(nums[i]);
            dfs(nums,i+1,list1);
            list1.remove(list1.size() - 1);
        }
    }
}
