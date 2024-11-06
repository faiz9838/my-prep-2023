package STRIVERDSA.Array;

public class kadane {

    public static void solution(int[] arr) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            max = Math.max(max, sum);
        }
        if (sum < 0) {
            sum = 0;
        }
        System.out.print("Max subarray is: " + max);

    }

    public static void main(String[] args) {
        int[] arr = { -2, 4, -5, -7, 9, 10 };

        solution(arr);
    }
}
