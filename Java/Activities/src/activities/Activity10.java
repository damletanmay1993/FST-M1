package activities;
import java.util.*;

public class Activity10 {

    public static void main(String[] args){
        HashSet<String> set = new HashSet();
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Four");
        set.add("Five");
        set.add("Six");

        System.out.println("Hashset: "+set);
        System.out.println("Size of Hashset is "+set.size());

        set.remove("Six");

        if(set.remove("Zero")){
            System.out.println("Zero removed from Hashset");
        }
        else{
            System.out.println("Zero is not present therefor not removed from Hashset");
        }

        System.out.println("Is Two present in Hashset? "+set.contains("Two"));
        System.out.println("New Hashset "+set);
    }
}
