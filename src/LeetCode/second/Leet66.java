package LeetCode.second;

/**
 * @author: Li jx
 * @date: 2019/10/30 14:11
 * @description:
 */
public class Leet66 {
    public int[] plusOne(int[] digits) {
        int cf = 0;
        if (digits[digits.length - 1] == 9) {
            cf = 1;
            digits[digits.length - 1] = 0;
        } else {
            digits[digits.length - 1]++;
        }
        for (int i = digits.length - 2; i >= 0; i--) {
            if (cf==1) {
                if (digits[i] == 9) {
                    digits[i] = 0;
                } else {
                    digits[i]++;
                    cf = 0;
                }
            } else {
                return digits;
            }
        }
        int[] ints = new int[digits.length + 1];
        if (cf == 1) {
            ints[0] = 1;
            return ints;
        }
        return digits;
    }
}
