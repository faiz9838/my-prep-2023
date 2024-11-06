package STRIVERDSA.Array;

public class majorityElement {

    public static void main(String[] args) {
        int[] arr = { 2, 2, 1, 1, 1, 2, 2 };
        int ele = 0;
        int cnt = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (cnt == 0) {
                cnt = 1;
                ele = arr[i];
            } else if (ele == arr[i]) {
                cnt++;
            } else {
                cnt--;
            }
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (ele == arr[i])
                count++;
        }

        if (count > (n / 2))
            System.out.print(ele);
    }
}
