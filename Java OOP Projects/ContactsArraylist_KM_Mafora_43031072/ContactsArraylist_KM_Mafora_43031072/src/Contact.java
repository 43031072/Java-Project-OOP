//KM Mafora
//43031072
//Practical 6
import java.util.*;
import java.io.*;
public class Contact {

    private String personName;
    private String numbers;

    public Contact() {

    }
    public Contact(String name, String numb){
        System.out.println("Beginning");
    }
    //Accessors and mutators
    //for personName data fields
    public void setName(String theName){
        personName = theName;
    }
    public String getName(){
        return personName;
    }
    //for numbers data fiels
    public void setNumbers(String theNumber){
        numbers = theNumber;
    }
    public String getNumber(){
        return numbers;
    }
    //formatting
    public String toString(String Name, String Numbers){
        String tempVar = String.format(" %s\t\t\t%s", Name, Numbers);
        return tempVar;
    }
}