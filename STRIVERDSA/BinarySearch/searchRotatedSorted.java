package STRIVERDSA.BinarySearch;

public class searchRotatedSorted {

    public static int rotatedSorted(int[] arr, int start, int end, int target) {

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target)
                return mid;

            // CHECKING ROGHT OR LEFT FOR CANCELLATION
            if (arr[start] <= arr[mid]) {
                // Left part
                if (arr[start] <= target && target <= arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
                // Right part
            } else {
                if (arr[end] >= target && arr[mid] <= target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 7, 8, 9, 1, 2, 3, 4, 5, 6 };
        int target = 1;
        int start = 0, end = arr.length - 1;
        int ans = rotatedSorted(arr, start, end, target);
        System.out.println("Sorted rotated element is : " + ans);

    }
}
