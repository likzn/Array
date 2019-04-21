package LeetCode.other;

/**
 * @auther: Li jx
 * @date: 2019/4/17 17:00
 * @description:
 */
public class LeetCode_125 {
    public boolean isPalindrome(String s) {
        s = s.replace(" ", "").replace(",", "").replace(":", "").replace(".", "");
        StringBuilder stringBuilder = new StringBuilder(s);
        String s1 = stringBuilder.reverse().toString();

        return s.equalsIgnoreCase(s1);
    }

    public static void main(String[] args) {
        new LeetCode_125().isPalindrome("A man, a plan, a canal: Panama");
    }
}
