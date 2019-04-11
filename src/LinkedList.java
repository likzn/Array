/**
 * @auther: Li jx
 * @date: 2019/4/9 20:14
 * @description:
 */
public class LinkedList<E> {


    private class Node {
        public E e;
        public Node next;


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
}

