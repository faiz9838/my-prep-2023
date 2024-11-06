package JAVA8.StreamAPI;

import java.util.ArrayList;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.*;

class product {
    int id;
    String name;
    float price;

    public product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;

    }
}

public class filterExmple {
    public static void main(String[] args) {
        List<product> productList = new ArrayList<>();

        productList.add(new product(1, "Dell laptop", 50000));
        productList.add(new product(2, "HP laptop", 20000));
        productList.add(new product(3, "Asus laptop", 25000));
        productList.add(new product(4, "Lenovo laptop", 57000));

        // List<Float> productPriceList = new ArrayList<>();

        // for (product prod : productList) {
        // if (prod.price < 30000) {
        // productPriceList.add(prod.price);
        // }
        // }
        // System.out.println(productPriceList);
        List<Float> prodListPrice = productList.stream().filter(p -> p.price > 30000).map(p -> p.price)
                .collect(Collectors.toList());
        System.out.println(prodListPrice);
    }

}