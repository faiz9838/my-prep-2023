package CLASS_OBJECT;

class animal {
    public void run() {
        System.out.println("I am running...");
    }
}

public class classExample {

    public static void main(String[] args) {
        animal horse = new animal();
        horse.run();
    }
}