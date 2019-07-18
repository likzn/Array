package LeetCode.Tree;




import LeetCode.LinkedList.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther: Li jx
 * @date: 2019/4/18 11:48
 * @description:
 */
public class LeetCode_109 {
    public TreeNode sortedListToBST(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        TreeNode root = null;
        root = sortedListToBST(list, 0, list.size() - 1);
        return root;
    }

    public TreeNode sortedListToBST(ArrayList<Integer> list, int l, int r) {
        if (l > r) {
            return null;
        }
        int mid = (l + r) / 2;
        TreeNode node = new TreeNode(list.get(mid));
        if (l == r) {
            return node;
        }
        node.left = sortedListToBST(list, l, mid-1);
        node.right = sortedListToBST(list, mid + 1, r);
        return node;
    }

}
