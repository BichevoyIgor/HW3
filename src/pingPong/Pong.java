package pingPong;

public class Pong extends Thread {
    private Object object;

    public Pong(Object object) {
        this.object = object;
    }

    @Override
    public void run() {
        while (!isInterrupted()) {
            synchronized (object) {
                System.out.println("Pong");
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
