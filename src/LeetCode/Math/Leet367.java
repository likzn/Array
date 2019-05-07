package LeetCode.Math;

/**
 * @auther: Li jx
 * @date: 2019/4/27 16:16
 * @description:
 */
public class Leet367 {
    public boolean isPerfectSquare(int num) {
        double a = 0;
        while (a * a < num) {
            a++;
        }
        return a * a == num;
    }
}
