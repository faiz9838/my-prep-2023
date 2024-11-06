package JAVA.Collection.Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class linkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        map.put(10, "BSC IT");
        map.put(30, "BCOM");
        System.out.println(map);

        for (Map.Entry<Integer, String> mapElement : map.entrySet()) {
            Integer key = mapElement.getKey();
            String value = mapElement.getValue();
            System.out.println(key + " : " + value);
        }
    }
}
