package JAVA.Collection.List.ArrayList.Method;

import java.util.ArrayList;

public class addAll {

    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("100");
        list1.add("200");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Hundred");
        list2.add("Two Hundred");

        list2.addAll(list1);
        // Collections.sort(list2);
        System.out.println(list2);

        ArrayList<String> list4 = new ArrayList<>();

        // Insert list at particular index
        list4.addAll(0, list2);

        System.out.println(list4);

    }
}
