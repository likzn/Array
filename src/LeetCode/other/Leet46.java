package LeetCode.other;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: Li jx
 * @date: 2019/9/17 13:57
 * @description:
 */
public class Leet46 {
    List allList = new ArrayList();
    public List<List<Integer>> permute(int[] nums) {

        dfs(nums, new int[nums.length], new ArrayList());
        return allList;
    }

    public void dfs(int[] nums, int[] flag, List list) {
        List newList = new ArrayList(list);
        if (list.size() == nums.length) {
            allList.add(newList);
        }
        for (int i = 0; i < nums.length; i++) {
            if (flag[i] == 1) {
                continue;
            }
            flag[i] = 1;
            newList.add(nums[i]);
            dfs(nums, flag, newList);
            newList.remove(newList.size() - 1);
            flag[i] = 0;
        }
    }

    public static void main(String[] args) {
        new Leet46().permute(new int[]{1, 2, 3});
    }
}
