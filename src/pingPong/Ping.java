package pingPong;

public class Ping extends Thread {
    private Object object;

    public Ping(Object object) {
        this.object = object;
    }

    @Override
    public void run() {
        while (!isInterrupted()) {
            synchronized (object) {
                System.out.println("Ping");
                object.notify();
                try {
                    object.wait();
                } catch (InterruptedException e) {
                    return;
                }
            }
        }
    }
}
