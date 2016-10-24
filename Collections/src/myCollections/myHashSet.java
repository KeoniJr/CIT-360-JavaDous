package myCollections;

import java.util.HashSet;

/**
 * Created by Keoni AledoJr on 10/18/2016.
 */
public class myHashSet {

    public static void main(String[] args) {

        // the hashset will not allow multiples and will randomly organize the order of items added by the user
        HashSet hs1 = new HashSet();

        hs1.add("Apple");
        hs1.add("Orange");
        hs1.add("Pinnapple");
        hs1.add("Mango");
        hs1.add("Orange");

        System.out.println(hs1);

        // the hashset will not allow multiples and will randomly organize the order of items added by the user
        HashSet hs2 = new HashSet();

        hs2.add(1);
        hs2.add(2);
        hs2.add(4);
        hs2.add(4);
        hs2.add(4);

        System.out.println(hs2);

        // the hashset will not allow multiples and will randomly organize the order of items added by the user
        HashSet hs3 = new HashSet();

        hs3.add(null);
        hs3.add(null);
        hs3.add(4);
        hs3.add(4);
        hs3.add(" ");
        hs3.add("\n");

        System.out.println(hs3);

        // With the .addAll function you can add two HashSets together even if they have different data types.
        // it also will organize the data types in the combined hashset

        hs1.addAll(hs2);

        System.out.println(hs1);

        // the .isEmpty function tells you if a list is empty

        System.out.println(hs1.isEmpty());

        HashSet emptyHashSet = new HashSet();

        System.out.println(emptyHashSet.isEmpty());

        // the .removeAll function removes multiple values

        HashSet team1 = new HashSet();

        team1.add("john");
        team1.add("jake");
        team1.add("jeff");

        HashSet team2 = new HashSet();

        team2.add("jess");
        team2.add("janett");
        team2.add("jasmin");

        // Here we add the two array list together

        team1.addAll(team2);

        System.out.println(team1);

        // Here we remove team 2 from the combined array list

        team1.removeAll(team2);

        System.out.println(team1);

        // the .clone function makes a copy of the list

        team1.clone();

        System.out.println(team1);

        // the .clear function clears a list;

        team2.clear();

        System.out.println(team2);

        // NASTY PATHS =================================================================================================



    }
}
