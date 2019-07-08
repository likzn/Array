package LeetCode.String;

/**
 * @auther: Li jx
 * @date: 2019/7/2 08:48
 * @description:
 */
public class Leet165 {
    public int compareVersion(String version1, String version2) {

        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        int length = v1.length <= v2.length ? v1.length : v2.length;
        int i = 0;
        for (i = 0; i < length; i++) {
            int a = Integer.parseInt(v1[i]);
            int b = Integer.parseInt(v2[i]);
            if (a < b) {
                return -1;
            } else if (a > b) {
                return 1;
            }
        }
        while (i < v1.length) {
            if (Integer.parseInt(v1[i]) != 0) {
                return 1;
            }
            i++;
        }
        while (i < v2.length) {
            if (Integer.parseInt(v1[i]) != 0) {
                return -1;
            }
            i++;
        }
        return 0;
    }
}
