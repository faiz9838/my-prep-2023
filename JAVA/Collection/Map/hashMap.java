package JAVA.Collection.Map;

import java.util.HashMap;

public class hashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Faiz Ahmad", 10);
        map.put("Shaikh Tahoora", 40);

        System.out.println(map);

        // size() => print the size of map
        System.out.println("Size of map is: " + map.size());

        // contains() => printing the value for the corresponding key
        System.out.println("Value for key: " + map.containsKey("Faiz Ahmad"));

        if (map.containsKey("Shaikh Tahoora")) {
            Integer a = map.get("Shaikh Tahoora");

            System.out.println("Value for key: " + a);
        }

        //
    }
}
