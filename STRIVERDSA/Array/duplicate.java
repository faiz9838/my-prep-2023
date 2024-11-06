package STRIVERDSA.Array;

import java.util.ArrayList;
import java.util.Arrays;

public class duplicate {

    public static void brute_duplicate(int[] arr) {
        Arrays.sort(arr);
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                ans.add(arr[i]);
            }
        }

        for (Integer integer : ans) {
            System.out.print(integer + " ");
        }
    }

    public static void duplicate_opt(int[] arr) {

        Arrays.sort(arr);
        ArrayList<Integer> ans = new ArrayList<>();
        int xor = 0;

        for (int i = 0; i < arr.length; i++) {
            xor ^= i;
        }

        for (int i = 0; i < arr.length; i++) {
            xor ^= arr[i];
            // ans.add(xor);
        }
        // for (Integer integer : ans) {
        // System.out.print(integer + " ");
        // }

        System.out.println(xor);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 1, 2, 3, 4 };

        brute_duplicate(arr);

        duplicate_opt(arr);
    }
}
