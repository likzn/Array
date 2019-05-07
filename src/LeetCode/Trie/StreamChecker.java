package LeetCode.Trie;

/**
 * @auther: Li jx
 * @date: 2019/5/2 11:39
 * @description:
 */
public class StreamChecker {
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
    private StringBuilder sb;


    public void insert(String word) {
        Node cur = root;
        for (int i = word.length()-1; i >=0; i--) {
            char c = word.charAt(i);
            if (cur.next[c - 'a'] == null) {
                cur.next[c - 'a'] = new Node();
            }
            cur = cur.next[c - 'a'];
        }
        cur.isWorld = true;
    }

    public StreamChecker(String[] words) {
        root = new Node();
        for (String s : words) {
            insert(s);
        }
        sb = new StringBuilder();
    }

    public boolean query(char letter) {
        sb.append(letter);
        Node cur = root;

        for (int i = sb.length() - 1; i >= 0; i--) {
            char c = sb.charAt(i);
            Node node = cur.next[c - 'a'];
            if (node == null) {
                return false;
            }
            cur = node;
            if (cur.isWorld) {
                return true;
            }
        }
        return false;

    }

}
