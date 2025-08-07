package map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMap_Demo {
    public static void main(String[] args) {
        // Creating empty LinkedHashMap
        Map<String, Integer> m = new LinkedHashMap<>();

        // Add element using put method
        m.put("Sweeta", 59);
        m.put("Ram", 200);
        m.put("Aman", 1);

        // Iterating element
        for (Map.Entry<String, Integer> mapElement : m.entrySet()){
            System.out.println(mapElement.getKey()+" : "+ mapElement.getValue());

        }
    }
}
/*
LinkedHashMap maintain order

OUTPUT :

Sweeta : 59
Ram : 200
Aman : 1
*/