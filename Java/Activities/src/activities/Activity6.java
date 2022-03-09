package activities;
import java.util.*;

class Plane{
    private List<String> passengers;
    private int maxPassengers;
    private Date lastTimeTookOf;
    private Date lastTimeLanded;

    public Plane(int maxPassengers){

        this.maxPassengers = maxPassengers;
        this.passengers = new ArrayList<>();
    }

    public void onboard(String passenger){

        this.passengers.add(passenger);
    }

    public Date takeOff(){

        this.lastTimeTookOf = new Date();
        return lastTimeTookOf;
    }

    public void land(){

        this.lastTimeLanded = new Date();
        this.passengers.clear();
    }

    public Date getLastTimeLanded(){
        return lastTimeLanded;
    }

    public List<String> getPassengers(){
        return passengers;
    }
}

public class Activity6 {

    public static void main (String[] args){

        Plane plane = new Plane(10);
        plane.onboard("Archana");
        plane.onboard("Tanmay");
        plane.onboard("Mahaveer");

        System.out.println("Plane took off at: "+plane.takeOff());
        System.out.println("People on the plane "+plane.getPassengers());

        try
        {
            Thread.sleep(2000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }

        plane.land();
        System.out.println("Plane landed at: "+plane.getLastTimeLanded());
        System.out.println("People on plane after landing: "+plane.getPassengers());
    }
}
