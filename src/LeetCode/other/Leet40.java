package LeetCode.other;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * @author: Li jx
 * @date: 2019/9/4 16:45
 * @description:
 */
public class Leet40 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List list = new ArrayList();
        Arrays.sort(candidates);
        find(candidates, target, 0, list, new ArrayList(), 0);
        return new ArrayList<>(new HashSet<>(list));

    }

    public void find(int[] candidates, int target, int sum, List list, List curList, int index) {
        if (sum == target) {
            list.add(curList);
            return;
        }
        for (int i = index; i < candidates.length; i++) {
            if (sum + candidates[i] > target) {
                return;
            } else {
                List list1 = new ArrayList(curList);
                list1.add(candidates[i]);
                find(candidates, target, sum + candidates[i], list, list1, i + 1);
            }
        }
    }

}
