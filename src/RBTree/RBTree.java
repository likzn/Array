package RBTree;

import AVL.AVLTree;

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

    private Node add(Node node, K key, V value) {

        if (node == null) {
            size++;
            return new Node(key, value);
        }
        if (key.compareTo(node.key) < 0) {
            node.left = add(node.left, key, value);
        } else if (key.compareTo(node.key) > 0) {
            node.right = add(node.right, key, value);
        }
        node.value = value;
        return node;
    }

    public void add(K key, V value) {
        root = add(root, key, value);

    }
}
