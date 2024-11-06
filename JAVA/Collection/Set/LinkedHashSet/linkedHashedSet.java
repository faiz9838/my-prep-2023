package JAVA.Collection.Set.LinkedHashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class linkedHashedSet {
    public static void main(String[] args) {
        // HashSet set = new HashSet<>();
        // LinkedHashSet set = new LinkedHashSet();
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        set.add(20);
        set.add(40);
        set.add(70);
        set.add(100);
        set.add(200);
        System.out.println(set);
    }

}