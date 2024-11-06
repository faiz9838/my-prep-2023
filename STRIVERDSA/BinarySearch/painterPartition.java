package STRIVERDSA.BinarySearch;

public class painterPartition {

    public static int countPainters(int[] arr, int time) {
        int n = arr.length;
        int painters = 1;
        long boardPainter = 0;

        for (int i = 0; i < n; i++) {
            if (boardPainter + arr[i] <= time) {
                boardPainter += arr[i];

            } else {
                painters++;
                boardPainter = arr[i];
            }
        }
        return painters;
    }

    public static int findLargestMinDistanceBrute(int[] arr, int k) {
        int low = arr[0];
        int high = 0;
        for (int i : arr) {
            low = Math.max(low, i);
            high += i;
        }

        for (int i = low; i <= high; i++) {
            if (countPainters(arr, i) <= k) {
                return i;
            }
        }
        return low;

    }

    public static int OptimalSolution(int[] arr, int k) {
        int low = arr[0];
        int high = 0;

        for (int x : arr) {
            low = Math.max(low, x);
            high += x;
        }

        int start = low, end = high;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (countPainters(arr, mid) > k) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40 };
        int k = 2;

        System.out.println("The answer is: " + findLargestMinDistanceBrute(arr, k));
        System.out.println("The answer is: " + OptimalSolution(arr, k));
    }
}
