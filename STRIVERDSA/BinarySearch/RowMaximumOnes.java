package STRIVERDSA.BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;

import JAVA.Collection.List.ArrayList.Method.toArray;

public class RowMaximumOnes {

    public static int brute_solution(int[][] arr) {
        int index = -1;
        int maxCount = -1;

        int n = arr.length - 1;
        int m = arr.length - 1;

        for (int i = 0; i < n; i++) {
            int count_ones = 0;
            for (int j = 0; j < m; j++) {
                count_ones += arr[i][j];
            }

            if (count_ones > maxCount) {
                maxCount = count_ones;
                index = i;
            }
        }
        return index;
    }

    public static int lowerBound(ArrayList<Integer> arr, int n, int x) {
        int low = 0, high = n - 1;
        int ans = n;

        while (low <= high) {
            int mid = (low + high) / 2;
            // maybe an answer
            if (arr.get(mid) >= x) {
                ans = mid;
                // look for smaller index on the left
                high = mid - 1;
            } else {
                low = mid + 1; // look on the right
            }
        }
        return ans;
    }

    public static int optimal_solution(ArrayList<ArrayList<Integer>> matrix, int n, int m) {
        int cnt_max = 0;
        int index = -1;

        // traverse the rows:
        for (int i = 0; i < n; i++) {
            // get the number of 1's:
            int cnt_ones = m - lowerBound(matrix.get(i), m, 1);
            if (cnt_ones > cnt_max) {
                cnt_max = cnt_ones;
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[][] arr = {
                { 0, 0, 1, 1 },
                { 0, 1, 1, 1 },
                { 0, 0, 0, 0 },
                { 0, 1, 1, 1 }
        };

        System.out.println("Brute: Max Ones row -> " + brute_solution(arr));

        int n = 3, m = 3;
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(  ArrayList<>(Arrays.asList(1, 1, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(0, 0, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(0, 0, 0)));

        System.out.println("Optimal: Max Ones row -> " + optimal_solution(matrix, n, m));
    }
}