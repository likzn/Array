package LeetCode.剑指offer;

/**
 * @author: Li jx
 * @date: 2019/11/8 14:26
 * @description:
 */
public class Offer10 {
    public int RectCover(int target) {
        if (target == 0) {
            return 0;
        }
        return dfs(target);
    }
    public int dfs(int target) {
        if (target == 0) {
            return 1;
        } else if (target == -1) {
            return 0;
        }
        return dfs(target - 1) + dfs(target - 2);
    }
}
