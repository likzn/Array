package Array;

import java.util.Set;
import java.util.TreeSet;

/**
 * @auther: Li jx
 * @date: 2019/4/11 19:28
 * @description:
 */
public class LinkedListQueue<E> implements Queue<E>{
    private class Node {
        private E e;
        private Node next;


        public Node(E e, Node next) {
            this.e = e;
            this.next = next;
        }

        public Node(E e) {
            this(e, null);
        }

        public Node() {
            this(null, null);
        }

        @Override
        public String toString() {
            return e.toString();
        }
    }


    private Node tail, head;
    private int size;

    public LinkedListQueue() {
        tail = null;
        head = null;
        size = 0;
    }


    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void enqueue(E e) {
        if (head == null) {
            Node node = new Node(e);
            head = node;
            tail = head;
        } else {
            Node node = new Node(e);
            tail.next = node;
            tail = tail.next;
        }
        size++;

    }

    @Override
    public E dequeue() {
        Node retNode = head;
        head = head.next;
        retNode.next = null;
        if (head == null) {
            tail = null;
        }
        size--;
        return retNode.e;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public E getFront() {
        return head.e;
    }

    @Override
    public String toString() {
        Node node = head;
        StringBuilder sb = new StringBuilder();
        sb.append("Array.Queue Front:");
        while (node != null) {
            sb.append(node.e);
            sb.append("->");
            node = node.next;
        }
        sb.append("null tail");
        return sb.toString();
    }

    public static void main(String[] args) {
    }
}
