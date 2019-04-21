package BST;

import sun.reflect.generics.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @auther: Li jx
 * @date: 2019/4/16 18:32
 * @description:
 */
public class BST<E extends Comparable<E>> {
    private class Node {
        public E e;
        private Node left, right;

        public Node(E e) {
            this.e = e;
            left = null;
            right = null;
        }
    }

    private int size;
    private Node root;


    public BST() {
        root = null;
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void add(E e) {
        root = add(root, e);
    }

    private Node add(Node node, E e) {
        if (node == null) {
            size++;
            return new Node(e);
        }
        if (e.compareTo(node.e) < 0) {
            node.left = add(node.left, e);
        } else if (e.compareTo(node.e) > 0) {
            node.right = add(node.right, e);
        }
        return node;
    }

    public boolean contains(E e) {
        return contains(root, e);
    }

    private boolean contains(Node root, E e) {
        if (root == null) {
            return false;
        }

        if (root.e.compareTo(e) == 0) {
            return true;
        } else if (root.e.compareTo(e) > 0) {
            return contains(root.right, e);
        } else {
            return contains(root.left, e);
        }
    }

    public void inOrder() {
        inOrder(root);

    }

    public void inOrderNR() {

        Stack<Node> stack = new Stack();
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            if (!stack.isEmpty()) {
                Node p = stack.pop();
                System.out.println(p.e);
                root = p.right;
            }


        }

    }

    private void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.println(root.e);
        inOrder(root.right);
    }

    public void postOrder() {
        postOrder(root);

    }

    public void postOrderNR() {
        Stack<Node> stack1 = new Stack();
        Stack<Node> stack2 = new Stack<>();
        stack1.push(root);
        while (!stack1.isEmpty()) {
            Node head = stack1.pop();
            stack2.push(head);

            if (head.left != null) {
                stack1.push(head.left);
            }
            if (head.right != null) {
                stack1.push(head.right);
            }
        }
        while (!stack2.isEmpty()) {
            System.out.println(stack2.pop().e);
        }


    }


    private void postOrder(Node root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.e);
    }

    public void preOrder() {
        preOrder(root);

    }

    public void preOrderNR() {
        Stack<Node> stack = new Stack();
        stack.push(root);
        while (!stack.isEmpty()) {
            Node node = stack.pop();
            System.out.println(node.e);
            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
        }
    }

    private void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.println(root.e);
        preOrder(root.left);
        preOrder(root.right);
    }

    public void levelOrder() {
        Queue<Node> q = new LinkedList();
        q.add(root);
        while (!q.isEmpty()) {
            Node node = q.remove();
            System.out.println(node.e);
            if (node.left != null) {
                q.add(node.left);
            }
            if (node.right != null) {
                q.add(node.right);
            }
        }
    }

    public E min() {
        if (size == 0) {
            throw new IllegalArgumentException("BST Empty");
        }
        return min(root).e;
    }

    public Node min(Node root) {
        if (root.left == null) {
            return root;
        }
        return min(root.left);
    }

    public E max() {
        if (size == 0) {
            throw new IllegalArgumentException("BST Empty");
        }
        return max(root).e;
    }

    public Node max(Node root) {
        if (root.right == null) {
            return root;
        }
        return max(root.right);
    }

    public E rmMin() {
        Node node = min(root);
        root = rmMin(root);
        return node.e;
    }

    private Node rmMin(Node root) {

        if (root.left == null) {
            size--;
            Node node = root.right;
            root.right = null;
            return node;
        }
        root.left = rmMin(root.left);
        return root;

    }

    public E rmMax() {
        Node node = max(root);
        root = rmMax(root);
        return node.e;
    }

    private Node rmMax(Node root) {

        if (root.right == null) {
            size--;
            Node node = root.left;
            root.left = null;
            return node;
        }
        root.right = rmMax(root.right);
        return root;

    }

    public void remove(E e) {
        root = remove(root, e);
    }

    private Node remove(Node root, E e) {
        if (root == null) {
            return root;
        } else if (root.e.compareTo(e) > 0) {
            root.right = remove(root.right, e);
        } else if (root.e.compareTo(e) < 0) {
            root.left = remove(root.left, e);
        } else {
            if (root.right == null) {
                size--;
                Node node = root.left;
                root.left = null;
                return node;
            } else if (root.left == null) {
                size--;
                Node node = root.right;
                root.right = null;
                return node;
            }
        }
        Node next = min(root.right);
        next.right = rmMin(root.right);
        next.left = root.left;
        root.left = root.right = null;

        return next;
    }
}
