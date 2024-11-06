package JAVA8.FunctionalInterface;

import java.util.function.*;

public class BiConsumerEx {
    public static void showInformation(String name, Integer age) {
        System.out.println(name + " " + age);
    }

    public static void main(String[] args) {
        BiConsumer<String, Integer> biCon = BiConsumerEx::showInformation;
        biCon.accept("Faiz Ahmad", 200);
        biCon.accept("Shaikh Tahoora", 300);

        BiConsumer<String, Integer> biCon2 = (name, age) -> System.out.println(name + " " + age);

    }
}
