package AVL;

/**
 * @auther: Li jx
 * @date: 2019/4/28 18:05
 * @description:
 */
public class AVLTree<K extends Comparable<K>, V> {

    private class Node {
        private K key;
        private V value;
        private int height;
        private Node left, right;

        public Node(K e, V value) {
            this.key = e;
            this.value = value;
            left = null;
            right = null;
        }
    }

    private int size;
    private Node root;


    public AVLTree() {
        root = null;
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void add(K key, V value) {
        root = add(root, key, value);
    }

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


        node.height = 1 + Math.max(getHeight(node.left), getHeight(node.right));
        int balanceFactor = getBalanceFactor(node);
        //LL
        if (balanceFactor > 1 && getBalanceFactor(node.left) >= 0) {
            return rightRotate(node);
        }
        //RR
        if (balanceFactor <-1 && getBalanceFactor(node.right) <= 0) {
            return leftRotate(node);
        }
        //LR
        if (balanceFactor > 1 && getBalanceFactor(node.left) < -1) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }
        //RL
        if (balanceFactor < -1 && getBalanceFactor(node.left) > 1) {

            node.right = leftRotate(node.right);
            return leftRotate(node);
        }
        return node;
    }

    private Node rightRotate(Node y) {
        Node x = y.left;
        Node T3 = x.right;

        x.right = y;
        y.left = T3;

        y.height = Math.max(getHeight(y.left), getHeight(y.right)) + 1;
        x.height = Math.max(getHeight(x.left), getHeight(x.right)) + 1;

        return x;
    }

    private Node leftRotate(Node y) {
        Node x = y.right;
        Node T3 = x.left;

        x.left = y;
        y.right = T3;

        y.height = Math.max(getHeight(y.left), getHeight(y.right)) + 1;
        x.height = Math.max(getHeight(x.left), getHeight(x.right)) + 1;

        return x;
    }
    private int getBalanceFactor(Node node) {
        if (node == null) {
            return 0;
        }
        return getHeight(node.left) - getHeight(node.right);
    }

    private Node getNode(Node node, K key) {
        if (node == null) {
            return null;
        }
        if (key.compareTo(node.key) == 0) {
            return node;
        } else if (key.compareTo(node.key) < 0) {
            return getNode(node.left, key);
        } else {
            return getNode(node.right, key);
        }
    }

    public boolean contains(K key) {
        return getNode(root, key) != null;
    }

    public V get(K key) {
        Node node = getNode(root, key);
        return node == null ? null : node.value;
    }

    public void set(K key, V newValue) {
        Node node = getNode(root, key);
        if (node == null) {
            throw new IllegalArgumentException(key + "doesnt exist");
        }
        node.value = newValue;
    }

    public Node min(Node root) {
        if (root.left == null) {
            return root;
        }
        return min(root.left);
    }

    public V remove(K key) {
        Node node = getNode(root, key);
        if (node != null) {
            root = remove(root, key);
            return node.value;
        }
        return null;
    }

    private int getHeight(Node node) {
        if (node == null) {
            return 0;
        }
        return node.height;
    }

    private Node remove(Node root, K key) {
        if (root == null) {
            return root;
        }
        Node retNode ;
        if (root.key.compareTo(key) > 0) {
            root.right = remove(root.right, key);
            retNode = root;
        } else if (root.key.compareTo(key) < 0) {
            root.left = remove(root.left, key);
            retNode = root;
        } else {
            if (root.right == null) {
                size--;
                Node node = root.left;
                root.left = null;
                retNode = node;
            } else if (root.left == null) {
                size--;
                Node node = root.right;
                root.right = null;
                retNode = node;
            } else {
                Node next = min(root.right);
                next.right = remove(root.right, next.key);
                next.left = root.left;

                root.left = root.right = null;
                retNode = root;
            }
        }
        if (retNode == null) {
            return retNode;
        }

        retNode.height = 1 + Math.max(getHeight(retNode.left), getHeight(retNode.right));
        int balanceFactor = getBalanceFactor(retNode);
        //LL
        if (balanceFactor > 1 && getBalanceFactor(retNode.left) >= 0) {
            return rightRotate(retNode);
        }
        //RR
        if (balanceFactor <-1 && getBalanceFactor(retNode.right) <= 0) {
            return leftRotate(retNode);
        }
        //LR
        if (balanceFactor > 1 && getBalanceFactor(retNode.left) < -1) {
            retNode.left = leftRotate(retNode.left);
            return rightRotate(retNode);
        }
        //RL
        if (balanceFactor < -1 && getBalanceFactor(retNode.left) > 1) {

            retNode.right = leftRotate(retNode.right);
            return leftRotate(retNode);
        }
        return retNode;
    }
}
