package STRIVERDSA.Array;

import java.util.ArrayList;

public class twoSum {

    public static void brute_sol(int[] arr, int k) {

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> var = new ArrayList<>(2);
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {
                if (arr[i] + arr[j] == k) {
                    var.add(arr[i]);
                    var.add(arr[j]);
                }

            }
            break;

        }
        System.out.println(var);

    }

    public static int[] opt_sol(int[] arr, int k) {
        int n = arr.length;
        int i = 0;
        int j = n - 1;

        int[] sum = new int[2];
        sum[0] = -1;
        sum[1] = -1;
        while (i < j) {

            if (arr[i] + arr[j] == k) {

                sum[0] = arr[i];
                sum[1] = arr[j];
                return sum;
            }
            if (arr[i] + arr[j] > k) {
                j--;
            } else {
                i++;
            }
        }
        return sum;

    }

    public static void main(String[] args) {
        int[] arr = { 3, 4, 5, 6, 7 };
        int k = 7;

        brute_sol(arr, k);
        int[] ans = opt_sol(arr, k);
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }
}
