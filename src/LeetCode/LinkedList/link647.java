package LeetCode.LinkedList;

/**
 * @auther: Li jx
 * @date: 2019/4/15 16:46
 * @description:
 */
public class link647 {
    public static int countSubstrings(String s) {
        int[] ints = get(s);
        int sum = 0;
        for (int i = 1; i < ints.length - 1; i++) {
            if (ints[i] % 2 == 1) {
                sum += (ints[i] - 1) / 2;
            } else {
                sum += ints[i] / 2;
            }
        }
        return sum;
    }

    public static int[] get(String s) {
        int center = 0;
        int rightSide = 0;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("@");
        for (int i = 0; i < s.length(); i++) {
            stringBuilder.append(s.charAt(i));
            stringBuilder.append("@");
        }
        String newString = stringBuilder.toString();
        int[] ints = new int[newString.length()];
        for (int i = 0; i < newString.length(); i++) {
            int left = 2 * center - i;
            if (rightSide > i) {
                if (ints[left] + i < rightSide) {
                    ints[i] = ints[left];
                    continue;
                } else {
                    ints[i] = rightSide - i;
                }
            }

            while (i - ints[i] >= 0 && i + ints[i] < newString.length()) {
                if (newString.charAt(i - ints[i]) == newString.charAt(i + ints[i])) {
                    ints[i]++;
                } else {
                    break;
                }
            }
            center = i;
            rightSide = center + ints[i];
        }
        return ints;
    }

    public static void main(String[] args) {
        String s = "abc";
        int[] ints = get(s);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
        System.out.println(countSubstrings(s));

    }
}
