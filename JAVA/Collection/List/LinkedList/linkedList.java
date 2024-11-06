package JAVA.Collection.List.LinkedList;

import java.util.*;

public class linkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(2000);
        list.add(500);
        System.out.println(list.pollLast());

        System.out.println(list);
    }
}
