package LeetCode.other;

import java.util.HashMap;

/**
 * @author: Li jx
 * @date: 2019/9/7 15:45
 * @description:
 */
public class Leet383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] ints = new int[300];
        for (int i = 0; i < magazine.length(); i++) {
            ints[magazine.charAt(i) - 'a']++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            ints[ransomNote.charAt(i) - 'a']--;
        }
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] < 0) {
                return false;
            }
        }
        return true;
    }
}
