package JAVA.operators;

public class assignment {
    public static void main(String[] args) {
        int a = 10, b = 20;

        System.out.println("Addition: " + (a += b));
        System.out.println("Subtraction: " + (a -= b));
        System.out.println("Multiplication: " + (a *= b));
        System.out.println("Division: " + (b /= a));
        System.out.println("Modulos: " + (b %= a));
    }
}
