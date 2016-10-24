package myCollections;

import java.util.LinkedHashSet;

/**
 * Created by Keoni AledoJr on 10/18/2016.
 */
public class myLinkedHashSet {

    public static void main(String[] args) {

        // the linkedhashset will not allow multiples and will keep the order of items added by user


        // This is LinkedHashSet with integers
        LinkedHashSet lh1 = new LinkedHashSet();

        lh1.add(1);
        lh1.add(5);
        lh1.add(11);
        lh1.add(1);
        lh1.add(2);

        System.out.println(lh1);


        // This is LinkedHashSet with Strings
        LinkedHashSet lh2 = new LinkedHashSet();

        lh2.add("Car");
        lh2.add("truck");
        lh2.add("boat");
        lh2.add("Car");

        System.out.println(lh2);

        // This is a LinkedHashSet with a mix of all data types
        LinkedHashSet lh3 = new LinkedHashSet();

        lh3.add("Car");
        lh3.add(" ");
        lh3.add(1);
        lh3.add(null);
        lh3.add("\n");

        System.out.println(lh3);

        // the add all function is adding together two of the LinkedHashSets and orders the items by how they are added
        // the .addall function will combine LinkedHashSets with different data types

        lh3.addAll(lh1);

        System.out.println(lh3);

        LinkedHashSet team1 = new LinkedHashSet();

        team1.add("john");
        team1.add("jake");
        team1.add("jeff");

        LinkedHashSet team2 = new LinkedHashSet();

        team2.add(1);
        team2.add(2);
        team2.add(3);
        team2.add("john");

        // Here we add the two LinkedHashSet together and in the print out it will not print the duplicates

        team1.addAll(team2);

        System.out.println(team1);

        // Here we remove team 2 from the combined LinkedHashSet

        team1.removeAll(team2);

        System.out.println(team1);

        // the .isEmpty function tells you if a list is empty

        System.out.println(team1.isEmpty());

        // the .clone function makes a copy of the list

        team1.clone();

        System.out.println(team1);

        // the .clear function clears a list;

        team2.clear();

        System.out.println(team2);


        // NASTY PATHS =================================================================================================



    }
}
