package myCollections;

import java.util.HashMap;

/**
 * Created by Keoni AledoJr on 10/18/2016.
 */
public class myHashMap {
    public static void main(String[] args) {

        // HashMaps us a key and value pair. Key and value pairs can be integers as well as strings

        HashMap hm1 = new HashMap();
        hm1.put(1, "taco");
        hm1.put("b", "Tortas");
        hm1.put(5, 500);


        // Here we are using .get to print out the value that is with the key of b
        System.out.println(hm1.get("b"));

        // Here we are using .get to print out the value that is with the key of 1
        System.out.println(hm1.get(1));

        // Here we are using .get to print out the value that is with the key of 5
        System.out.println(hm1.get(5));

        // Here we are using the .containsValue to see if the HashMap has a spacific value in it
        System.out.println(hm1.containsValue("Tortas"));

        System.out.println(hm1.containsValue(400));

        // Here we use the .keyset function to print out the keys used in our HashMap
        System.out.println(hm1.keySet());

        // Here we use the .values function to print out the values in our HashMap
        System.out.println(hm1.values());

        // Here we create a hash Map and use the arguments to say that the Key has to be a Integer and the Value a string
        HashMap <Integer, String> hm2 = new HashMap();

        hm2.put(1, "Keoni");
        hm2.put(2, "Bethany");
        hm2.put(3, "Courtney");
        hm2.put(4, "Kayla");


        // Here we print out the whole HashMap, key with its value
        System.out.println(hm2);

        // Here we are using the .get function to print out the value to the key of 4
        System.out.println(hm2.get(4));

        // Here we create a hash Map and use the arguments to say that the Key has to be a Integer and the Value a string
        HashMap <String, String> hm3 = new HashMap();

        hm3.put("Mock", "Yeah");
        hm3.put("ing", "Yeah");
        hm3.put("Bird", "Yeah");
        hm3.put("Mocking Bird", "Yeah!");
        hm3.put( null, "Yeah!");
        hm3.put( null, null);
        hm3.put( null, "");


        // Here we print out the whole HashMap, key with its value
        System.out.println(hm3);

        // NASTY PATH ==================================================================================================

        // If you put into your hash map a key that is the same as another key already in the the Hash Map
        // you will not get an error but when you use get to print out the value that is with that key
        // it will print out the value with the last key entry that is the same in the HashMap
        hm1.put(1, 100);

        System.out.println(hm1.get(1));

        // Since we specified that the Key would be an integer and the value a string you cant have the key be
        // string and the value and int
        //hm2.put("Keoni", 1);

        // Trying to print out a value to a key that is not there
        System.out.println(hm2.get(5));

        // what if the key is null
        // what if the value is null
        // what if the key and the value and null
        // what if you do a get and the key is not in there

        System.out.println(hm3);

        System.out.println(hm2.get(6));

    }
}
