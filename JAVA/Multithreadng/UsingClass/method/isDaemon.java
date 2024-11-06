package JAVA.Multithreadng.UsingClass.method;

// class threads extends Thread {
//     public threads(String name) {
//         super(name);
//     }

//     public void run() {
//         if (Thread.currentThread().isDaemon()) {
//             System.out.println(getName() + " is Daemon thread");
//         } else {
//             System.out.println(getName() + " is user thread");
//         }
//     }
// }

public class isDaemon extends Thread {

    public isDaemon(String name) {
        super(name);
    }

    public void run() {
        if (Thread.currentThread().isDaemon()) {
            System.out.println(getName() + " is Daemon thread");
        } else {
            System.out.println(getName() + " is user thread");
        }
    }

    public static void main(String[] args) {
        isDaemon ts1 = new isDaemon("Faiz Ahmad");
        isDaemon ts2 = new isDaemon("Shaikh Tahoora");
        isDaemon ts3 = new isDaemon("Tahoora");

        ts1.setDaemon(true);

        ts1.start();
        ts2.start();

        ts3.start();
        ts3.setDaemon(true);

    }
}
