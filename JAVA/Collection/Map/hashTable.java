package JAVA.Collection.Map;

import java.util.Enumeration;
import java.util.Hashtable;

public class hashTable {
    public static void main(String[] args) {
        Hashtable<String, Integer> ht = new Hashtable<>();

        ht.put("A", 10);
        ht.put("B", 20);
        ht.put("C", 50);

        Enumeration<String> keys = ht.keys();

        while (keys.hasMoreElements()) {
            String key = keys.nextElement();
            System.out.println("Keys: " + key + ", Value: " + ht.get(key));
        }
    }
}
