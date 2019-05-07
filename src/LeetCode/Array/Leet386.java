package LeetCode.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @auther: Li jx
 * @date: 2019/4/27 15:50
 * @description:
 */
public class Leet386 {
    public List<Integer> lexicalOrder(int n) {

        List<String> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(String.valueOf(i));
        }
        Collections.sort(list);
        List<Integer> list1 = new ArrayList<>();

        for (String s : list) {
            list1.add(Integer.valueOf(s));

        }
        return list1;
    }

}