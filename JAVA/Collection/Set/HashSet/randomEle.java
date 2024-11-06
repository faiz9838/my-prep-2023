package JAVA.Collection.Set.HashSet;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class randomEle {
    public static void main(String[] args) {
        Set<Integer> ans = new HashSet<>();

        ans.add(10);
        ans.add(30);
        ans.add(50);
        ans.add(70);
        ans.add(90);

        Integer[] arr = ans.toArray(new Integer[ans.size()]);

        Random rnd = new Random();
        int rndNumber = rnd.nextInt(ans.size());
        System.out.println("Random number is: " + arr[rndNumber]);
    }

}