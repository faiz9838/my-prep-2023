package JAVA.Array.TWO_D;

import java.util.Arrays;

public class search {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 11, 13, 41, 22 }
        };

        int[] ans = new int[3 * 4];
        // for (int[] x : arr) {
        // for (int is : x) {
        // System.out.print(is + " ");
        // }
        // }

        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <= arr.length; j++) {
                ans[index] = arr[i][j];
                index++;
            }
        }

        System.out.println(Arrays.binarySearch(ans, 11));

    }
}
