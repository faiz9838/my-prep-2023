package JAVA.Multithreadng.UsingClass.method;

class thread extends Thread {
    public void run() {
        System.out.println("Current thread name: " + Thread.currentThread().getName());
        System.out.println("Current thread id: " + Thread.currentThread().getId());
    }
}

public class getId {
    public static void main(String[] args) throws InterruptedException {
        thread t1 = new thread();
        thread t2 = new thread();

        t1.start();
        t2.start();
        // t2 does not start execution until t1 completes
        // execution
        t1.join();
    }
}
