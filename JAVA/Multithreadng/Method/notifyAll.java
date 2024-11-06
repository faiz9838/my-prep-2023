package JAVA.Multithreadng.Method;

public class notifyAll extends Thread {

    public void run() {
        synchronized (this) {
            System.out.println(Thread.currentThread().getName() + "...starts");

            try {
                this.notifyAll();
            } catch (Exception e) {
                // TODO: handle exception
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "...notified");
        }
    }

    public static void main(String[] args) throws Exception {
        notifyAll n1 = new notifyAll();
        notifyAll n2 = new notifyAll();
        Thread t1 = new Thread(n1, "Faiz Ahmad");
        Thread t2 = new Thread(n2, "Tahoora Shaikh");

        t1.start();
        Thread.sleep(1000);
        t2.start();
    }
}
