package JAVA8.FunctionalInterface;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class biConsumerEx2 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(100, "Faiz Ahmad");

        BiConsumer<Map<Integer, String>, String> biCon = biConsumerEx2::showDetails;
        biCon.accept(map, "Student");
    }

    static void showDetails(Map<Integer, String> map, String name) {
        map.forEach((key, val) -> System.out.println(key + " " + val));
    }
}
