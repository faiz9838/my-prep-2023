package JAVA.operators;

public class logical {
    public static void main(String[] args) {
        int a = 20, b = 50;

        System.out.println("AND: " + ((a >= b) && (b <= a)));
        System.out.println("OR: " + ((a >= b) || (b >= a)));
        System.out.println("NOT: " + (!(a >= b)));
    }
}
