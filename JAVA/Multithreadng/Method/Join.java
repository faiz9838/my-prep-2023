package JAVA.Multithreadng.Method;

class threadJoin extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 2; i++) {
            try {
                Thread.sleep(200);
                System.out.println("Current Thread: " + Thread.currentThread().getName());

            } catch (Exception e) {
                // TODO: handle exception
                System.out.println("Exception has" + " been caught " + e);
            }
            System.out.println(i);
        }
    }

}

public class Join {
    public static void main(String[] args) throws Exception {
        threadJoin t1 = new threadJoin();
        threadJoin t2 = new threadJoin();
        threadJoin t3 = new threadJoin();

        t1.start();

        System.out.println("Current thread: " + Thread.currentThread().getName());
        t1.join();

        t2.start();

        t3.start();

    }
}
