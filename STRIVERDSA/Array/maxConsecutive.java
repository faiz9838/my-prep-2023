package STRIVERDSA.Array;

public class maxConsecutive {

    public static int max_consecutive(int[] arr) {
        int maxOnes = Integer.MIN_VALUE;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
            } else {
                count = 0;
            }

            maxOnes = Math.max(maxOnes, count);
        }

        return maxOnes;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 0, 2, 3, 1, 1, 1, 0, 1, 0 };

        System.out.println("Maximum consecutive ones: " + max_consecutive(arr));
    }
}
