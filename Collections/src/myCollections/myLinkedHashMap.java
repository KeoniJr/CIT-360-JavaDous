package myCollections;

import java.util.LinkedHashMap;

/**
 * Created by Keoni AledoJr on 10/19/2016.
 */
public class myLinkedHashMap {

    public static void main(String[] args) {

        // LinkedHashMaps do key and value pairs and keeps the order in which they were inserted into the Map

        LinkedHashMap lhm1 = new LinkedHashMap();

        lhm1.put(1, "car");
        lhm1.put(2, "truck");
        lhm1.put(3, "suv");
        lhm1.put(4, "van");

        // This is printing out all the keys and values in the LinkedHashMap
        System.out.println(lhm1);

        // This is printing out just the value for the key of 2
        System.out.println(lhm1.get(2));

        // This is printing out true or false if there is a value that is specified
        System.out.println(lhm1.containsValue("van"));

        // This is printing out true or false if there is a value that is specified
        System.out.println(lhm1.containsValue(1));

        // This prints out the key in the maps
        System.out.println(lhm1.keySet());



    }
}
