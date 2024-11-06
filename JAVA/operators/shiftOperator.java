package JAVA.operators;

public class shiftOperator {
    public static void main(String[] args) {
        int a = 10;

        System.out.println("Left sift: " + (a << 2));
        System.out.println("Right sift: " + (a >> 2));
        System.out.println("Same as Right sift: " + (a >>> 2));

    }
}
