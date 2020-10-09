package LeetCode.second;

import java.util.Arrays;

/**
 * @author: Li jx
 * @date: 2019/10/31 14:34
 * @description:
 */
public class Leet274 {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int a = 1;
        for (int i = citations.length - 1; i >= 0; i--) {
            if (citations[i] >= a++) {
                return citations[i];
            }
        }
        return 0;
    }
}
