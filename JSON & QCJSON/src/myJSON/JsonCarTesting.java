

//region Description

//<editor-fold desc="Description">
package myJSON;



import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Date;
import java.util.HashMap;

import org.quickconnectfamily.json.*;
import java.io.File;


 /* Created by newuser on 1/28/16.*/

public class JsonCarTesting {

    public static void main(String[] args) {



        try {
            File myFile = new File("myFileData.txt");
            FileOutputStream fileOut = new FileOutputStream(myFile);
            FileInputStream fileIn = new FileInputStream(myFile);

            JSONOutputStream jsonOut = new JSONOutputStream(fileOut);
            JSONInputStream jsonIn = new JSONInputStream(fileIn);


            JsonVehicle car1 = new JsonVehicle("Honda", "Civic", "2001","silver");
            JsonVehicle car2 = new JsonVehicle("KIA", "Sportage", "2016", "Black");



            JsonVehicle car5 = new JsonVehicle();

            //writes the data into a file
            jsonOut.writeObject(car1);



            //jsonIn.readObject reads data and store it to a hashmap
            HashMap parsedJSONMap = (HashMap) jsonIn.readObject();



            //comapares data
            //JSONbean readObject = new JSONbean(parsedJSONMap);
            //JSONbean readObject2 = new JSONbean(parsedJSONMap);

         //   System.out.println("stream same? "+readObject.equals(car1));

//            System.out.println("stream same? "+readObject2.equals(car2));

            System.out.println(parsedJSONMap.get("model"));

            String jsonString1 = JSONUtilities.stringify(car1);
            System.out.println("JSON: "+jsonString1);
            String jsonString2 = JSONUtilities.stringify(car2);
            System.out.println("JSON: "+jsonString2);
            // String jsonString3 = JSONUtilities.stringify(car3);
            //System.out.println("JSON: "+jsonString3);
            //String jsonString4 = JSONUtilities.stringify(car4);
           // System.out.println("JSON: "+jsonString4);

            parsedJSONMap = (HashMap)JSONUtilities.parse(jsonString2);
            System.out.println(parsedJSONMap);

            //readObject = new JSONbean(parsedJSONMap);
           // System.out.println("stringify same? "+readObject.equals(car2));
            //System.out.println("stream same? "+readObject.equals(car2));


            //NASTY PATHS!!!!!
            //null values can be inputed and outputed


            //JSONbean car5 = new JSONbean(null,"\n",null,null);
            jsonOut.writeObject(car5);

            //write object and pass null
            jsonOut.writeObject(null);
            //does nothing
            String jsonString5 = JSONUtilities.stringify(car5);
            System.out.println("JSON: "+jsonString5);

            String jsonString6 = JSONUtilities.stringify(null);
            System.out.println("JSONnull: "+ jsonString6);

            //pass a string to stringify
            String s1 = JSONUtilities.stringify("hey");
            System.out.println(s1);

            //pass a number to ..
            String s2 = JSONUtilities.stringify(4);
            System.out.println(s2);

            //pass a date
            Date d1 = new Date();
            String s3 = JSONUtilities.stringify(d1);
            System.out.println(s3);

            //System.out.println(parsedJSONMap.toString());

            //can only parse json file

                String parsedString = (String) JSONUtilities.parse("{\"hello\":\"HEY\"}");
                System.out.println(parsedString);

                String parsedString2 = (String) JSONUtilities.parse("hello world");
                System.out.println(parsedString2);






            //pass hello world to parse method


        }catch (Exception e){
            System.out.println("can not write file");
        }

        //if no permission to write can not read the file
        // no read permissions

        try {
            FileOutputStream fileOut2 = new FileOutputStream("locked.txt");
            FileInputStream fileIn2 = new FileInputStream("locked.txt");

            JSONOutputStream jsonOut = new JSONOutputStream(fileOut2);
            JSONInputStream jsonIn = new JSONInputStream(fileIn2);

            //JSONbean c1 = new JSONbean();
            //c1.setColor("orange");
            //c1.setMake("VW");
            //c1.setModel("bug");
            //c1.setYear(2005);

//            jsonOut.writeObject(c1);


        }catch (Exception e){
            System.out.println("can not read locked files");
            System.out.println("can not write locked files");
        }

        //pass null to inputsream
        //pass null output
        try {
//            FileOutputStream fileOut3 = new FileOutputStream(null);
  //          FileInputStream fileIn3 = new FileInputStream(null);

//            JSONOutputStream jsonOut = new JSONOutputStream(fileOut3);
  //          JSONInputStream jsonIn = new JSONInputStream(fileIn3);
        }catch (Exception e){
            System.out.println("can not pass null as input or output stream");
        }






    }

}
//</editor-fold>
//endregion

