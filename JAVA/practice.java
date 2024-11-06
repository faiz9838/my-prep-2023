package JAVA;

interface audio {
    abstract void up();

    abstract void down();

}

class radio implements audio {
    public void up() {
        System.out.println("Music increased");
    }

    public void down() {
        System.out.println("Music decreased");
    }
}

public class practice {
    public static void main(String[] args) {
        radio r1 = new radio();
        r1.down();
    }
}
