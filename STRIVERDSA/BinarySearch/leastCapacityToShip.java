package STRIVERDSA.BinarySearch;

public class leastCapacityToShip {
    public static int findDays(int[] arr, int cap) {
        int load = 0;
        int day = 1;

        for (int i = 0; i < arr.length; i++) {
            if (load + arr[i] > cap) {
                day++;
                load = arr[i];
            } else {
                load += arr[i];
            }
        }
        return day;
    }

    public static int sum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    public static int leastWeightCapacity(int[] arr, int days) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);

        }

        int start = max;
        int end = sum(arr);

        while (start <= end) {
            int mid = start + (end - start) / 2;

            int requireDays = findDays(arr, mid);

            if (requireDays <= days) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int days = 5;

        System.out.println("Least weight capicity to ship : " + leastWeightCapacity(arr, days));
    }
}
