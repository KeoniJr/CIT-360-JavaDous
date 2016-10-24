package myCollections;

import java.util.TreeMap;

/**
 * Created by Keoni AledoJr on 10/19/2016.
 */
public class myTreeMap {

    public static void main(String[] args) {

        // Tree map guarantees that its keys will be sorted in an ascending key order no matter the value of the key
        TreeMap clients = new TreeMap();

        clients.put("Ashley", 100);
        clients.put("Carl", 30);
        clients.put("Ben", 95);
        clients.put("Aaron", 0);

        System.out.println(clients);


    }

}
