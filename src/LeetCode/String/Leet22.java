package LeetCode.String;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Li jx
 * @date: 2019/9/3 16:54
 * @description:
 */
public class Leet22 {
    public List<String> generateParenthesis(int n) {
        List list = new ArrayList();
        find(0, 0, list, "",n);
        return list;
    }

    public void find(int count1, int count2, List list, String str,int limit) {
        if (count1 > limit || count2 > limit) {
            return;
        }
        if (count1 == limit && count2 == limit) {
            list.add(str);
        }
        if (count1 >= count2) {
            find(count1 + 1, count2, list, str + "(", limit);
            find(count1, count2 + 1, list, str + ")", limit);
        }
    }
}
