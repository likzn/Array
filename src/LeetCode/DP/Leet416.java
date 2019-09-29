package LeetCode.DP;

/**
 * @author: Li jx
 * @date: 2019/9/22 18:02
 * @description:
 */
public class Leet416 {
    /** 相当典型的背包问题，相当于你有个总和为sum/2的背包，问你如何放石头使得背包装满
     *  动态规划指的是自底向上，其实也是穷举只是从下往上穷举，举个例子[3,3,3,4,5]
     *  那我们的背包容量为9，根据dp，我们自底向上也就是从容量为1开始进行放石头，再从2以此类推
     *  放石头也是如此，我们先从只有3一块石头开始放，接着再加一块，因此我们创建dp[容量][石头数]的二维数组
     *    0 1 2 3 4 5 6 7 8 9
     *  3
     *  3
     *  3
     *  4
     *  5
     *  上面的列的图就是状态转移方程，一个个填就完事了，我们从左到右，从上到下依次填入
     *  容量为0 1 2时3的石头是放不下的，所以第一行为：
     *    0 1 2 3 4 5 6 7 8 9
     *  3 0 0 0 3 3 3 3 3 3 3
     *  3
     *  3
     *  4
     *  5
     *  很简单我们只需判断容量足够的情况下，加入新石头和之前装入的谁多进行判断dp[i][j-1], dp[i - nums[j]][j-1] + nums[j]
     *    0 1 2 3 4 5 6 7 8 9
     *  3 0 0 0 3 3 3 3 3 3 3
     *  3 0 0 0 3 3 3 6 6 6 6
     *  3
     *  4
     *  5
     *  后面继续填写答案就出来了
     * */
    public boolean canPartition(int[] nums) {
        //总数
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        //若为奇数直接false
        if ((sum & 1) == 1) {
            return false;
        }
        //dp数组
        int[] dp = new int[sum / 2+1];
        //石头数
        for (int j = 0; j < nums.length; j++) {
            //因为我们使用的是一维数组，所以应从后往前遍历
            for (int i = dp.length-1 ; i >= 0; i--) {
                if (i >= nums[j]) {
                    dp[i] = Math.max(dp[i], dp[i - nums[j]] + nums[j]);
                }
            }
        }
        //判断是否装满
        return dp[sum / 2] == sum / 2;
    }
}
