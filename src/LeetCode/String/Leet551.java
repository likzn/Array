package LeetCode.String;

/**
 * @author: Li jx
 * @date: 2019/8/14 16:27
 * @description:
 */
public class Leet551 {
    public boolean checkRecord(String s) {
        if (s == null) {
            return false;
        }
        char[] chars = s.toCharArray();
        int Lsize = 0;
        int Asize = 0;
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (c == 'A') {
                Asize++;
                Lsize = 0;
            }
            if (c == 'L') {
                Lsize++;
            }
            if (c == 'P') {
                Lsize = 0;
            }
            if (Asize > 1) {
                return false;
            }
            if (Lsize == 3) {
                return false;
            }
        }
        return true;
    }
}
