package JAVA.ExceptionHandling;

import JAVA.operators.arthimetic;

public class exceptionTest {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 3, 4, 5 };

        try {
            System.out.println("Started...");
            int result = arr[3] / arr[0];
            System.out.println("Division is: " + result);
        } catch (ArithmeticException e) {

            System.out.println(e.getMessage());
        } finally {
            System.out.println("Terminated...");
        }
    }
}
