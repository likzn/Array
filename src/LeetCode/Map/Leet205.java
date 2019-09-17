package LeetCode.Map;

import java.util.HashMap;

/**
 * @author: Li jx
 * @date: 2019/9/13 13:14
 * @description:
 */
public class Leet205 {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map1 = new HashMap<Character, Character>();
        for (int i = 0; i < s.length(); i++) {
            char s1 = s.charAt(i);
            char s2 = t.charAt(i);
            if (!map1.containsKey(s1)) {
                if (map1.containsValue(s2)) {
                    return false;
                }
                map1.put(s1, s2);
            } else if (map1.containsKey(s1)) {
                if (!map1.get(s1).equals(s2)) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;

    }

}
