package LeetCode.other;

import java.util.*;

/**
 * @auther: Li jx
 * @date: 2019/4/28 10:39
 * @description:
 */
public class Leet290 {
    public boolean wordPattern(String pattern, String str) {
        String[] strs = str.split("\\s");
        if (pattern.length() != strs.length) {
            return false;
        }
        HashMap<Character, String> map1 = new HashMap();
        HashMap<String, Character> map2 = new HashMap();
        for (int i = 0; i < strs.length; i++) {
            if (map1.containsKey(pattern.charAt(i))&& !map1.get(pattern.charAt(i)).equals(strs[i])) {
                return false;
            }
            if (map2.containsKey(strs[i]) && !map2.get(strs[i]).equals(pattern.charAt(i))) {

                return false;
            }
            map1.put(pattern.charAt(i), strs[i]);
            map2.put(strs[i], pattern.charAt(i));
        }
        return true;

    }
}
