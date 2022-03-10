package activities;
import java.util.*;

public class Activity9 {

    public static void main(String[] args){
        ArrayList<String> myList = new ArrayList<String>();

        myList.add("Tanmay");
        myList.add("Mahaveer");
        myList.add("Archana");
        myList.add("Satya");
        myList.add("Lavanya");

        System.out.println("Print all objects:");
        for(String s:myList){
            System.out.println(s);
        }

        System.out.println("Third element in the list is "+myList.get(2));
        System.out.println("Is Mike present in the list? "+myList.contains("Mike"));
        System.out.println("Size of the Array List is "+myList.size());

        myList.remove("Tanmay");
        System.out.println("New size of the Array List is "+myList.size());



    }
}
