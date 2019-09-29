package LeetCode.other;

/**
 * @author: Li jx
 * @date: 2019/9/28 21:29
 * @description:
 */
public class Leet791 {
    public String customSortString(String S, String T) {
        int[] timeT = new int[200];
        for (int i = 0; i < T.length(); i++) {
            timeT[T.charAt(i)]++;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < S.length(); i++) {
            while (timeT[S.charAt(i)]-- != 0) {
                stringBuilder.append(S.charAt(i));
            }
        }
        for (int i = 0; i < 200; i++) {
            while (timeT[i]-- > 0) {
                stringBuilder.append((char) i);
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        new Leet791().customSortString("cba", "abcd");
    }
}
