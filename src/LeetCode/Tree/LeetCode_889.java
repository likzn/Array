package LeetCode.Tree;

import java.util.Arrays;

/**
 * @auther: Li jx
 * @date: 2019/4/18 11:48
 * @description:
 */
public class LeetCode_889 {
    public TreeNode constructFromPrePost(int[] pre, int[] post) {
//        int root = pre[0];
        if (pre.length == 1) {
            return new TreeNode(pre[0]);
        }
        if (post.length == 1) {
            return new TreeNode(post[0]);
        }
        if (pre.length == 0 || post.length == 0) {
            return null;
        }
        int leftRoot = pre[1];
        int postLeftIndex = 0;
        for (int i = 0; i < post.length; i++) {
            if (post[i] == leftRoot) {
                postLeftIndex = i;
            }
        }
        int[] newPreLeft = Arrays.copyOfRange(pre, 1, 2 + postLeftIndex);
        int[] newPostLeft = Arrays.copyOfRange(post, 0, 1 + postLeftIndex);
        int[] newPreRight = Arrays.copyOfRange(pre, 2 + postLeftIndex, pre.length);
        int[] newPostRight = Arrays.copyOfRange(post, 1 + postLeftIndex, post.length-1);

        TreeNode rooNode = new TreeNode(pre[0]);
        rooNode.left = constructFromPrePost(newPreLeft, newPostLeft);
        rooNode.right = constructFromPrePost(newPreRight, newPostRight);

        return rooNode;
    }
}
