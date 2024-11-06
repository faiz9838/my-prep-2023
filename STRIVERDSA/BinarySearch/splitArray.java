package STRIVERDSA.BinarySearch;

public class splitArray {

    public static int countPartition(int[] arr, int maxSum) {
        int partition = 1;
        int subArraySum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (subArraySum + arr[i] <= maxSum) {
                subArraySum += arr[i];
            } else {
                partition++;
                subArraySum = arr[i];
            }
        }
        return partition;
    }

    public static int splitArrayBrute(int[] arr, int k) {
        int low = arr[0];
        int high = 0;

        for (int i : arr) {
            high += i;
            low = Math.max(low, i);
        }
        for (int i = low; i <= high; i++) {
            int partition = countPartition(arr, i);
            if (partition == k) {
                return i;
            }
        }
        return low;

    }

    public static int optimalSolution(int[] arr, int k) {
        int low = arr[0];
        int high = 0;

        for (int x : arr) {
            low = Math.max(low, x);
            high += x;
        }

        int start = low, end = high;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (countPartition(arr, mid) > k) {
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

        System.out.println("The answer is: " + splitArrayBrute(arr, k));
        System.out.println("The answer is: " + optimalSolution(arr, k));

    }
}