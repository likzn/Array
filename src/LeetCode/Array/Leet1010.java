package LeetCode.Array;

/**
 * @author: Li jx
 * @date: 2019/9/22 13:53
 * @description:
 */
public class Leet1010 {
    public int numPairsDivisibleBy60(int[] time) {
        int[] ints = new int[60];
        int sum = 0;
        for (int i = 0; i < time.length; i++) {
            if (time[i]%60 == 0) {
                sum += ints[0];
            } else {
                sum += ints[60 - time[i] % 60];
            }
            ints[time[i] % 60]++;
        }
        return sum;
    }
}
