package JAVA.operators;

public class bitwiseOperator {
    public static void main(String[] args) {
        int a = 10, b = 20;

        System.out.println("Bitwise AND: " + (a & b));
        System.out.println("Bitwise OR: " + (a | b));
        System.out.println("Bitwise Complement(~): " + (~10));
        System.out.println("Bitwise XOR: " + (a ^ b));
    }
}
