package JAVA.Multithreadng.Synchronization;

class BookTheaterSeat {
    int totalSeats = 20;

    synchronized void bookSeat(int seats) {
        if (totalSeats >= seats) {
            System.out.println(seats + " Seat booked sucessfully");
            totalSeats -= seats;
            System.out.println("Seats left: " + totalSeats);
        } else {
            System.out.println("Seats cannot be booked!");
            System.out.println("Seats left: " + totalSeats);
        }
    }
}

class myThread1 extends Thread {

    BookTheaterSeat b;
    int seats;

    myThread1(BookTheaterSeat b, int seats) {
        this.b = b;
        this.seats = seats;
    }

    public void run() {
        b.bookSeat(seats);
    }
}

class myThread2 extends Thread {

    BookTheaterSeat b;
    int seats;

    myThread2(BookTheaterSeat b, int seats) {
        this.b = b;
        this.seats = seats;
    }

    public void run() {
        b.bookSeat(seats);
    }
}

public class movieBookApk {
    public static void main(String[] args) {
        BookTheaterSeat b1 = new BookTheaterSeat();
        myThread1 t1 = new myThread1(b1, 7);
        t1.start();

        myThread1 t2 = new myThread1(b1, 5);
        t2.start();

        BookTheaterSeat b2 = new BookTheaterSeat();
        myThread1 t3 = new myThread1(b2, 9);
        t3.start();

        myThread1 t4 = new myThread1(b2, 9);
        t4.start();

        myThread1 t5 = new myThread1(b2, 9);
        t5.start();

        myThread1 t6 = new myThread1(b2, 1);
        t6.start();
    }
}
