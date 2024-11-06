package STRIVERDSA;

import java.util.ArrayList;
import java.util.HashSet;

public class hello {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 6 };
        int target = 7;

        int[] ans = new int[2];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    ans[0] = arr[i];
                    ans[1] = arr[j];
                }
            }
        }

        for (int x : ans) {
            System.out.print(x + " ");
        }

    }
}