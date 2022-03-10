package activities;
import java.util.*;

public class Activity11 {

    public static void main(String[] args){

        HashMap<Integer,String> hm = new HashMap<Integer,String>();

        hm.put(1,"Violet");
        hm.put(2,"Indigo");
        hm.put(3,"Blue");
        hm.put(4,"Green");
        hm.put(5,"Orange");

        System.out.println("Original map: "+hm);
        hm.remove(3);
        System.out.println("New map after removing Blue: "+hm);

        if (hm.containsValue("Green")){
            System.out.println("Green is present in the Map");
        }
        else{
            System.out.println("Green is not present in the Map");
        }

        System.out.println("Size of the Map: "+hm.size());

    }
}
