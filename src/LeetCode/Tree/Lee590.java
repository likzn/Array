package LeetCode.Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author: Li jx
 * @date: 2019/8/8 17:39
 * @description:
 */
public class Lee590 {
    public List<Integer> postorder(Node root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List list = new ArrayList();
        Stack<Node> stack = new Stack();
        stack.add(root);
        while (!stack.isEmpty()) {
            Node node = stack.pop();
            list.add(0, node.val);
            node.children.forEach(e->{
                stack.add(e);
            });
        }
        return list;
    }

    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val,List<Node> _children) {
            val = _val;
            children = _children;
        }
    };
}
