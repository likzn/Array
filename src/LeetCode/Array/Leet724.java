package LeetCode.Array;

/**
 * @author: Li jx
 * @date: 2019/9/20 20:37
 * @description:
 */
public class Leet724 {
    /** 一般求连续数组的和的话，都可以使用前缀和数组，
     * 就是把数组累加起来放到新的数组中。
     *
     * 这题就索引左边的和等于右边的和，我们只要先求出
     * 前缀和数组sum[i]，假设求出索引为index，那么
     * 答案就应该是sum[i - 1] 也就是i左边的数组和
     * 等于sum[sum.length - 1] - sum[i]也就是i右边数组和
     * 相当好理解。
     * */
    public int pivotIndex(int[] nums) {
        int[] sum = new int[nums.length + 1];
        for (int i = 1; i < nums.length+1; i++) {
            //求前缀和数组
            sum[i] = sum[i - 1] + nums[i - 1];
        }
        for (int i = 1; i < sum.length ; i++) {
            //进行一次遍历，i左边等于右边则为答案，否则返回-1
            if (sum[i - 1] == sum[sum.length - 1] - sum[i]) {
                return i - 1;
            }
        }
        return -1;
    }
}
