package JAVA.Collection.List.ArrayList.Method;

import java.util.ArrayList;

public class toArray {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(30);
        list.add(40);
        list.toArray();
        System.out.println(list);
    }

}
