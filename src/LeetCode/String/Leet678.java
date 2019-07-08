package LeetCode.String;

/**
 * @auther: Li jx
 * @date: 2019/7/2 08:48
 * @description:
 */
public class Leet678 {
    public boolean checkValidString(String s) {
        int[] ints = new int[2];
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                ints[0]++;
            }
            if (s.charAt(i) == ')') {
                if (ints[0] != 0) {
                    ints[0]--;
                } else {
                    if (ints[1] != 0) {
                        ints[1]--;
                    } else {
                        return false;
                    }
                }
            }
            if (s.charAt(i) == '*') {
                ints[1]++;
            }
        }
        ints[0] = 0;
        ints[1] = 0;
        for (int i = s.length()-1; i >=0; i--) {
            if (s.charAt(i) == ')') {
                ints[0]++;
            }
            if (s.charAt(i) == '(') {
                if (ints[0] != 0) {
                    ints[0]--;
                } else {
                    if (ints[1] != 0) {
                        ints[1]--;
                    } else {
                        return false;
                    }
                }
            }
            if (s.charAt(i) == '*') {
                ints[1]++;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        new Leet678().checkValidString("(*)(");
    }
}
