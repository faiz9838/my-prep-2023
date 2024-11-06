package STRIVERDSA.Array;

import java.util.ArrayList;

public class intersection {

    public static void bruteSolution(int[] arr1, int[] arr2) {
        int i = 0;
        int j = 0;

        int n1 = arr1.length;
        int n2 = arr2.length;

        ArrayList<Integer> ans = new ArrayList<>();
        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr1[i] > arr2[j]) {
                j++;
            } else {
                ans.add(arr1[i]);
                i++;
            }
        }

        for (Integer integer : ans) {
            System.out.print(integer + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5, 6, 7 };
        int[] arr2 = { 1, 2, 4, 5, 7, 8 };

        bruteSolution(arr1, arr2);
    }
}
