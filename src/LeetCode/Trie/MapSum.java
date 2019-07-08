package LeetCode.Trie;

import Trie.Trie;
import sun.awt.SunHints;

/**
 * @auther: Li jx
 * @date: 2019/4/27 19:28
 * @description:
 */
public class MapSum {

    private class Node {
        private int value;
        private Node[] next;

        public Node(int value) {
            this.value = value;
            next = new Node[26];
        }

        public Node() {
            this(0);
        }
    }

    private Node root;

    /**
     * Initialize your data structure here.
     */
    public MapSum() {
        root = new Node();
    }

    public void insert(String word, int val) {
        Node cur = root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (cur.next[c - 'a'] == null) {
                cur.next[c - 'a'] = new Node();
            }
            cur = cur.next[c - 'a'];
        }
        cur.value = val;
    }

    public int sum(String prefix) {
        Node cur = root;
        for (int i = 0; i < prefix.length(); i++) {
            char c = prefix.charAt(i);
            if (cur.next[c - 'a'] == null) {
                return 0;
            }
            cur = cur.next[c - 'a'];
        }
        return sum(cur);
    }

    private int sum(Node root) {
        int value = root.value;
        for (Node n : root.next) {
            if (n != null) {
                value += sum(n);
            }
        }
        return value;
    }
}
