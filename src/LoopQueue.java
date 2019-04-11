/**
 * @auther: Li jx
 * @date: 2019/4/8 18:56
 * @description:
 */
public class LoopQueue<E> implements Queue<E>  {
    private int front,tail;
    private int size;
    private E[] data;

    public LoopQueue() {
        this(10);
    }
    public LoopQueue(int capacity) {
        data = (E[]) new Object[capacity + 1];
        size = 0;
        front = 0;
        tail = 0;
    }
    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void enqueue(E e) {
        if ((tail + 1) % data.length == front) {
            resize(getCapacity() * 2);
        }
        data[tail] = e;
        tail = (tail + 1) % data.length;
        size++;
    }

    @Override
    public E dequeue() {
        if (isEmpty()) {
            throw new IllegalArgumentException("队列为空");
        }
        E e = data[front];
        data[front] = null;
        front = (front + 1) % data.length;
        size--;
        if (size == getCapacity() / 4 && getCapacity()/2!=0) {
            resize(getCapacity() / 2);
        }
        return e;

    }

    @Override
    public boolean isEmpty() {
        return front == tail;
    }

    @Override
    public E getFront() {
        return null;
    }

    public int getCapacity() {
        return data.length - 1;
    }

    private void resize(int capacity) {
        E[] newData = (E[]) new Object[capacity+1];
        for (int i = 0; i < size; i++) {
            newData[i] = data[(front + i) % data.length];
        }
        data = newData;
        front = 0;
        tail = size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("LoopQueue:Size:%d ,Capacity:%d\n", size, data.length-1));
        sb.append("Front:[");
        for (int i = front; i != tail; i = (i + 1) % data.length) {
            sb.append(data[i]);
            if ((i + 1) % data.length != tail) {
                sb.append(",");
            }
        }
        sb.append("] tail");
        return sb.toString();
    }
}
