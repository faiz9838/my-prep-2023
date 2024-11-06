package JAVA.Collection.List.ArrayList.Method;

import java.util.ArrayList;

public class get {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(30);
        list.add(50);
        System.out.println("first index element: " + list.get(1));
    }
}
