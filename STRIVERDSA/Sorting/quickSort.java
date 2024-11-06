package STRIVERDSA.Sorting;

public class quickSort {

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];

        int index = low - 1;

        for (int i = low; i < high; i++) {
            if (arr[i] <= pivot) {
                index++;
                int temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
            }

        }
        int temp = arr[index + 1];
        arr[index + 1] = arr[high];
        arr[high] = temp;

        return index + 1;

    }

    public static void recursive(int[] arr, int low, int high) {
        if (low < high) {
            int partition = partition(arr, low, high);

            recursive(arr, low, partition - 1);
            recursive(arr, partition + 1, high);

        }

    }

    public static void print(int[] arr) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 5, 1, 6, 7, 8 };
        recursive(arr, 0, arr.length - 1);
        System.out.println();
        // print(arr);
    }
}
