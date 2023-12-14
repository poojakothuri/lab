//  import java.util.*;

class car{
     double speed,mileage;
     String color,company;
     car(String comp,double s,double m,String c){
      speed=s;
      mileage=m;
      color=c;
      company=comp;
     }

    
}
//mileage=dist per lit
//fuel= dis/mileage
class suggestor{
    car c[];
    suggestor(car c1[]){
      c=c1;
    }
    double dist;
    void FindBestOne(double d){
        dist=d;double minFuel=Integer.MAX_VALUE;String comp="";double time=Integer.MAX_VALUE;
        for(int i=0;i<c.length;i++){
          double m=c[i].mileage;
          double s=c[i].speed;
          double fuel=d/m;
          if(minFuel>fuel){
            minFuel=fuel;
            comp=c[i].company;
            time=dist/s;
          }
          else if(minFuel==fuel){
            double t=dist/s;  
            if(t<time){
              minFuel=fuel;
              comp=c[i].company;
              time=t;
            }
          }
          // System.out.println(minFuel+" "+fuel+" "+time);
          
        }
     System.out.println(comp+" is best for your journey");
    }
}
class journey{
    public static void main(String args[]){
     car c[]=new car[3];
    c[0]=new car("ford",60,60,"black");
      c[1]=new car("toyota",45,50,"white");
      c[2]=new car("volkswagan",70,60,"red");
      suggestor s=new suggestor(c);
      s.FindBestOne(150);
  }
}