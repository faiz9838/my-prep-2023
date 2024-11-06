package STRIVERDSA.Array;

import java.util.ArrayList;
import java.util.Collections;

public class leaderInArray {

    public static ArrayList<Integer> solution(int[] arr) {
        int max = Integer.MIN_VALUE;

        int n = arr.length - 1;
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = n; i >= 0; i--) {
            if (arr[i] > max) {
                ans.add(arr[i]);
                max = arr[i];
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 22, 12, 3, 0, 6 };

        ArrayList<Integer> ans = solution(arr);

        Collections.sort(ans);

        for (Integer integer : ans) {
            System.out.print(integer + " ");
        }
    }
}
