package JAVA.Array.ONE_D;

import java.util.Arrays;

public class sorting {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 2, 3, 6, 7, 9 };

        Arrays.sort(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
