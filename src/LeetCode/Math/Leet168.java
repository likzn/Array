package LeetCode.Math;

/**
 * @auther: Li jx
 * @date: 2019/4/27 16:16
 * @description:
 */
public class Leet168 {
    public String convertToTitle(int n) {
        if (n == 0) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        while (n != 0) {
            n--;
            stringBuilder.append((char) (n % 26 + 'A'));
            n = n / 26;
        }
        return stringBuilder.reverse().toString();
    }
}
