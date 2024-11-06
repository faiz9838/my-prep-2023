package JAVA8.MethodRefreces;

import java.util.function.*;

class artimetic {
    public static int add(int a, int b) {
        return a + b;
    }
}

public class example3 {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> adder = artimetic::add;

        int result = adder.apply(20, 30);
        System.out.println(result);
    }

}
