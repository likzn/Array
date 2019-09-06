package LeetCode.Map;

import java.util.HashMap;

/**
 * @author: Li jx
 * @date: 2019/9/6 12:13
 * @description:
 */
public class Leet299 {
    public String getHint(String secret, String guess) {
        int[] ints = new int[secret.length()];
        HashMap<Character, Integer> map = new HashMap<>();
        int bullNum = 0;
        int cowNum = 0;
        for (int i = 0; i < secret.length(); i++) {
            char c = secret.charAt(i);
            if (!map.containsKey(c)) {
                map.put(c, 1);
            } else {
                map.put(c, map.get(c) + 1);
            }
            ints[i] = 1;
        }

        for (int i = 0; i < secret.length(); i++) {
            if (secret.charAt(i) == guess.charAt(i)) {
                bullNum++;
                map.put(secret.charAt(i), map.get(secret.charAt(i)) - 1);
                ints[i] = 0;
            }
        }
        for (int i = 0; i < guess.length(); i++) {
            if (map.containsKey(guess.charAt(i)) && map.get(guess.charAt(i)) != 0 && ints[i] == 1) {
                map.put(guess.charAt(i), map.get(guess.charAt(i)) - 1);
                cowNum++;
            }
        }
        return bullNum + "A" + cowNum + "B";
    }
}
