package STRIVERDSA.BinarySearch;

public class minimumRotated {

    public static int rotatedSorted(int[] arr) {
        int start = 0, end = arr.length - 1;

        while (start < end) {
            int mid = (start + end) / 2;

            if (arr[mid] < arr[end]) {
                end = mid;

            } else {
                start = mid + 1;
            }

        }
        return arr[start];
    }

    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
        System.out.println("Minimum rotated sorted: " + rotatedSorted(arr));

    }
}
