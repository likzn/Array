package LeetCode.String;

import java.util.TreeSet;

/**
 * @auther: Li jx
 * @date: 2019/4/21 16:04
 * @description:
 */
public class Leet804 {
    public int uniqueMorseRepresentations(String[] words) {
        String[] word = new String[]{".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        TreeSet set = new TreeSet();
        for (String w : words) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < w.length(); i++) {
                stringBuilder.append(word[w.charAt(i) - 'a']);
            }
            set.add(stringBuilder.toString());
        }
        return set.size();
    }
}
