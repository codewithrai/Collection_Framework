package Collection_Framework;

import java.util.TreeMap;
import java.util.Map;

public class LearnTreeMap {
    public static void main(String[] args) {
        
        // Store in sorting order by keys
        Map<String, Integer> numbers = new TreeMap<>();

        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        numbers.put("Four", 4);
        numbers.put("Five", 5);

        // if (!numbers.containsKey("Two")) {
        //     numbers.put("Two", 23);
        // }
        // numbers.remove(30);
        numbers.putIfAbsent("Two", 23);

        // numbers.clear();
        // System.out.println( numbers.isEmpty() );
        // System.out.println( numbers.containsValue(3) );

        System.out.println( numbers );

        for (Map.Entry<String, Integer> e: numbers.entrySet()) {
            System.out.println( e );
            System.out.println( e.getKey() );
            System.out.println( e.getValue() );
        }
        for (String key: numbers.keySet()) {
            System.out.println( key );
        }
        for (Integer value: numbers.values()) {
            System.out.println( value );
        }
    }
}
