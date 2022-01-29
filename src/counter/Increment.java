package counter;

import java.util.concurrent.locks.Lock;

public class Increment extends Thread {
    private Counter counter;
    private Lock lock;

    public Increment(Counter counter) {
        super();
        this.counter = counter;
        this.lock = counter.getLock();
    }

    @Override
    public void run() {
        while (!isInterrupted()) {
            lock.lock();
            int count = counter.getCount();
            counter.setCount(++count);
            lock.unlock();
        }
    }
}
