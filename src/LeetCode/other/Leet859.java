package LeetCode.other;

/**
 * @author: Li jx
 * @date: 2019/10/1 14:31
 * @description:
 */
public class Leet859 {
    public boolean buddyStrings(String A, String B) {
        if (A.length() != B.length()) {
            return false;
        }
        int time = 0;
        int[] ints = new int[26];
        for (int i = 0; i < A.length(); i++) {
            ints[A.charAt(i)]++;
            ints[B.charAt(i)]--;
            if (A.charAt(i) != B.charAt(i)) {
                time++;
            }
        }
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] != 0) {
                return false;
            }
        }
        if (time == 2 || time == 0) {
            return true;
        }
        return false;
    }
}
