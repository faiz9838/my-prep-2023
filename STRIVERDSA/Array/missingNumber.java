package STRIVERDSA.Array;

public class missingNumber {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 9, 10 };
        int sum = 0;
        int s = 0;
        int n = arr.length + 1;
        for (int x : arr) {
            sum += x;
        }

        s = (n * (n + 1)) / 2;

        System.out.println("Missing number is: " + (s - sum));
    }
}
