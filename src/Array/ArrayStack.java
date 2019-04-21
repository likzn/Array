package Array;

/**
 * @auther: Li jx
 * @date: 2019/4/7 15:05
 * @description:
 */
public class ArrayStack<E> implements Stack<E> {
    private Array<E> array;

    public ArrayStack(int capacity) {
        array = new Array(capacity);
    }
    public ArrayStack() {
        array = new Array();
    }


    @Override
    public void push(E e) {
        array.addLast(e);
    }

    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }

    @Override
    public E pop() {
        return array.removeLast();
    }

    @Override
    public E peek() {
        return array.getLast();
    }

    public int getCapacity() {
        return array.getCapacity();
    }


    @Override
    public int getSize() {
        return array.getSize();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Array.Stack：");
        sb.append("[");
        for (int i = 0; i < array.getSize(); i++) {
            sb.append(array.get(i));
            if (i != array.getSize()-1) {
                sb.append(", ");
            }
        }
        sb.append("] Top");
        return sb.toString();
    }
}
