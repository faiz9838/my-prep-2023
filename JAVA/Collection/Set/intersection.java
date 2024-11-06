package JAVA.Collection.Set;

import java.util.HashSet;
import java.util.Set;

public class intersection {
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

        // retainAll() => This method is used to remove all the elements from the
        // collection which are present in the set. This method returns true if this set
        // changed as a result of the call.
        Set<Integer> intersection = new HashSet<>(list1);
        intersection.retainAll(list2);
        System.out.println("Intersection of list1 and list2: " + intersection);
    }
}
