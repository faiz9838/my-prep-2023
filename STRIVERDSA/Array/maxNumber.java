package STRIVERDSA.Array;

public class maxNumber {
    public static void main(String[] args) {
        int[] arr = { 10, 30, 40, 70, 1000 };

        int max = Integer.MIN_VALUE;
        for (int x : arr) {
            max = Math.max(max, x);
        }

        System.out.println("Maximum element is: " + max);
    }
}
