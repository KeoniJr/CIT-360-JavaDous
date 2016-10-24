package myJSON;

/**
 * Created by Keoni AledoJr on 10/3/2016.
 */
public class Dealer {

    public static void main(String[] args) {

        JsonVehicle car1 = new JsonVehicle("Honda", "Accord", "EX", "Green");


        car1.setMake("Kia");
        System.out.println(car1);
    }
}
