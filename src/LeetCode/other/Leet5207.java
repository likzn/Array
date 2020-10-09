package LeetCode.other;

import java.util.Arrays;

/**
 * @author: Li jx
 * @date: 2019/9/29 20:00
 * @description:
 */
public class Leet5207 {
    public int equalSubstring(String s, String t, int maxCost) {
        int[] sum = new int[s.length()];
        int[] frontSum = new int[s.length() + 1];
        for (int i = 0; i < s.length(); i++) {
            sum[i] = Math.abs(s.charAt(i) - t.charAt(i));
            frontSum[i + 1] = frontSum[i] + sum[i];
        }
        Arrays.sort(sum);
        int length = 0;
        int left = 0;
        int right = 0;
        while (right < frontSum.length) {
            if (frontSum[right] - frontSum[left] > maxCost) {
                left++;
            } else {
                length = Math.max(length, frontSum[right] - frontSum[left] <= maxCost ? right - left : 0);
                right++;
            }

        }
        return length;
    }

    public static void main(String[] args) {
        new Leet5207().equalSubstring("krrgw",
                "zjxss",
                19);

    }
}
