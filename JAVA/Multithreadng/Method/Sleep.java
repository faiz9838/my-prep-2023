package JAVA.Multithreadng.Method;

class loopThread extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(100);
                System.out.println("Thread: " + Thread.currentThread().getName());
            } catch (Exception e) {
                e.getStackTrace();
            }
        }
    }
}

public class Sleep extends Thread {

    public void run() {
        System.out.println("Child thread: " + Thread.currentThread().getName());

    }

    public static void main(String[] args) throws Exception {
        Sleep s1 = new Sleep();
        Sleep s2 = new Sleep();

        loopThread l1 = new loopThread();

        s1.start();
        // sleep() method is static we can call whithout any object creations
        Thread.sleep(1000);
        s2.start();

        l1.start();
    }
}
