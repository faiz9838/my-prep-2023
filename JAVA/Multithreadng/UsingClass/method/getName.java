package JAVA.Multithreadng.UsingClass.method;

class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        // Print statement when thread is called inside
        // main()
        System.out.println("Thread is running.....");
    }
}

public class getName {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("Faiz Ahmad");
        System.out.println("Thread 1: " + t1.getName());
        t1.start();

    }
}
