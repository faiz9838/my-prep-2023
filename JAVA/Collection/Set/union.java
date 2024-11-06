package JAVA.Collection.Set;

import java.util.HashSet;
import java.util.Set;

public class union {
    public static void main(String[] args) {
        Set<Integer> list1 = new HashSet<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        Set<Integer> list2 = new HashSet<>();
        list2.add(10);
        list2.add(4);
        list2.add(3);
        list2.add(7);
        list2.add(5);

        Set<Integer> union = new HashSet<>(list1);
        union.addAll(list2);
        System.out.println("Union is: " + union);
    }
}