package JAVA.Multithreadng.UsingClass.method;

class thread extends Thread {

    public void run() {
        System.out.println("Thread is running...");
    }
}

public class isAlive {
    public static void main(String[] args) {
        thread th1 = new thread();

        System.out.println("Is thread alive: " + th1.isAlive());
        th1.start();
        System.out.println("Is thread alive after start(): " + th1.isAlive());
    }
}
