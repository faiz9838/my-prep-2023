package STRIVERDSA.Array;

public class movesZeroRight {
    public static void main(String[] args) {
        int[] arr = { 1, 0, 2, 4, 0, 8 };

        int numZero = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[numZero];
                arr[numZero] = temp;
                numZero++;
            }
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

}