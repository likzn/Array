package LeetCode.other;

/**
 * @author: Li jx
 * @date: 2019/9/22 13:35
 * @description:
 */
public class Leet796 {
    public boolean rotateString(String A, String B) {
        if (A.length() > B.length()) {
            return false;
        }
        A = A + A;
        return A.contains(B);
    }
}
