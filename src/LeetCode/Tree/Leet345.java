package LeetCode.Tree;

import java.util.Collections;
import java.util.HashSet;

/**
 * @author: Li jx
 * @date: 2019/9/17 13:12
 * @description:
 */
public class Leet345 {
    public String reverseVowels(String s) {
        HashSet<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');
        int left = 0;
        int right = s.length() - 1;
        char[] chars = s.toCharArray();
        while (left <= right) {
            char leftChar = chars[left];
            char rightChar = chars[right];
            if (set.contains(leftChar) && set.contains(rightChar)) {
                chars[left] = rightChar;
                chars[right] = leftChar;
                left++;
                right--;
            } else if (!set.contains(leftChar) && set.contains(rightChar)) {
                left++;
            } else if (set.contains(leftChar) && !set.contains(rightChar)) {
                right--;
            } else {
                left++;
                right--;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            stringBuilder.append(chars[i]);
        }
        return stringBuilder.toString();


    }
}
