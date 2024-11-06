package STRIVERDSA.BinarySearch;

public class kokoEatBanana {

    public static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        return max;
    }

    public static int calculateHours(int[] arr, int h) {
        int totalHour = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            totalHour += Math.ceil((double) (arr[i]) / (double) (h));
        }
        return totalHour;
    }

    public static int minimumRateToEateBanana(int[] arr, int h) {
        int low = 1, high = findMax(arr);

        while (low <= high) {
            int mid = (low + high) / 2;

            int requireHour = calculateHours(arr, mid);

            if (requireHour <= h) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int[] arr = { 7, 15, 6, 3 };
        int h = 8;

        int ans = minimumRateToEateBanana(arr, h);
        System.out.println("Minimum time to require eat bananas : " + ans + " hours");
    }
}
