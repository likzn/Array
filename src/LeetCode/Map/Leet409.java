package LeetCode.Map;

import java.util.HashMap;

/**
 * @auther: Li jx
 * @date: 2019/4/21 19:47
 * @description:
 */
public class Leet409 {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        int sum = 0;
        int single = 0;
        for (Character w : map.keySet()) {
            int a = map.get(w);
            if (a % 2 == 0) {
                sum += a;
            } else {
                sum += a - 1;
                single = 1;
            }
        }

        if (single == 1) {
            sum++;
        }
        return sum;
    }
}
