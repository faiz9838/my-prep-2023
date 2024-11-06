package JAVA.Multithreadng.UssingRunnable;

class threadRunnable implements Runnable {
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}

public class example {
    public static void main(String[] args) {
        System.out.println("Main thread is- "
                + Thread.currentThread().getName());
        Thread t1 = new Thread();
        t1.start();

    }
}
