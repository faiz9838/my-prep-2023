package STRIVERDSA.BinarySearch;

public class bookAllocate {

    public static int countStudent(int[] arr, int pages) {
        int student = 1;
        int pageStudent = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] + pageStudent <= pages) {
                pageStudent += arr[i];
            } else {
                student++;
                pageStudent = arr[i];
            }
        }
        return student;
    }

    public static int bruteFindPages(int[] arr, int m) {

        int low = arr[0];
        int high = 0;
        for (int i = 0; i < arr.length; i++) {
            low = Math.max(low, arr[i]);
            high += arr[i];
        }

        for (int pages = low; pages <= high; pages++) {
            if (countStudent(arr, pages) == m) {
                return pages;
            }
        }
        return low;
    }

    public static int optimalFindPages(int[] arr, int m) {
        int low = arr[0];
        int high = 0;

        for (int i : arr) {
            low = Math.max(low, i);
            high += i;
        }

        while (low <= high) {
            int mid = (low + high) / 2;

            if (countStudent(arr, mid) > m) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int[] arr = { 25, 46, 28, 49, 24 };
        int student = 4;

        System.out.println("Number of pages: " + bruteFindPages(arr, student));
        System.out.println(optimalFindPages(arr, student));
    }
}
