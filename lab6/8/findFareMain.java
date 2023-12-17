import java.util.*;
import reservation_cost.reservation;
import reservation_cost.Passenger;

class calFare implements reservation{
       double actualCost;
       calFare(double a){
        actualCost=a;
       }

       public double total_fare(Passenger[] passengers){
            double fare=0;
            for(Passenger p:passengers){
                String type=p.getPassengerType().toLowerCase();
                System.out.println(type);
                switch(type){
                    case "children":
                       fare+=0;
                       break;
                    case "student":
                       fare+=actualCost-actualCost*0.3;
                       break;
                    case "senior citizen":
                       fare+=actualCost-actualCost*0.5;
                       break;
                    case "citizen":
                       fare+=actualCost;
                       break;

                }
            }
            return fare;
       }
}

class findFareMain{
   
    public static void main(String args[]){
     Passenger p[]=new Passenger[4];
     p[0]=new Passenger("student");
     p[1]=new Passenger("senior citizen");
     p[2]=new Passenger("citizen");
     p[3]=new Passenger("children");
     calFare c=new calFare(1000);
     System.out.println(c.total_fare(p));
}

}