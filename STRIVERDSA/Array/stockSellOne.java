package STRIVERDSA.Array;

public class stockSellOne {

    public static void solution(int[] arr) {
        int minimalPrice = Integer.MAX_VALUE;
        int profit = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int cost = arr[i] - minimalPrice;
            profit = Math.max(profit, cost);
            minimalPrice = Math.min(minimalPrice, arr[i]);
        }

        System.out.println("Profit is:" + profit);
    }

    public static void main(String[] args) {
        int[] arr = { 7, 1, 5, 3, 6, 4 };
        solution(arr);
    }
}