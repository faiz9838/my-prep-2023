package JAVA.Multithreadng.UsingClass.method;

public class GetPriority extends Thread {

    public void run() {
        System.out.println("Tread is running.. " + Thread.currentThread().getName());
        System.out.println("Thread priority is: " + Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {
        GetPriority gt1 = new GetPriority();

        gt1.setPriority(10);
        gt1.start();
    }
}
