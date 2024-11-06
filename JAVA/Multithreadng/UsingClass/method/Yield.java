package JAVA.Multithreadng.UsingClass.method;

class test extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}

public class Yield {
    public static void main(String[] args) {
        test t1 = new test();

        t1.start();

        for (int i = 0; i < 5; i++) {
            Thread.yield();
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
