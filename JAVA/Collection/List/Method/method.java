package JAVA.Collection.List.Method;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class method {
    public static void main(String[] args) {
        List<Integer> ans = new ArrayList<>();
        // ADD() => Inserting a elememt into the listS
        ans.add(30);
        ans.add(50);
        ans.add(70);
        ans.add(100);

        System.out.println(ans);

        // ADDALL() => use for insert one object to another
        List<Integer> list = new ArrayList<>();
        list.add(330);
        list.add(5000);
        list.add(700);
        list.add(1000);
        ans.addAll(list);
        System.out.println(ans);

        // lastIndexOf => give last element position in list
        System.out.println("Last element index: " + ans.lastIndexOf(1000));

        // Equals() => compare the element of the list is equal or not
        System.out.println("Elements is equals: " + list.equals(list));

        // Iteration of list

        // for (Integer x : ans) {
        // System.out.print(x + " ");
        // }

        // hashCode => return hashcode value of given list

        int hash = list.hashCode();
        System.out.println("HashCode => " + hash);

    }
}
