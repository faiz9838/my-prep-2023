package JAVA.Collection.Set.HashSet;

import java.util.Collections;
import java.util.HashSet;

public class max_min {
    public static void main(String[] args) {
        HashSet<Integer> ans = new HashSet<>();

        ans.add(10);
        ans.add(60);
        ans.add(90);

        System.out.println("Maximum element is: " + Collections.max(ans));
        System.out.println("Minimum element is: " + Collections.min(ans));
    }
}
