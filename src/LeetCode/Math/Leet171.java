package LeetCode.Math;

/**
 * @auther: Li jx
 * @date: 2019/4/27 16:16
 * @description:
 */
public class Leet171 {
    public int titleToNumber(String s) {
        StringBuilder stringBuilder = new StringBuilder(s);
        String s1 = stringBuilder.reverse().toString();
        int sum = 0;
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            sum = (int) (sum + (c - 'A' + 1) * Math.pow(26, i));

        }
        return sum;
    }
}
