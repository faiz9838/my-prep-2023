package JAVA.Array.ONE_D;

import java.util.Scanner;

public class example {
    public static void main(String[] args) {
        int[] arr = new int[3];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a array value: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array value is: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
