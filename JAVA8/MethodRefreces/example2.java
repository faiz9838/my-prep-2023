package JAVA8.MethodRefreces;

public class example2 {
    public static void ThreadStatus() {
        System.out.println("Thread is running....");
    }

    public static void main(String[] args) {
        Thread t2 = new Thread(example2::ThreadStatus);
        t2.start();
    }
}
