package 消费者生产者;

import java.util.concurrent.BlockingQueue;

/**
 * @author: Li jx
 * @date: 2019/10/1 16:54
 * @description:
 */
public class Consumer implements Runnable{
    private BlockingQueue<Data>  blockingQueue;
    private boolean flag;

    public Consumer(BlockingQueue<Data> blockingQueue, boolean flag) {
        this.blockingQueue = blockingQueue;
        this.flag = flag;
    }

    @Override
    public void run() {
        while (true) {
            if (blockingQueue.size() == 0) {
                flag = false;
            }
            if (!flag) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            Data data = blockingQueue.poll();
            System.out.println(data);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
