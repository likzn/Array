package Array;

/**
 * @auther: Li jx
 * @date: 2019/4/7 15:03
 * @description:
 */
public interface Stack<E> {
    void push(E e);
    boolean isEmpty();
    E pop();
    E peek();
    int getSize();

}
