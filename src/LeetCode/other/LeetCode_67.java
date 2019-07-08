package LeetCode.other;

/**
 * @auther: Li jx
 * @date: 2019/4/16 20:01
 * @description:
 */
public class LeetCode_67 {
    public String addBinary(String a, String b) {
        int aSize = a.length() - 1;
        int bSize = b.length() - 1;
        int bigSize = aSize >= bSize ? aSize + 1 : bSize + 1;
        int[] ints = new int[bigSize + 1];
        int carry = 0;
        while (aSize != -1 && bSize != -1) {
            int i = a.charAt(aSize--);
            int j = b.charAt(bSize--);
            if (i + j - '0' - '0' + carry == 2) {
                ints[bigSize--] = 0;
                carry = 1;
            } else if (i + j - '0' - '0' + carry == 3) {
                ints[bigSize--] = 1;
                carry = 1;
            } else {
                ints[bigSize--] = i + j - '0' - '0' + carry;
                carry = 0;
            }
        }
        while (bSize != -1) {
            if ((b.charAt(bSize--) - '0' + carry) > 1) {
                ints[bigSize--] = 0;
                carry = 1;
            } else {
                ints[bigSize--] = b.charAt(bigSize) - '0' + carry;
                carry = 0;
            }

        }
        while (aSize != -1) {
            if ((a.charAt(aSize--) - '0' + carry) > 1) {
                ints[bigSize--] = 0;
                carry = 1;
            } else {
                ints[bigSize--] = a.charAt(bigSize) - '0' + carry;
                carry = 0;
            }

        }
        if (carry == 1) {
            ints[bigSize] = 1;
        }
        StringBuilder stringBuilder = new StringBuilder();
        if (ints[0] == 1) {
            stringBuilder.append(1);
        }
        for (int i = 1; i < ints.length; i++) {
            stringBuilder.append(ints[i]);
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        new LeetCode_67().addBinary("1010", "1011");
    }
}
