package JAVA.Collection.List.AbstractList.Method;

import java.util.*;

public class method {
    public static void main(String[] args) {
        AbstractList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(30);
        list.add(60);
        list.add(80);
        list.add(150);
        list.add(110);
        list.add(104);
        list.add(1066);

        // Sublist Method => return the portion at specified fromIndex, toIndex
        List<Integer> ans = list.subList(2, 5);
        System.out.println(ans);

        // Equals method => Compares the specified object with this list for equality.

        System.out.println(list.get(0).equals(2));

        // LastIndexOf() => Returns the index of the last occurrence of the specified
        // element in this list, or -1 if this list does not contain the element.

        System.out.println("Last isndex of list: " + list.lastIndexOf(104));

        // iterator() =>

        @SuppressWarnings("rawtypes")
        Iterator it = list.iterator();
        while (it.hasNext()) {
            System.out.println("Values is: " + it.next());
        }
    }
}
