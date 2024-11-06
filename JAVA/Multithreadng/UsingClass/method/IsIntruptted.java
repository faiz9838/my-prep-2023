package JAVA.Multithreadng.UsingClass.method;

public class IsIntruptted extends Thread {

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName());
            System.out.println("Is interrupted: " + Thread.currentThread().isInterrupted());
        }
    }

    public static void main(String[] args) throws Exception {
        IsIntruptted is1 = new IsIntruptted();
        IsIntruptted is2 = new IsIntruptted();
        IsIntruptted is3 = new IsIntruptted();

        is1.start();
        is2.start();
        is2.interrupt();
        is3.start();
    }
}
