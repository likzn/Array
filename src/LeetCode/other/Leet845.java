package LeetCode.other;

/**
 * @author: Li jx
 * @date: 2019/9/29 13:35
 * @description:
 */
public class Leet845 {
    public int longestMountain(int[] A) {
        int max = Integer.MIN_VALUE;
        for (int i = 1; i < A.length - 1; i++) {
            int sum = 1;
            int left = i - 1;
            int right = i + 1;
            while (left >= 0 && A[left] < A[left + 1]) {
                sum += 1;
                left--;
            }
            while (right < A.length && A[right] < A[right - 1]) {
                sum += 1;
                right++;
            }
            if (left != i-1 && right != i+1) {

                max = Math.max(max, sum);
            }
        }
        return max == 1 || max == Integer.MIN_VALUE ? 0 : max;
    }
}
