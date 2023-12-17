/*
3.Case study : Tax fraud detection
Define package audit.
Include following functionalities as abstract methods in an interface.
abstract XXX taxChecker (XXX);
abstract XXX taxPaid(XXX);
abstract XXX homeExpenditure(XXX);
abstract XXX healthExpenditure(XXX);
abstract XXX vehicleExpenditure(XXX);
abstract XXX personalFamilyExpenditure(XXX);
abstract XXX miscellaneousExpenditure(XXX);
Inputs : all the above expenditures, TotalIncome and Taxpaid
He/She has to pay 10% of ( TotalIncome- (all other expenditures)) on mismatch
throw an exception as fraud and display message, how much he/she has to pay
*/
import java.util.*;
import audit.auditFunctions;


class functions implements auditFunctions{
   private  double totalExpenditure=0;
   private double totalIncome,taxpaid;
    functions(double income){
        totalIncome=income;
    }
 public void  expenditureCal(double expo){
        totalExpenditure+=expo;
    }
public  void taxPaid(double tax){
      taxpaid=tax;
 }
 public void homeExpenditure(double homeExp){
      expenditureCal(homeExp);
 }
public  void healthExpenditure(double healthExp){
     expenditureCal(healthExp);
 }
public  void vehicleExpenditure(double vehicleExp){
   expenditureCal(vehicleExp);
 }
public void personalFamilyExpenditure(double personalExp){
     expenditureCal(personalExp);
}
 public void miscellaneousExpenditure(double otherExp){
      expenditureCal(otherExp);
 }
    public  String taxChecker () throws Exception{
          double exp=totalIncome-totalExpenditure;
          double tax=exp*0.1;
          if(tax!=taxpaid){
            throw new Exception("tax fraud detected ! you have to pay Rs "+tax );
          }
          return "your tax is accurate";
     }
}
class fraudAudit{
    public static void main(String args[]){
     functions f=new functions(100000);
      
    f. taxPaid(7700 ); 
    f. homeExpenditure(8000);
    f. healthExpenditure(5000);
    f. vehicleExpenditure(2000);
    f.personalFamilyExpenditure(3000);
    f. miscellaneousExpenditure(5000);
     try{
       System.out.println(f.taxChecker());
     } catch(Exception e){
        System.out.println(e.getMessage());
     }
    }
}