package JAVA.Multithreadng.Method;

public class suspendEx extends Thread {

    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                sleep(10);
                System.out.println("Currently running - " + Thread.currentThread().getName());
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }

    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        suspendEx s1 = new suspendEx();
        suspendEx s2 = new suspendEx();
        suspendEx s3 = new suspendEx();

        s1.start();
        s2.start();
        s2.suspend();
        s3.start();
    }
}
