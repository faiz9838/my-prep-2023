package STRIVERDSA.Array;

public class sort012 {

    public static void brute_sort012(int[] arr) {
        int cnt0 = 0;
        int cnt1 = 0;
        int cnt2 = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0)
                cnt0++;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1)
                cnt1++;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2)
                cnt2++;
        }

        for (int i = 0; i < cnt0; i++) {
            arr[i] = 0;
        }

        for (int i = cnt0; i < cnt0 + cnt1; i++) {
            arr[i] = 1;
        }

        for (int i = cnt0 + cnt1; i < arr.length; i++) {
            arr[i] = 2;
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }

    }

    public static void opt_solution(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        int mid = 0;

        while (mid <= high) {
            if (arr[mid] == 0) {
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else if (arr[mid] == 2) {
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 0, 1, 0, 2, 2, 1 };

        // brute_sort012(arr);
        opt_solution(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}