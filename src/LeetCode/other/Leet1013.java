package LeetCode.other;

/**
 * @author: Li jx
 * @date: 2019/10/3 14:19
 * @description:
 */
public class Leet1013 {
    public boolean canThreePartsEqualSum(int[] A) {
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
        }
        if (sum % 3 != 0) {
            return false;
        }
        int everySum = sum / 3;
        int left = 0;
        int right = A.length - 1;
        int leftSum = 0;
        int rightSum = 0;
        while (true) {
            leftSum += A[left++];
            if (left == A.length) {
                return false;
            }
            if (leftSum == everySum) {
                break;
            }
        }
        while (true) {
            rightSum += A[right--];
            if (right == left-1) {
                return false;
            }
            if (rightSum == everySum) {
                break;
            }
        }
        return true;
    }
}
