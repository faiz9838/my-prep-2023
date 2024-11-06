package STRIVERDSA.Array;

public class secondLargest {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 7, 8, 10 };

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] < secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        System.out.println("Second largest is: " + secondLargest);
    }
}
