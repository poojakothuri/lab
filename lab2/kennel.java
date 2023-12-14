 import java.util.*;

class dog{
    private String name,breed,color,type;
    double height;
    dog(String name,String breed,String color,String type,double height){
       this.name=name;
       this.breed=breed;
       this.color=color;
       this.type=type;
       this.height=height;
    }
    String getName(){
        return name;
    }
    String getbreed(){
        return breed;
    }
    String getType(){
        return type;
    }
    String getColor(){
        return color;
    }
    double  getHeight(){
        return height;
    }
    
    static dog suggestDog(String breed,String color,double height,dog...d){
         for(dog a:d){
            if(breed.equals(a.breed) && color.equals(a.color) && height>=a.height)
              return a;
         }
         return null;
    }
     
}
//mileage=dist per lit
//fuel= dis/mileage

class kennel{
    public static void main(String args[]){
     dog snoopy=new dog("snoopy","pomerian","white","gaurd",1);
     dog rocky=new dog("rocky","lab","brown","sniffer",3);
     dog snowy=new dog("snowy","g.shepered","black","sheperd",4);
     System.out.println("enter the preferred breed");
     Scanner sc=new Scanner(System.in);
     String breed=sc.next();
    System.out.println("enter the preferred color");
     String color=sc.next();
     System.out.println("enter the height"); 
     double height=sc.nextDouble();
     dog suggestedDog=dog.suggestDog(breed,color,height,snoopy,rocky,snowy);
     if(suggestedDog!=null) 
      System.out.println("your preferred dog is "+suggestedDog.getName());
      else
        System.out.println("match not found");
  }
}