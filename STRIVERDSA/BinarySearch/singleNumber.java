package STRIVERDSA.BinarySearch;

public class singleNumber {

    // Brute force approach

    public static int bruteSingleNumber(int[] arr) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans ^= arr[i];
        }
        return ans;
    }

    // Optimal approach - Binary Search

    public static int optimalSingleNumber(int[] arr) {
        int n = arr.length;
        int start = 1, end = n - 2;

        if (n == 1)
            return arr[0];
        if (arr[0] != arr[1])
            return arr[0];
        if (arr[n - 1] != arr[n - 2])
            return arr[n - 1];

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] != arr[mid + 1] && arr[mid] != arr[mid - 1])
                return mid;

            if (mid % 2 == 1 && arr[mid] == arr[mid - 1] || mid % 2 == 0 && arr[mid] == arr[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 4, 4, 5, 5, 6, 6 };

        System.out.println("Brute -> unique number: " + bruteSingleNumber(arr));
        System.out.println("Optimal -> unique number is: " + optimalSingleNumber(arr));
    }
}
