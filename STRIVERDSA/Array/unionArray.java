package STRIVERDSA.Array;

import java.util.ArrayList;
import java.util.HashSet;

public class unionArray {

    public static void brute_union(int[] arr1, int[] arr2) {

        HashSet<Integer> union = new HashSet<>();

        for (Integer integer : arr1) {
            union.add(integer);
        }

        for (Integer integer : arr2) {
            union.add(integer);
        }

        for (Integer integer : union) {
            System.out.print(integer + " ");
        }

    }

    public static void optimal_union(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;

        int i = 0;
        int j = 0;

        ArrayList<Integer> union = new ArrayList<>();
        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                if (union.isEmpty() || union.get(union.size() - 1) != arr1[i]) {
                    union.add(arr1[i]);
                }
                i++;
            } else if (arr1[i] > arr2[j]) {
                if (union.isEmpty() || union.get(union.size() - 1) != arr2[j]) {
                    union.add(arr2[j]);
                }
                j++;
            } else {
                if (union.isEmpty() || union.get(union.size() - 1) != arr1[i]) {
                    union.add(arr1[i]);
                }
                i++;
                j++;
            }
        }

        while (i < n1) {
            if (union.isEmpty() || union.get(union.size() - 1) != arr1[i]) {
                union.add(arr1[i]);
            }
            i++;
        }

        while (j < n2) {
            if (union.isEmpty() || union.get(union.size() - 1) != arr2[j]) {
                union.add(arr2[j]);

            }
            j++;
        }

        for (Integer integer : union) {
            System.out.print(integer + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5, 6 };
        int[] arr2 = { 3, 4, 5, 6, 7, 8 };

        brute_union(arr1, arr2);
        System.out.println();
        optimal_union(arr1, arr2);
    }
}
