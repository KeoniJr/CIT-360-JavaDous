package myJSON;

import org.quickconnectfamily.json.*;

import java.io.*;
import java.util.*;

/**
 * Created by Keoni AledoJr on 10/3/2016.
 */
public class School {


    public static void main(String[] args) throws IOException, JSONException, ParseException {

        Student s1 = new Student("Male", "ale11001@byui.edu", "Senior", 36986, "Keoni");

        System.out.println(s1.toString());

        Student s2 = new Student();

        s2.setName("Erenio");
        s2.setId(3676);

        System.out.println(s2.toString());

        HashMap s3HashMap = new HashMap();
        s3HashMap.put("gender", "Male");
        s3HashMap.put("email", "goober@gmail.com");
        s3HashMap.put("year", "Jounior");
        s3HashMap.put("id", 3645);
        s3HashMap.put("name", "Joe Rogan");


        Student s3 = new Student(s3HashMap);

        System.out.println(s3);

        // Here we reset the student s1 name to jon
        s1.setName("Jon");

        System.out.println(s1.getName().toString());

        /* This Line is creating a file.txt and storing in it the project folder */
        File StudentList = new File("StudentList.txt");

        // THIS IS WHERE WE START USING JSON ===========================================================================

         /* These lines of code are calling the Json Library our of the org. package*/
         // the fout and fin allows us to write and then read to the new txt file we created called StudentList

        FileOutputStream fout = new FileOutputStream(StudentList);
        FileInputStream fin = new FileInputStream(StudentList);

        // the jsonOut and jsonIn are the Json version of fout and fin. Reads the fout and fin file and converts it to Json
        JSONOutputStream jsonOut = new JSONOutputStream(fout);
        JSONInputStream jsonIn = new JSONInputStream(fin);


        // We are writing our three objects that we created out to the txt file we created
        jsonOut.writeObject(s1);
        jsonOut.writeObject(s2);
        jsonOut.writeObject(s3);


        //Here we are reading in the date from the txt file and putting it into a hashmap
        HashMap parsedJSONMap = (HashMap) jsonIn.readObject();

        // these two lines of code compare the the manual hash map we created and the hashmap read in for the txt file.
        Student readS4 = new Student(parsedJSONMap);

        System.out.println(readS4);

        System.out.println("stream same? "+readS4.equals(s1));

         /*
          * Stringify and parse example.  Use this if you are not using streams
          * or you need to encrypt the JSON strings.
          */

        String jsonString = JSONUtilities.stringify(s1);
        System.out.println("JSON: "+jsonString);

        parsedJSONMap = (HashMap)JSONUtilities.parse(jsonString);
        readS4 = new Student(parsedJSONMap);
        System.out.println("stringify same? "+readS4.equals(s1));


        // NASTY PATHS =================================================================================================

        // null values can be inputed and outputed

        // Here we are putting in null values for all of our parameters
        Student s5 = new Student(null, null, null, null, null);

        jsonOut.writeObject(s5);

        // here we are trying ot writeObject out a null
        jsonOut.writeObject(null);


    }
}
