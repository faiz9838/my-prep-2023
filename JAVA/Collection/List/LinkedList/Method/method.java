package JAVA.Collection.List.LinkedList.Method;

import java.util.Iterator;
import java.util.LinkedList;

public class method {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(2000);
        list.add(500);
        System.out.println(list);

        // AddLast() => add the element into last node of linkedList
        list.addLast(1000);
        System.out.println(list);

        // addFirst() => add the element at begining of the list

        list.addFirst(5000);
        System.out.println(list);

        // descendingIterator() => Iterate the node into descending order or reverse
        // order
        Iterator<Integer> x = list.descendingIterator();

        while (x.hasNext()) {
            System.out.println(x.next());
        }

        // remove() => use for removing the element into linkedList At any specific
        // position

        list.remove(1);
        System.out.println(list);

    }
}
