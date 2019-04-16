package LeetCode;

/**
 * @auther: Li jx
 * @date: 2019/4/16 15:48
 * @description:
 */
public class LeetCode_38 {
    public static void main(String[] args) {
        System.out.println(new LeetCode_38().countAndSay(5));
    }
    public String countAndSay(int n) {
        int sum = 1;
        char number = '1';
        String s;
        StringBuilder sb = new StringBuilder();
        sb.append(1);
        for (int i = 1; i < n; i++) {
            sum = 1;
            s = sb.toString();
            StringBuilder stringBuilder = new StringBuilder();
            number = s.charAt(0);
            for (int j = 1; j < s.length(); j++) {
                if (s.charAt(j) != number) {
                    stringBuilder.append(sum);
                    stringBuilder.append(number);
                    number = s.charAt(j);
                    sum = 1;
                } else {
                    sum++;
                    continue;
                }
            }
            stringBuilder.append(sum);
            stringBuilder.append(number);
            sb = stringBuilder;
        }
        return sb.toString();
    }



}
