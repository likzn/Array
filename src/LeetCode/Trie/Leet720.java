package LeetCode.Trie;

/**
 * @auther: Li jx
 * @date: 2019/4/27 18:07
 * @description:
 */
public class Leet720 {

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
//    public String longestWord(String[] words) {
//        root = new Node();
//        for (String s : words) {
//            addWord(s);
//        }
//
//
//    }


}
