package JAVA.Array.ONE_D;

import java.util.Arrays;

public class binarySearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };

        int target = 5;

        System.out.println("Binary search is: " + Arrays.binarySearch(arr, target));
    }
}
