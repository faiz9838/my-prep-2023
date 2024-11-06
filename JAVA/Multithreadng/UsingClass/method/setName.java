package JAVA.Multithreadng.UsingClass.method;

class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("Thread is running...");
    }
}

public class setName {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        System.out.println("Thread 1: " + t1.getName());
        System.out.println("Thread 2: " + t2.getName());
        t1.start();
        t2.start();

        t1.setName("Shaikh Tahoora");
        t2.setName("Faiz Ahmad");

        System.out.println("New Thread 1: " + t1.getName());
        System.out.println("New thread 2: " + t2.getName());
    }
}
