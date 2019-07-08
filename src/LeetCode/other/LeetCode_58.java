package LeetCode.other;

/**
 * @auther: Li jx
 * @date: 2019/4/16 20:01
 * @description:
 */
public class LeetCode_58 {
    public int lengthOfLastWord(String s) {
        String[] strings = s.split(" ");
        return strings.length == 0 ? 0 : strings[strings.length - 1].length();
    }

    public static void main(String[] args) {
        String s = "    ";
        System.out.println(new LeetCode_58().lengthOfLastWord(s));
    }
}
