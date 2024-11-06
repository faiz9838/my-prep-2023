package STRIVERDSA.Array;

public class uniqueNumber {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 1, 1, 1, 2, 3 };

        int ans = 0;
        for (int x : arr) {
            ans ^= x;
        }
        System.out.println("Unique number is: " + ans);
    }
}
