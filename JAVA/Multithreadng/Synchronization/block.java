package JAVA.Multithreadng.Synchronization;

class threads implements Runnable {

    @Override
    public void run() {
        // TODO Auto-generated method stub
        synchronized (this) {
            for (int i = 0; i < 10; i++) {
                System.out.println(i + " " + Thread.currentThread().getName());
            }
        }
    }

}

public class block {
    public static void main(String[] args) {
        threads e1 = new threads();
        Thread t1 = new Thread(e1);

        threads e2 = new threads();
        Thread t2 = new Thread(e2);

        threads e3 = new threads();
        Thread t3 = new Thread(e1);
        t1.start();
        t2.start();
        t3.start();

    }
}
