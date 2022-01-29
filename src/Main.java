import counter.Counter;
import counter.Increment;
import pingPong.Ping;
import pingPong.Pong;

public class Main {
    public static void main(String[] args) {
/*
// Программа, в которой два потока поочередно пишут ping и pong
        Object object = new Object();
        Ping ping = new Ping(object);
        Pong pong = new Pong(object);
        ping.start();
        pong.start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ping.interrupt();
        pong.interrupt();
*/



/*
// Потокобезопасный счетчик с помощью интерфейса Lock.
        Counter c = new Counter();
        Increment i1 = new Increment(c);
        Increment i2 = new Increment(c);
        i1.start();
        i2.start();
        try {
            Thread.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        i1.interrupt();
        i2.interrupt();
*/


    }
}

