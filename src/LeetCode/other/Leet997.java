package LeetCode.other;

/**
 * @author: Li jx
 * @date: 2019/10/1 18:14
 * @description:
 */
public class Leet997 {
    public int findJudge(int N, int[][] trust) {
        int[][] ints = new int[N + 1][N + 1];
        for (int i = 0; i < trust.length; i++) {
            ints[trust[i][0]][trust[i][1]] = 1;
        }
        for (int i = 1; i < ints.length; i++) {
            int sum = 0;
            for (int j = 1; j < ints[i].length; j++) {
                if (ints[j][i]==1) {
                    sum++;
                }
            }
            if (sum == N - 1) {
                for (int j = 0; j < ints.length; j++) {
                    if (ints[i][j] == 1) {
                        return -1;
                    }
                }
                return i;
            }
        }
        return -1;
    }
}
