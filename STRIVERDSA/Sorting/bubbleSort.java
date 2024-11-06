package STRIVERDSA.Sorting;

import java.util.Arrays;

public class bubbleSort {

    public static void iterative(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void recursive(int[] arr, int n) {
        int count = 0;

        if (n == 1) {
            return;
        }
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                count++;
            }
        }
        if (count == 0) {
            return;
        }

        recursive(arr, n - 1);
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 1, 5, 6 };
        // iterative(arr);
        recursive(arr, 6);
        System.out.print(Arrays.toString(arr));
    }
}
