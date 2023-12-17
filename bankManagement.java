import java.util.*;
import bank.functions;

/*2. Case study : Bank management system
Define a package bank.
 Include following functionalities as abstract methods in an interface
abstract XXX credentialsCheck(String Username, String password); 
abstract XXX credit( XXX);
abstract XXX debit( XXX);
abstract XXX displayBalance(XXX);
abstract XXX exit();
Until user selects exit he can perform any of the above operations.
Handle the following exceptions during the transaction
1. Username and password mismatch. // display error message and continue;
2. If debit amount exceeds available balance. // display error message and
continue;
*/

//methods must be public in the class which implements interface

class users{
      String username,password;
     double amount;
    users(String user,String pwd,double a){
        username=user;
        password=pwd;
        amount=a;
    }
   
}

class check implements functions{
     ArrayList<users> a;
     users person;
     check(ArrayList<users> a1){
        this.a=a1;
     }
   public String credentialsCheck(String username,String password) throws Exception{
     for(users it: a){
        if(it.username.equals(username) && it.password.equals(password)){
           person=it;
           return "valid user";
        }
     }
     throw new Exception("incorrect username or password");
   }


   public String credit(double amount)throws Exception{
     if(amount<0) throw new Exception("enter valid amount to credit");
     person.amount=person.amount+amount;
     return "amount credited.";
     }

   public String debit(double amount)throws Exception{
    if(amount<0) throw new Exception("enter valid amount to debit");
    if(amount>person.amount) throw new Exception("insufficient balance,try again with different amount");
     person.amount=person.amount-amount;
     return "amount debited.";
     }
   public double displayBalance(){ 
    return person.amount;
   }
   
   public String exit(){return "Thank you";}
}
class bankManagement{
    public static void main(String args[]){
        // System.out.println("set");
          ArrayList<users> a=new ArrayList<users>();
        a.add(new users("ram1234","ramu@23",23453.67));
        a.add(new users("dev897","dev23!0",7869.7));
        a.add(new users("yuv@2023","yv@132",8796.9));
        a.add(new users("ved5*","vd456&",93453.67));
        a.add(new users("gyan333","gyn@324",89790.67));
    check c=new check(a);
   Scanner sc=new Scanner(System.in);  int f=0;
    while(true){
    System.out.println("\nchoose a number to use the functionalities\n 0 - credential check \n 1 - credit \n 2 - debit \n 3 - balance \n 4 - exit");
    int n=sc.nextInt();
  
    if(n==4) {
       System.out.println(c.exit());
        break;
    }
    if(n==0){ f=1;
     System.out.println("enter your username\n");
     String user=sc.next();
     System.out.println("enter your password\n");
     String pswd=sc.next();
         try{
   System.out.println( c.credentialsCheck(user,pswd));
    
    }
    catch(Exception e){
        System.out.println(e.getMessage());
    }
  }
  else if(n==1){
    if(f==0) System.out.println("validate your credentials to credit , press 0 for validation");
    else{ try{
        System.out.println("enter amount to credit");
        double amount=sc.nextDouble();
   System.out.println( c.credit(amount));
    
    }
    catch(Exception e){
        System.out.println(e.getMessage());
    } }
  }
   else if(n==2){
    if(f==0) System.out.println("validate your credentials to debit , press 0 for validation");
     else{ try{
       System.out.println("enter amount to debit");
        double amount=sc.nextDouble();
   System.out.println( c.debit(amount));
    
    }
    catch(Exception e){
        System.out.println(e.getMessage());
    } }
  }
   else if(n==3){
    if(f==0) System.out.println("validate your credentials to credit , press 0 for validation");
   else{  try{
   System.out.println( c.displayBalance());
    
    }
    catch(Exception e){
        System.out.println(e.getMessage());
    }
  } }

  }
  

} }