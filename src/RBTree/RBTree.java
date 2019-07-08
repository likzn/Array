package RBTree;

import AVL.AVLTree;

import java.util.HashMap;
import java.util.TreeMap;

/**
 * @auther: Li jx
 * @date: 2019/5/6 20:00
 * @description:
 */
public class RBTree<K extends Comparable<K>, V> {

    private static final boolean BLACK = false;
    private static final boolean RED = true;

    private class Node {
        private K key;
        private V value;
        private int height;
        private Node left, right;
        private boolean color;

        public Node(K e, V value) {
            this.key = e;
            this.value = value;
            left = null;
            right = null;
            color = RED;
        }
    }

    private int size;
    private Node root;


    private Node leftRotate(Node node) {
        Node x = node.right;

        node.right = x.left;
        x.left = node;

        x.color = node.color;
        node.color = RED;

        return x;
    }

    private void flipColors(Node node) {

        node.color = RED;
        node.left.color = BLACK;
        node.right.color = BLACK;

    }

    private Node rightRotate(Node node) {
        Node x = node.left;

        node.left = x.right;
        x.right = node;

        x.color = node.color;
        node.color = RED;
        return x;
    }

    private boolean isRed(Node node) {
        if (node == null) {
            return BLACK;
        }
        return node.color;
    }

    private Node add(Node node, K key, V value) {

        if (node == null) {
            size++;
            return new Node(key, value);  //插入红色节点
        }
        if (key.compareTo(node.key) < 0) {
            node.left = add(node.left, key, value);
        } else if (key.compareTo(node.key) > 0) {
            node.right = add(node.right, key, value);
        } else {
            node.value = value;
        }
        if (!isRed(node.left) && isRed(node.right)) {
            node = leftRotate(node);
        }
        if (isRed(node.left) && isRed(node.left.left)) {
            node = rightRotate(node);
        }
        if (isRed(node.left) && isRed(node.right)) {
            flipColors(node);
        }
        return node;
    }

    public void add(K key, V value) {
        root = add(root, key, value);
        root.color = BLACK;
    }


}
