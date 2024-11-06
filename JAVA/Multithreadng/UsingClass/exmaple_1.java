package JAVA.Multithreadng.UsingClass;

class myThread extends Thread {
    public void run() {
        System.out.println("Thread one");
    }
}

public class exmaple_1 {
    public static void main(String[] args) {
        myThread t1 = new myThread();
        t1.start();
    }
}
