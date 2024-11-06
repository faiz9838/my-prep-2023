package STRIVERDSA.Sorting;

public class insertionSorting {

    public static void sorting(int[] arr) {
        for (int i = 0; i <= arr.length - 1; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void recursive(int[] arr, int index) {

        if (index == arr.length) {
            return;
        }
        int j = index;

        while (j > 0 && arr[j - 1] > arr[j]) {
            int temp = arr[j - 1];
            arr[j - 1] = arr[j];
            arr[j] = temp;
            j--;
        }

        recursive(arr, index + 1);

    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 5, 6, 1, 6, 7 };

        // sorting(arr);
        recursive(arr, 0);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}