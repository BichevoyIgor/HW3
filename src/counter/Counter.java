package counter;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Counter {
    private Lock lock;
    private volatile int count;

    public Counter() {
        this.lock = new ReentrantLock(true);
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Lock getLock() {
        return lock;
    }
}
