package LeetCode.other;

/**
 * @author: Li jx
 * @date: 2019/8/14 16:21
 * @description:
 */
public class Leet231 {
    public boolean isPowerOfTwo(int n) {
        if (n == 0) {
            return false;
        }
        int sum = 0;
        while (n != 0) {
            if ((n & 1) == 1) {
                sum++;
            }
            if (sum > 1) {
                return false;
            }
            n = n >> 1;
        }
        return true;
    }
}
