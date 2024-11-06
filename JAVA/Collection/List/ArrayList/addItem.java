package JAVA.Collection.List.ArrayList;

import java.util.ArrayList;

public class addItem {
    public static void main(String[] args) {
        ArrayList<Integer> ans = new ArrayList<>(5);

        // add(object o) method
        ans.add(10);
        ans.add(20);
        ans.add(30);
        ans.add(40);
        ans.add(50);

        // add(index, object o)
        ans.add(3, 100);
        for (int integer : ans) {
            System.out.print(integer + " ");
        }

    }
}
