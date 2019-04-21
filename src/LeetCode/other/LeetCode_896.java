package LeetCode.other;

/**
 * @auther: Li jx
 * @date: 2019/4/16 15:48
 * @description:
 */
public class LeetCode_896 {
    public boolean isMonotonic(int[] A) {
        int a = 0;
        a = A[0];
        for (int i = 1; i < A.length; i++) {
            if (A[i] >= a) {
                a = A[i];
            } else {
                for (int j = 1; j < A.length; j++) {
                    if (A[j] <= a) {
                        a = A[j];
                    } else {
                        return false;
                    }
                }
                break;
            }
        }
        return true;
    }

}
