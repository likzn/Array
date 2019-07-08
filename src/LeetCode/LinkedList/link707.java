package LeetCode.LinkedList;

/**
 * @auther: Li jx
 * @date: 2019/4/13 09:57
 * @description:
 */
public class link707 {

    public class Node {
        Integer val;
        Node next;

        public Node(int e) {
            this.val = e;
            this.next = null;
        }
    }

    Node dummyHead;
    int size;

    /**
     * Initialize your data structure here.
     */
    public link707() {
        dummyHead = new Node(-1);
        size = 0;
    }

    /**
     * Get the value of the index-th node in the linked list. If the index is invalid, return -1.
     */
    public int get(int index) {
        Node node = dummyHead.next;
        for (int i = 0; i < index; i++) {
            if (node.next == null) {
                return -1;
            }
            node = node.next;

        }
        return node.val;
    }

    /**
     * Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.
     */
    public void addAtHead(int val) {
        addAtIndex(0, val);
    }

    /**
     * Append a node of value val to the last element of the linked list.
     */
    public void addAtTail(int val) {

        addAtIndex(size, val);
    }

    /**
     * Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted.
     */
    public void addAtIndex(int index, int val) {
        if (size < index) {
            return;
        }
        Node pre = dummyHead;
        for (int i = 0; i < index; i++) {
            pre = pre.next;
        }
        Node n = new Node(val);
        n.next = pre.next;
        pre.next = n;
        size++;
    }

    /**
     * Delete the index-th node in the linked list, if the index is valid.
     */
    public void deleteAtIndex(int index) {
        if (size < index) {
            return;
        }
        Node pre = dummyHead;
        for (int i = 0; i < index - 1; i++) {
            pre = pre.next;
        }
        pre.next = pre.next.next;
        size--;
    }
}
