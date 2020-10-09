package 消费者生产者;

import java.util.concurrent.BlockingQueue;

/**
 * @author: Li jx
 * @date: 2019/10/1 16:54
 * @description:
 */
public class Producer implements Runnable{
    private BlockingQueue<Data> blockingQueue;
    private boolean flag;

    public Producer(BlockingQueue<Data> blockingQueue, boolean flag) {
        this.blockingQueue = blockingQueue;
        this.flag = flag;
    }

    @Override
    public void run() {
        while (flag) {
            Data data = new Data();
            data.setId(1L);
            data.setName("1");
            blockingQueue.offer(data);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
