package LeetCode.Tree;

import java.util.*;

/**
 * @author: Li jx
 * @date: 2019/7/30 14:23
 * @description:
 */
public class Leet429 {
    public List<List<Integer>> levelOrder(Node root) {
        if (root == null) {
            return new ArrayList<>();
        }

        List list = new ArrayList();
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int count = queue.size();
            List list1 = new ArrayList();
            for (int i = 0; i < count; i++) {
                Node node = queue.poll();
                list1.add(node.val);
                for (Node n : node.children) {
                    if (n != null) {
                        queue.add(n);
                    }
                }
            }
            list.add(list1);
        }

        return list;
    }


    class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    ;
}
