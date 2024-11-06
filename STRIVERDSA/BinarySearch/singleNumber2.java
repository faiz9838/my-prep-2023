package STRIVERDSA.BinarySearch;

public class singleNumber2 {

    public static int bruteApproach(int[] arr) {
        int ones = 0, twos = 0;

        for (int nums : arr) {
            ones ^= (nums & (~twos));
            twos ^= (nums & (~ones));
        }
        return ones;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 2, 3, 2 };
        System.out.println("Unique number is: " + bruteApproach(arr));

    }
}
