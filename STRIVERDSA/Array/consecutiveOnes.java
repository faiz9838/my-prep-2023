package STRIVERDSA.Array;

public class consecutiveOnes {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 1, 5, 1, 1, 1, 1 };

        int count = 0;
        int maxOnes = Integer.MIN_VALUE;
        for (int x : arr) {
            if (x == 1) {
                count++;
            } else {
                count = 0;
            }
            maxOnes = Math.max(maxOnes, count);
        }
        System.out.print("Max consecutive ones: " + maxOnes);
    }
}
