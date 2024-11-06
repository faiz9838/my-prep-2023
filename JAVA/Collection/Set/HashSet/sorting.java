package JAVA.Collection.Set.HashSet;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class sorting {
    public static void main(String[] args) {
        HashSet<Integer> ans = new HashSet<>();
        ans.add(1000);
        ans.add(300);
        ans.add(500);
        ans.add(700);
        ans.add(900);

        List<Integer> list = new ArrayList<>(ans);
        Collections.sort(list);
        System.out.println("Sorted set(using list) is: " + list);

    }
}
