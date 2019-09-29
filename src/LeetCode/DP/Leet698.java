package LeetCode.DP;

import LeetCode.kmp.KMP;

import java.text.DateFormatSymbols;
import java.util.Arrays;

/**
 * @author: Li jx
 * @date: 2019/9/18 16:53
 * @description:
 */
public class Leet698 {

    /** 如果放入k个子集，那每个子集的和必然是nums的总和除以k，
     * 所以我们先算出每个子集和然后创建k个桶，
     * 让每个数字放入k个桶中并使得桶内和为sum/k，
     * 可以使用回溯算法
     * */

    public boolean canPartitionKSubsets(int[] nums, int k) {
        //进行排序，从后往前进行放置，优化
        Arrays.sort(nums);
        int sum = 0;
        //算出数组总和
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        //若桶和不是整数，直接返回false
        if (sum % k != 0) {
            return false;
        }
        //若数组长度小于桶，必然false
        if (nums.length < k) {
            return false;
        }
        //桶和
        int eachSum = sum / k;
        //创建k个桶
        int[] son = new int[k];
        //进行回溯
        return dfs(nums, son, nums.length - 1, eachSum);

    }
    /**
     *  nums代表数组
     *  son代表k个桶
     *  index代表正在取第几个数组进行放置
     *  eachSum代表桶和
     *  */
    public boolean dfs(int[] nums, int[] son, int index, int eachSum) {
        //若index小于0，说明全部放进去了
        if (index < 0) {
            return true;
        }
        for (int i = 0; i < son.length; i++) {
            //若某数大于桶和直接false
            if (nums[index] > eachSum) {
                return false;
            }
            //若相加小于桶和继续
            if (son[i] + nums[index] <= eachSum) {
                //相加之后进行递归
                son[i] += nums[index];
                //继续下一个数组进行放置
                if (dfs(nums, son, index - 1, eachSum)) {
                    return true;
                }
                //减的目的是进行回溯
                son[i] -= nums[index];
            }
        }
        //若index不为0，但已经出了循环，说明这个存在一个数组哪里都不能放
        return false;

    }


}
