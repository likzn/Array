package LeetCode.other;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Li jx
 * @date: 2019/10/16 14:50
 * @description:
 */
public class Leet60 {
    int size = 0;
    String result = "";

    public String getPermutation(int n, int k) {
        int[] ints = new int[n + 1];
        dfs(ints, k, 1, "", n);
        return result;
    }

    public void dfs(int[] nums, int k, int index, String cur, int n) {
        for (int i = index; i < nums.length; i++) {
            if (size == k) {
                return;
            }
            if (nums[i] == 1) {
                continue;
            }
            nums[i] = 1;
            dfs(nums, k, 1, cur + i, n);
            nums[i] = 0;
        }
        if (size == k - 1 && cur.length() == n) {
            result = cur;
            size++;
            return;
        }
        if (cur.length() == n) {
            size++;
        }
    }

    public static void main(String[] args) {
        new Leet60().getPermutation(4, 6);
    }
}
