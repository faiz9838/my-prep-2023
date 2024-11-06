package JAVA.Collection.Set.TreeSet;

import java.util.Set;
import java.util.TreeSet;

import java.util.Iterator;

public class example {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        TreeSet<Integer> set2 = new TreeSet<>();

        set2.add(10);
        set2.add(20);
        set2.add(30);
        set2.add(40);

        set.add("Faiz");
        set.add("Ahmad");
        set.add("Mumbai");
        set.add("Maharashtra");

        System.out.println(set);

        // ceiling() => This method returns the least element in this set greater than
        // or equal to the given element, or null if there is no such element.
        int ceiling = set2.ceiling(10);
        System.out.println(set2);

        // descendigIterator() => The descendingIterator() method of
        // java.util.TreeSet<E> class is used to return an iterator over the elements in
        // this set in descending order.

        Iterator<Integer> it = set2.descendingIterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
