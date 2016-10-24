package myCollections;

import java.util.ArrayList;

/**
 * Created by Keoni AledoJr on 10/5/2016.
 */

// Happy Path for Arraylist

public class myArrayList {
    public static void main(String[] args) {
        ArrayList c1 = new ArrayList();

        c1.add("blue");
        c1.add("red");
        c1.add("yellow");
        c1.add("green");


// This prints out the whole array list
        System.out.println(c1);

// The .set allows you to change the value inside a list by the index number
        c1.set(1, "Violet");

        System.out.println(c1);

//This .get prints out just the item in the arraylist at index number 2
        System.out.println(c1.get(2));

// Arrays can contain multiple types of data
        ArrayList f1 = new ArrayList();

        f1.add("Orange");
        f1.add(null);
        f1.add(73);
        f1.add(74.55);
        f1.add(" ");
        f1.add("\n");

        // the add all function allows you to add two array lists together that are two seperate lists
        f1.addAll(c1);

        System.out.println(f1);

// the .isEmpty function tells you if a list is empty

        System.out.println(c1.isEmpty());

// the .removeAll function removes multiple values

        ArrayList team1 = new ArrayList();

        team1.add("john");
        team1.add("jake");
        team1.add("jeff");

        ArrayList team2 = new ArrayList();

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

        // trying to .get an index number that is not in the arraylist

        // Nasty Paths for the addAll Function

        // the add all function with a null gives an error
        try{
        f1.addAll(null);}
        catch(Exception e){
            e.printStackTrace();
        }

        // this nasty path is trying to print out a index number that does not exist
        try {

            System.out.println(f1.get(10));
        } catch (Exception e) {
            e.printStackTrace();

        }

        // this nasty path is trying to print out a negative index number that does not exist
        try {

            System.out.println(f1.get(-1));
        } catch (Exception e) {
            e.printStackTrace();

        }

        // this nasty path is trying insert into list non existing index of an array list
        try {
            f1.add(7, "help");
            System.out.println(f1);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
