package LeetCode.String;

/**
 * @author: Li jx
 * @date: 2019/7/29 17:05
 * @description:
 */
public class Leet848 {
    public String shiftingLetters(String S, int[] shifts) {
        int length = S.length();
        int[] ints = new int[shifts.length];
        int sum = 0;
        for (int i = length - 1; i >= 0; i--) {
            sum += shifts[i];
            sum = sum % 26;
            ints[i] = sum;
        }
        StringBuilder sb = new StringBuilder();
        for (int s = 0; s < length; s++) {
            sb.append((char) ((S.charAt(s) - 'a' + ints[s]) % 26 + 'a'));
        }
        return sb.toString();
    }
}
