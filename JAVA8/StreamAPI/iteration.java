package JAVA8.StreamAPI;

import java.util.stream.*;

public class iteration {
    public static void main(String[] args) {
        Stream.iterate(1, element -> element + 1).filter(element -> element % 2 == 0).limit(5)
                .forEach(System.out::println);
    }
}
