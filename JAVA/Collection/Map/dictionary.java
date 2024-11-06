package JAVA.Collection.Map;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;

public class dictionary {

    public static void main(String[] args) {
        Dictionary<String, Integer> dict = new Hashtable<>();
        dict.put("Faiz Ahmad", 1);
        dict.put("Shaikh Tahoora", 2);

        System.out.println(dict);

        int Value = dict.get("Faiz Ahmad");
        System.out.println("Value of Faiz Ahmad: " + Value);

        Enumeration<String> keys = dict.keys();
        while (keys.hasMoreElements()) {
            String key = keys.nextElement();
            System.out.println("Key: " + key + ", Value: " + dict.get(key));
        }
    }
}
