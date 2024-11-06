package JAVA.Multithreadng.Method;

class myThread implements Runnable {
    private boolean exit;
    private String name;
    Thread t;

    myThread(String threadname) {
        name = threadname;
        t = new Thread(this, name);
        System.out.println("New thread: " + t);
        exit = false;
        t.start();
    }

    public void run() {
        int i = 0;

        while (!exit) {
            System.out.println(name + " : " + i);
            i++;
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                System.out.println("Caught: " + e);
                // TODO: handle exception
            }
        }
        System.out.println(name + " stoped.");
    }

    public void stop() {
        exit = true;
    }

}

public class Stop {
    public static void main(String[] args) throws Exception {
        myThread t1 = new myThread("First thread");
        myThread t2 = new myThread("Second thread");

        Thread.sleep(500);
        t1.stop();
        t2.stop();

        Thread.sleep(500);
        System.out.println("Existing the main thread");
    }
}
