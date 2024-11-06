package STRIVERDSA.Array;

import java.util.HashSet;

public class longestConsecutive {

    public static void solution(int[] arr) {
        int longest = 1;
        int count = 0;
        HashSet<Integer> ans = new HashSet<>();
        for (Integer it : ans) {
            int x = 0;
            if (!ans.contains(it - 1)) {
                count = 1;
                x = it;
            }

            while (ans.contains(x + 1)) {
                x++;
                count++;
                longest = Math.max(longest, count);
            }
        }
        System.out.println("Longest consecutive: " + longest);

    }

    public static void main(String[] args) {

        solution(arr);
    }
}
