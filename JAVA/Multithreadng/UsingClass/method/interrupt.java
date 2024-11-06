package JAVA.Multithreadng.UsingClass.method;

/**
 * Innerinterrupt
 */
class Innerinterrupt extends Thread {
    public void run() {
        try {
            Thread.sleep(2000);
            System.out.println("Faiz Ahmad");
        } catch (InterruptedException e) {
            // TODO: handle exception
            System.out.println("Thread is interrupted");
        }
    }

}

public class interrupt {
    public static void main(String[] args) {
        Innerinterrupt t1 = new Innerinterrupt();
        t1.start();

        try {
            t1.interrupt();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Exception handled");
        }
    }
}
