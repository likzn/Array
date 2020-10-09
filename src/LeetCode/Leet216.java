package LeetCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author: Li jx
 * @date: 2020/9/11 21:05
 * @description:
 */
public class Leet216 {
    Set<List<Integer>> res = new HashSet<>();

    public List<List<Integer>> combinationSum3(int k, int n) {
        dfs(k, n, 1, new ArrayList<>());
        return new ArrayList<>(res);
    }

    public void dfs(int k, int n, int index, List<Integer> list) {
        if (k < 0 || n < 0) {
            return;
        }
        if (k == 0 && n == 0) {
            res.add(new ArrayList<>(list));
        }
        for (int i = index; i < 10; i++) {
            list.add(i);
            dfs(k - 1, n - i, index + 1, list);
            list.remove(list.size() - 1);
        }
    }
}
