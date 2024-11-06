package JAVA.Multithreadng.Synchronization;

public class example extends Thread {
    synchronized public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(100);
                System.out.println(Thread.currentThread().getName());
            } catch (Exception e) {
                // TODO: handle exception
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        example e1 = new example();
        example e2 = new example();
        example e3 = new example();

        System.out.println("Child Thread: " + Thread.currentThread().getName());
        e1.start();
        e2.start();
        e3.start();

    }
}
