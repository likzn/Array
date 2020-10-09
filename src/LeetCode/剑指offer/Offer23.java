package LeetCode.剑指offer;


import java.util.Arrays;

/**
 * @author: Li jx
 * @date: 2019/11/8 14:26
 * @description:
 */
public class Offer23 {
    public boolean VerifySquenceOfBST(int[] sequence) {
        //若为空直接返回false
        if (sequence.length == 0) {
            return false;
        }
        //当数组长度为1时，代表是唯一节点，返回true即可
        if (sequence.length == 1) {
            return true;
        }
        //根节点的值
        int mid = sequence[sequence.length - 1];
        //寻找左子树的索引
        int left = 0;
        for (int i = 0; i < sequence.length - 1; i++) {
            //找到后，left左边都为左子树
            if (sequence[i] > mid) {
                left = i;
                //再遍历一下，若还有大于，说明不是正确的二叉搜索树的后序遍历
                for (int j = left; j < sequence.length - 2; j++) {
                    //右子树的均小于根，反之返回false
                    if (sequence[j] < mid) {
                        return false;
                    }
                }
                //后序遍历无误的话跳出for循环
                break;
            }
        }
        //若没有找到left说明可能类似（6，3）这种情况即只有一个右节点，做特殊处理即可
        if (left == 0) {
            return VerifySquenceOfBST(Arrays.copyOfRange(sequence, 0, left + 1));
        }
        //继续遍历左子树和右子树
        return VerifySquenceOfBST(Arrays.copyOfRange(sequence, 0, left)) && VerifySquenceOfBST(Arrays.copyOfRange(sequence, left, sequence.length - 1));
    }

    public static void main(String[] args) {
        System.out.println(new Offer23().VerifySquenceOfBST(new int[]{4, 6, 7, 5}));
    }
}
