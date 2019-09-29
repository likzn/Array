package LeetCode.other;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * @author: Li jx
 * @date: 2019/9/28 12:54
 * @description:
 */
public class Leet47 {
    HashSet<List<Integer>> set = new HashSet<>();

    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        int[] flag = new int[nums.length];
        dfs(nums, flag, new ArrayList());
        return new ArrayList<>(set);
    }

    public void dfs(int[] nums, int[] flag, List list) {
        List<Integer> newList = new ArrayList<>(list);
        if (newList.size() == nums.length) {
            set.add(newList);
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (i!=0&&nums[i] == nums[i - 1]&&flag[i-1]==1) {
                continue;
            }
            if (flag[i] == 1 ) {
                continue;
            }
            flag[i] = 1;
            newList.add(nums[i]);
            dfs(nums, flag, newList);
            newList.remove(newList.size() - 1);
            flag[i] = 0;
        }
    }
}
