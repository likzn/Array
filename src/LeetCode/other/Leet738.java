package LeetCode.other;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Li jx
 * @date: 2019/9/11 15:28
 * @description:
 */
public class Leet738 {
    public int monotoneIncreasingDigits(int N) {
        List<Integer> list = new ArrayList<>();
        while (N != 0) {
            list.add(N % 10);
            N = N / 10;
        }
        int[] ints = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ints[i] = list.get(ints.length - i - 1);
        }
        for (int i = ints.length - 2; i >= 0; i--) {
            if (ints[i] > ints[i + 1]) {
                ints[i] -= 1;
                for (int j = i + 1; j < ints.length; j++) {
                    ints[j] = 9;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        if (ints[0] != 0) {
            sb.append(ints[0]);
        }
        for (int i = 1; i < ints.length; i++) {

            sb.append(ints[i]);
        }
        return Integer.parseInt(sb.toString());
    }


}
