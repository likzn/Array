/**
 * @auther: Li jx
 * @date: 2019/4/11 17:53
 * @description:
 */
public class LinkedListStack<E> implements Stack<E> {
    private LinkedList<E> linkedList;

    public LinkedListStack() {
        linkedList = new LinkedList();
    }

    @Override
    public void push(E e) {
        linkedList.addFirst(e);
    }

    @Override
    public boolean isEmpty() {
        return linkedList.isEmpty();
    }

    @Override
    public E pop() {
        return linkedList.removeFirst();
    }

    @Override
    public E peek() {
        return linkedList.getFirst();
    }

    @Override
    public int getSize() {
        return linkedList.getSize();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Stack Top:");
        stringBuilder.append(linkedList);
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        LinkedListStack stack = new LinkedListStack<>();
        for (int i = 0; i < 6; i++) {
            stack.push(i);
        }
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
    }
}
