package LeetCode.other;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Li jx
 * @date: 2019/9/28 18:53
 * @description:
 */
public class Leet17 {
    List list = new ArrayList();

    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) {
            return list;
        }
        dfs(digits, 0, new StringBuilder());
        return list;
    }

    public void dfs(String s, int index, StringBuilder sb) {
        StringBuilder newSb = new StringBuilder(sb);
        if (newSb.length() == s.length()) {
            list.add(newSb.toString());
            return;
        }
        String zimu = getABC(s.charAt(index));
        for (int j = 0; j < zimu.length(); j++) {
            newSb.append(zimu.charAt(j));
            dfs(s, index + 1, newSb);
            newSb.deleteCharAt(newSb.length() - 1);
        }


    }

    public String getABC(char c) {
        switch (c) {
            case '2':
                return "abc";
            case '3':
                return "def";
            case '4':
                return "ghi";
            case '5':
                return "jkl";
            case '6':
                return "mno";
            case '7':
                return "pqrs";
            case '8':
                return "tuv";
            case '9':
                return "wxyz";
            default:
                throw new IllegalStateException("Unexpected value: " + c);
        }
    }
}
