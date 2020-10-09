package LeetCode.LeetCodeWeekend;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: Li jx
 * @date: 2019/11/10 11:15
 * @description:
 */
public class Leet5258 {
    int max = 0;
    public int maxScoreWords(String[] words, char[] letters, int[] score) {
        int[] allLetter = new int[26];
        for (int i = 0; i < letters.length; i++) {
            allLetter[letters[i] - 'a']++;
        }
        dfs(words, allLetter, score, 0, 0);
        return max;

    }

    public void dfs(String[] words, int[] allLetter, int[] score, int index,int curSum) {
        for (int i = index; i < words.length; i++) {
            String word = words[i];
            boolean flag = true;
            int[] ints = new int[26];
            for (int j = 0; j < word.length(); j++) {
                char c = word.charAt(j);
                ints[c - 'a']++;
            }
            for (int j = 0; j < word.length(); j++) {
                char c = word.charAt(j);
                if (ints[c - 'a'] > allLetter[c - 'a']) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                for (int j = 0; j < word.length(); j++) {
                    char c = word.charAt(j);
                    allLetter[c - 'a']--;
                    curSum += score[c - 'a'];
                }
                max = Math.max(max, curSum);
                dfs(words, allLetter, score, i + 1, curSum);
                for (int j = 0; j < word.length(); j++) {
                    char c = word.charAt(j);
                    allLetter[c - 'a']++;
                    curSum -= score[c - 'a'];
                }
            }
        }
    }

    public static void main(String[] args) {
        new Leet5258().maxScoreWords(new String[]{"dog", "cat", "dad", "good"}, new char[]{'a', 'a', 'c', 'd', 'd', 'd', 'g', 'o', 'o'}, new int[]{1, 0, 9, 5, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
    }
}
