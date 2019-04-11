/**
 * @auther: Li jx
 * @date: 2019/4/8 17:11
 * @description:
 */
public interface Queue<E> {
    int getSize();

    void enqueue(E e);

    E dequeue();

    boolean isEmpty();

    E getFront();

}
