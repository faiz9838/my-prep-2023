package STRIVERDSA.Array;

public class secondSmallest {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 5, 6, 7, 8, 10 };

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (secondSmallest >= arr[i] & arr[i] != smallest) {
                secondSmallest = arr[i];
            }

        }
        System.out.println("Second smallest is: " + secondSmallest);
    }
}
