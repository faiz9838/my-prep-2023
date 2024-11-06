package STRIVERDSA.Sorting;

public class selection {

    public static void sorting(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            int minValue = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minValue]) {
                    // Finding Min Index
                    minValue = j;
                }
            }

            // Swapping the value

            int temp = arr[minValue];
            arr[minValue] = arr[i];
            arr[i] = temp;

        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 5, 1 };
        sorting(arr);
    }

}