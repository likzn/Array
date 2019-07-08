package LeetCode.other;

/**
 * @auther: Li jx
 * @date: 2019/4/16 15:48
 * @description:
 */
public class LeetCode_389 {
    public char findTheDifference(String s, String t) {
        char[] s1 = s.toCharArray();
        char[] s2 = t.toCharArray();
        int[] ints = new int[26];
        for (int i = 0; i < s.length(); i++) {
            ints[s1[i] - 'a']++;

        }
        for (int i = 0; i < t.length(); i++) {
            ints[s2[i] - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (ints[i] != 0) {
                return (char) (i + 'a');
            }
        }
        return ' ';

    }

}
