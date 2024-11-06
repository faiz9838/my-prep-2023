package JAVA.Collection.List.ArrayList;

import java.util.ArrayList;

public class addAll {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);

        System.out.println("List - 1");
        for (int x : list1) {
            System.out.print(x + " ");
        }

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(40);
        list2.add(50);
        list2.add(60);

        System.out.println("\nList - 2");
        for (int x : list2) {
            System.out.print(x + " ");
        }

        list1.addAll(list2);

        System.out.println("\nPrinting all list element");
        for (Integer integer : list1) {
            System.out.print(integer + " ");
        }
    }
}
