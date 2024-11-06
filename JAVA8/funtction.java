package JAVA8;

import java.util.function.*;

public class funtction {
    public static void main(String[] args) {

        Function<Integer, Integer> f = i -> i * i;
        System.out.println("The square is : " + f.apply(10));
    }
}
