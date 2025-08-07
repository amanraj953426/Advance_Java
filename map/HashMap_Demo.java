package map;

import java.util.HashMap;
import java.util.Map;

public class HashMap_Demo {
    public static void main(String[] args) {
        // Creating a empty HashMap
        Map<String, Integer> m = new HashMap<>();

        // Add element using put() method
        m.put("Ram", 200);
        m.put("Sweeta", 59);
        m.put("Aman", 1);

        // Iterating element
        for (Map.Entry<String, Integer> mapElement : m.entrySet()){
            System.out.println(mapElement.getKey() + " : " +mapElement.getValue());

        }

    }
}

/*
HashMap not follow any order

OUTPUT :
Aman : 1
Ram : 200
Sweeta : 59
 */
