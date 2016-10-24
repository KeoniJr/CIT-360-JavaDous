package myCollections;

import java.util.TreeSet;

/**
 * Created by Keoni AledoJr on 10/18/2016.
 */
public class myTreeSet {

    public static void main(String[] args) {

        // the treeset will take in the items added and sorts them for you but will not show duplicates

        // This Treeset is full of numbers
        TreeSet ts1 = new TreeSet();

        ts1.add(10);
        ts1.add(40);
        ts1.add(30);
        ts1.add(20);
        ts1.add(50);
        ts1.add(50);

        System.out.println(ts1);


        // This Treeset is full of strings
        TreeSet ts2 = new TreeSet();

        ts2.add("Keoni");
        ts2.add("Armando");
        ts2.add("David");
        ts2.add("Sue");
        ts2.add("Zack");
        ts2.add("Zack");

        System.out.println(ts2);

        // This Treeset is full of strings, strings of numbers, and a new line and organizes them
        TreeSet ts3 = new TreeSet();

        ts3.add("Keoni");
        ts3.add("1");
        ts3.add("14");
        ts3.add("Zack");
        ts3.add("\n");

        System.out.println(ts3);

        TreeSet ts4 = new TreeSet();

        ts4.add(1);
        ts4.add(2);
        ts4.add(3);

        ts4.addAll(ts1);
        System.out.println(ts4);



        // NASTY PATHS =================================================================================================

        // can not combine a list of strings and int together
        //ts2.addAll(ts1);


        // you cant add a null value to a TreeSet or mix strings with integers
        TreeSet ts5 = new TreeSet();

        //ts5.add(null);
        //ts5.add(1);
        //ts5.add("kayla");

        System.out.println(ts5);


    }
}
