package STRIVERDSA.BinarySearch;

public class serachSorted_2 {

    public static int search(int[] arr, int target) {
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target)
                return mid;

            if (arr[start] == arr[mid] || arr[end] == arr[mid]) {
                start++;
                end--;
                continue;
            }

            if (arr[start] <= arr[mid]) {
                if (arr[start] <= target && arr[mid] >= target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
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
        int[] arr = { 3, 1, 2, 3, 3, 3, 3 };

        System.out.println("Search insert position: " + search(arr, 3));
    }
}
