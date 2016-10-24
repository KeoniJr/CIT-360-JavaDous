package myJSON;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;

import org.quickconnectfamily.json.*;
import java.io.File;

public class JsonTesting {


    public static void main(String[] args){

        try {
           /*
            * JSON file IO example.  Socket IO would be done the same way
            * except that the output and input streams would be retrieved
            * from a socket rather than created.
            */

           /* This Line is creating a file.txt and storing in it the project folder */
            File myFile = new File("myFileData.txt");

            /* These lines of code are calling the Json Library our of the org. package*/
            FileOutputStream fout = new FileOutputStream(myFile);
            FileInputStream fin = new FileInputStream(myFile);

            JSONOutputStream jsonOut = new JSONOutputStream(fout);
            JSONInputStream jsonIn = new JSONInputStream(fin);

         /*
          * An example serializable to be written out.  This could be
          * any Java Collection or Map if you want to write out groups
          * of serializables.
          */
            Date exampleDate = new Date();
            TestObject anObject = new TestObject("Hello", 12, exampleDate);
            TestObject anObject2 = new TestObject("Sup", 73, exampleDate);

            jsonOut.writeObject(anObject);
            jsonOut.writeObject(anObject2);

            //since I wrote out an object I get a HashMap back.
            HashMap parsedJSONMap = (HashMap) jsonIn.readObject();
            TestObject readObject = new TestObject(parsedJSONMap);
            System.out.println("stream same? "+readObject.equals(anObject));


         /*
          * Stringify and parse example.  Use this if you are not using streams
          * or you need to encrypt the JSON strings.
          */

            String jsonString = JSONUtilities.stringify(anObject);
            System.out.println("JSON: "+jsonString);

            parsedJSONMap = (HashMap)JSONUtilities.parse(jsonString);
            readObject = new TestObject(parsedJSONMap);
            System.out.println("stringify same? "+readObject.equals(anObject));

            //this is the quickconnectfamily JSONException not the standard one.
        } catch (JSONException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}