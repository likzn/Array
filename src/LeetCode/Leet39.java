package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author: Li jx
 * @date: 2020/9/9 12:35
 * @description:
 */
public class Leet39 {
    static List<List<Integer>> res = new ArrayList<>();

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        dfs(candidates, target, new ArrayList<>(), 0);
        return res;
    }

    public static void dfs(int[] candidates, int target, List<Integer> list, int index) {
        if (target == 0) {
            res.add(list);
            return;
        }
        for (int i = index; i < candidates.length; i++) {
            if (target - candidates[i] < 0) {
                return;
            }
            list.add(candidates[i]);
            dfs(candidates, target - candidates[i], new ArrayList<>(list), i);
            list.remove(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(combination(2, 3));

    }

    public static int combination(int r, int n) {

        double res = 1;
        int x = Math.max(r, n - r);
        int z = Math.min(r, n - r);
        for (int i = x + 1; i <= n; i++) {
            res = res * i;

        }
        for (int i = 1; i <= z; i++) {
            res = res / i;

        }

        return (int) res;
    }

    public int[] arrayMerge(int[] array1, int n, int[] array2, int m) {
        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            res.add(array1[i]);
        }
        for (int i = 0; i < m; i++) {
            res.add(array2[i]);

        }
        Collections.sort(res);
        int[] ints = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            ints[i] = res.get(i);
        }
        return ints;
    }

}
