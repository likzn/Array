package LeetCode.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: Li jx
 * @date: 2019/9/21 12:38
 * @description:
 */
public class Leet830 {
    public List<List<Integer>> largeGroupPositions(String S) {
        List<List<Integer>> allList = new ArrayList<>();
        int j = 0;
        for (int i = 0; i < S.length(); i++) {
            if (i == S.length() - 1 || S.charAt(i) != S.charAt(i + 1)) {
                if (i - j >= 2) {
                    allList.add(Arrays.asList(j, i));
                }
                j = i + 1;
            }
        }
        return allList;
    }
}
