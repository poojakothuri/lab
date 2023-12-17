package admission;
import java.util.*;
interface subjects{
    double getMathsMarks();
    double getPhysicsMarks();
    double getChemistryMarks();
    double getEnglishMarks();
    double percentage();

}

public class marks implements subjects{
     double maths,physics,english,chemistry;
     Scanner sc=new Scanner(System.in);
    public double getMathsMarks(){
     System.out.println("enter your math marks");
       double a=sc.nextDouble();
       maths=a;
       return maths;
    }
    public double getPhysicsMarks(){
        System.out.println("enter your physics marks");
          double a=sc.nextDouble();
         physics=a;
       return physics;
    }
    public double getEnglishMarks(){
        System.out.println("enter your english marks");
          double a=sc.nextDouble();
         english=a;
       return english;
    }
    public double getChemistryMarks(){  
        System.out.println("enter your chemistyr marks");
        double a=sc.nextDouble();
         chemistry=a;
       return  chemistry;

    }
    public double percentage(){
         double total=maths+physics+english+chemistry;
         total=(total)/4.0;
         return total;
    }
    public void eligible(){
        if(maths>=90 && physics>=95 && chemistry>=70 && english>=80 && percentage()>=80)
           System.out.println("You are eligible for admission");
       else  System.out.println("You are not eligible for admission");
    }
}