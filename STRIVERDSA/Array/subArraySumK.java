package STRIVERDSA.Array;

public class subArraySumK {

    public static int subArraySumWithK(int[] arr, int n, int target) {
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];

                    if (sum == target)
                        cnt++;
                }
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 1, 2, 4 };
        int n = arr.length;

        int ans = subArraySumWithK(arr, n, 6);
        System.out.print("Sub arrays: " + ans);
    }
}
