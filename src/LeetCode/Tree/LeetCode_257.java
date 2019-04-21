package LeetCode.Tree;


import java.util.ArrayList;
import java.util.List;

/**
 * @auther: Li jx
 * @date: 2019/4/18 11:48
 * @description:
 */
public class LeetCode_257 {
    public List<String> binaryTreePaths(TreeNode root) {
        List list = new ArrayList();
        binaryTreePaths(root, list,"");
        return list;
    }

    public void binaryTreePaths(TreeNode root, List<String> list, String s) {
        if (root == null) {
            return;
        }
        if (root.right == null && root.left == null) {
            s = s +( root.val);
            list.add(s);
        } else {
            s+=(root.val);
            binaryTreePaths(root.left, list, s+("->"));
            binaryTreePaths(root.right, list, s+("->"));
        }
    }

}
