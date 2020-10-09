package 消费者生产者;

import java.util.concurrent.*;

/**
 * @author: Li jx
 * @date: 2019/10/1 17:01
 * @description:
 */
public class Main {
    //    static volatile Boolean flag = true;
//    static BlockingQueue<Data> blockingQueue = new LinkedBlockingDeque<>();
    static volatile int count = 15;
    static int type = 1;
    public static void main(String[] args) {
//        ExecutorService threadPoolExecutor = Executors.newCachedThreadPool();
//        Consumer consumer = new Consumer(blockingQueue, flag);
//        Producer producer = new Producer(blockingQueue, flag);
//        threadPoolExecutor.execute(consumer);
//        threadPoolExecutor.execute(producer);
        new Thread(() -> {
            while (true) {
                if (type == 1) {
                    count--;
                    System.out.println("A");
                    type = 2;
                    try {
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();

        new Thread(() -> {
            while (true) {
                if (type == 2) {
                    count--;
                    System.out.println("B");
                    type = 3;
                    try {
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();

        new Thread(() -> {
            while (true) {
                if (type == 3) {
                    count--;
                    System.out.println("C");
                    type = 1;
                    try {
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }
}
