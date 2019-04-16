package LeetCode.kmp;

import sun.plugin2.message.GetAppletMessage;

/**
 * @auther: Li jx
 * @date: 2019/4/16 14:59
 * @description:
 */
public class KMP {
    public int kmp(String s, String p) {
        char[] s1 = s.toCharArray();
        char[] p2 = p.toCharArray();
        int[] next = getNext(p);
        int i = 0;
        int j = 0;
        while (i < s1.length && j < p2.length) {
            if (j==-1||s1[i] == p2[j]) {
                i++;
                j++;
            } else {
                j = next[j];
            }
        }
        if (j == p2.length) {
            return i - j;
        } else {
            return -1;
        }
    }



    public static int[] getNext(String s) {
        char[] p = s.toCharArray();
        int next[] = new int[s.length()];
        next[0] = -1;
        int k = -1;
        int j = 0;
        while (j < p.length-1) {
            if (k == -1 || p[k] == p[j]) {
                if (p[++j] == p[++k]) {
                    next[j] = next[k];
                } else {
                    next[j] = k;
                }
            } else {
                k = next[k];
            }
        }
        return next;
    }

    public static void main(String[] args) {
        System.out.println(new KMP().kmp("hello", "hell"));
    }
}
