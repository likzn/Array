package LeetCode.other;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Li jx
 * @date: 2019/10/16 14:43
 * @description:
 */
public class Leet22 {
    List<String> res = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        dfs(n, n, "");
        return res;
    }

    public void dfs(int left, int right, String cur) {
        if (left > right || left < 0 ) {
            return;
        }
        if (left == 0 && right == 0) {
            res.add(cur);
        }
        dfs(left - 1, right, cur + "(");
        dfs(left, right - 1, cur + ")");
    }
}
