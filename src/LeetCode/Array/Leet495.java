package LeetCode.Array;

import java.util.Arrays;

/**
 * @auther: Li jx
 * @date: 2019/4/27 15:50
 * @description:
 */
public class Leet495 {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if (timeSeries.length == 0) {

            return 0;
        }
        int sum = 0;
        int jiange = 0;
        for (int i = 1; i < timeSeries.length; i++) {
            jiange = timeSeries[i] - timeSeries[i - 1];
            if (jiange <= duration) {
                sum += jiange;
            } else {
                sum += duration;
            }
        }
        return sum+duration;

    }
}
