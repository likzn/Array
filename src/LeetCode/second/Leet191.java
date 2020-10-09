package LeetCode.second;

/**
 * @author: Li jx
 * @date: 2019/11/1 20:34
 * @description:
 */
public class Leet191 {
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            n = (n - 1) & n;
            count++;
        }
        return count;
    }
}
