package LeetCode.other;

/**
 * @author: Li jx
 * @date: 2019/9/15 18:49
 * @description:
 */
public class Leet434 {
    public int countSegments(String s) {
        int sum = 0;
        boolean word = false;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (!word) {
                if (c != ' ') {
                    word = true;
                }
            } else {
                if (c != ' ') {
                    continue;
                } else {
                    word = false;
                    sum++;
                }
            }
        }
        if (word) {
            sum++;
        }
        return sum;
    }
}
