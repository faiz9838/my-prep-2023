package JAVA.Multithreadng.Method;

public class Notify extends Thread {

    public void run() {
        synchronized (this) {
            System.out.println(Thread.currentThread().getName() + " ...starts");

            try {

                this.wait();
            } catch (Exception e) {
                e.printStackTrace();
            }

            // Notify method()
            this.notify();
            System.out.println(Thread.currentThread().getName() + "...notified");
        }
    }

    public static void main(String[] args) throws Exception {
        
        Notify n1 = new Notify();
        Thread t1 = new Thread(n1, "Thread-1");
        Notify n2 = new Notify();
        Thread t2 = new Thread(n2, "Thread-2");

        t1.start();
        t2.start();

        Thread.sleep(100);

    }
}
