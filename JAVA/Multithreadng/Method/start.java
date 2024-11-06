package JAVA.Multithreadng.Method;

public class start extends Thread {

    public void run() {
        System.out.println("Thread is running...");
    }

    public static void main(String[] args) {
        start s1 = new start();

        s1.start();
    }
}
