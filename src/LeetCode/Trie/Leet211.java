package LeetCode.Trie;

import Trie.Trie;

import java.util.TreeMap;

/**
 * @auther: Li jx
 * @date: 2019/4/27 18:07
 * @description:
 */
public class Leet211 {

    private class Node {
        private boolean isWorld;
        private Node[] next;

        public Node(boolean isWorld) {
            this.isWorld = isWorld;
            next = new Node[26];
        }

        public Node() {
            this(false);
        }
    }

    private Node root;

    /**
     * Initialize your data structure here.
     */
    public Leet211() {
        root = new Node();
    }

    /**
     * Adds a word into the data structure.
     */
    public void addWord(String word) {
        Node cur = root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (cur.next[c - 'a'] == null) {
                cur.next[c - 'a'] = new Node();
            }
            cur = cur.next[c - 'a'];
        }
        if (!cur.isWorld) {
            cur.isWorld = true;
        }
    }

    /**
     * Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter.
     */
    public boolean search(String word) {
        return match(word, root, 0);
    }

    private boolean match(String word, Node root, int index) {
        if (index == word.length()) {
            return root.isWorld;
        }
        char c = word.charAt(index);
        if (c != '.') {
            if (root.next[c - 'a'] == null) {
                return false;
            }
            return match(word, root.next[c - 'a'], index + 1);
        } else {
            for (Node node : root.next) {
                if (node!=null&&match(word, node, index + 1)) {
                    return true;
                }
            }
            return false;
        }
    }
}
