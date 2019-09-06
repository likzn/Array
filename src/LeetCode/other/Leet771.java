package LeetCode.other;

import java.util.HashMap;

/**
 * @author: Li jx
 * @date: 2019/8/28 17:16
 * @description:
 */
public class Leet771 {
    public int numJewelsInStones(String J, String S) {
        char[] s = S.toCharArray();
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length; i++) {
            if (map.containsKey(s[i])) {
                map.put(s[i], map.get(s[i]) + 1);
            } else {
                map.put(s[i], 1);
            }
        }
        int sum = 0;
        for (int i = 0; i < J.length(); i++) {
            if (map.containsKey(J.charAt(i))) {
                sum += map.get(J.charAt(i));
            }
        }
        return sum;
    }
}
