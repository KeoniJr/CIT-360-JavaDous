package myJSON;

import java.io.Serializable;
import java.util.HashMap;

/**
 * Created by Keoni AledoJr on 9/21/2016.
 */
public class JsonVehicle implements Serializable {

    private String make;
    private String model;
    private String year;
    private String color;

    public JsonVehicle(String make, String model, String year, String color) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public JsonVehicle() {
    }

    public JsonVehicle(HashMap anyMap){
        this.make = (String) anyMap.get("make");
        this.model = (String) anyMap.get("model");
        this.year = (String) anyMap.get("year");
        this.color = (String) anyMap.get("color");
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        JsonVehicle that = (JsonVehicle) o;

        if (make != null ? !make.equals(that.make) : that.make != null) return false;
        if (model != null ? !model.equals(that.model) : that.model != null) return false;
        if (year != null ? !year.equals(that.year) : that.year != null) return false;
        return color != null ? color.equals(that.color) : that.color == null;

    }

    @Override
    public int hashCode() {
        int result = make != null ? make.hashCode() : 0;
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + (year != null ? year.hashCode() : 0);
        result = 31 * result + (color != null ? color.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "JsonVehicle{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year='" + year + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}


