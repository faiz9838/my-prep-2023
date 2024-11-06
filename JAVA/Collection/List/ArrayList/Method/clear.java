package JAVA.Collection.List.ArrayList.Method;

import java.util.*;

public class clear {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(40);
        list.add(50);
        System.out.println("This is list:" + list);

        list.clear();
        System.out.println("List after using clear method: " + list);
    }
}
