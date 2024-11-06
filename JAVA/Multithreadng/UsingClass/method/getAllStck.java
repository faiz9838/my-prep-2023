package JAVA.Multithreadng.UsingClass.method;

import java.util.Set;

class myThread extends Thread {
    public void run() {
        System.out.println("Thread is running...");
    }
}

public class getAllStck {
    public static void main(String[] args) {
        myThread t1 = new myThread();
        myThread t2 = new myThread();

        t1.start();
        t2.start();

        Set<Thread> threadSet = Thread.getAllStackTraces().keySet();
        for (Thread thread : threadSet) {
            System.out.println(thread.getName());
        }
    }
}
