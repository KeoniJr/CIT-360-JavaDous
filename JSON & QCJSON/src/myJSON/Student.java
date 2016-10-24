package myJSON;

import java.io.Serializable;
import java.util.HashMap;

/**
 * Created by Keoni AledoJr on 10/3/2016.
 */
public class Student implements Serializable {

    String gender;
    String email;
    String year;
    Integer id;
    String name;

// This is an open constructor it is needed to create and instance of the object without giving it any parameters

    public Student() {
    }

    // This is a contructor with parameters

    public Student(String gender, String email, String year, Integer id, String name) {
        this.gender = gender;
        this.email = email;
        this.year = year;
        this.id = id;
        this.name = name;
    }


    // This is another contstructor that is creating and storing the parameters in a Hashmap
    // the (String) is taking in the data it gets and converts it into a string, to ensure the data is a string
    // is creating a key called "gender" and then setting it equal to the passed in parameter
    public Student(HashMap StudentHashMap){
        this.gender = (String) StudentHashMap.get("gender");
        this.email = (String) StudentHashMap.get("email");
        this.year = (String) StudentHashMap.get("year");
       // Long asLong = (Long)StudentHashMap.get("id");
        //this.id =  asLong.intValue();
        this.id = (Integer) StudentHashMap.get("id");
        this.name = (String) StudentHashMap.get("name");
    }


    // This is where we create our getters and setters so we can READ and WRITE the data to manipulate it.

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (gender != null ? !gender.equals(student.gender) : student.gender != null) return false;
        if (email != null ? !email.equals(student.email) : student.email != null) return false;
        if (year != null ? !year.equals(student.year) : student.year != null) return false;
        if (id != null ? !id.equals(student.id) : student.id != null) return false;
        return name != null ? name.equals(student.name) : student.name == null;

    }

    @Override
    public int hashCode() {
        int result = gender != null ? gender.hashCode() : 0;
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (year != null ? year.hashCode() : 0);
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }


    // This allows us to display the information of the object into a string

    @Override
    public String toString() {
        return "Student{" +
                "gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                ", year='" + year + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
