package JAVA.Array.ONE_D;

public class searching {
    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 2;
        arr[1] = 3;
        arr[2] = 110;
        int target = 10;

        boolean isFound = true;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                isFound = true;
            } else {
                isFound = false;
            }
        }

        if (isFound) {
            System.out.println(target + " Target is found");
        } else {
            System.out.println(target + " not found");
        }
    }
}
