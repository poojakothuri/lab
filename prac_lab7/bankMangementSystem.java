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

class user{
     double amount;
     String  usrname,pswd;
   user(String usr,String p,double a){
     usrname=usr;
     pswd=p;
     amount =a;
   }
  
    static Map<String,user> acc=new HashMap<>();//pswd,account
    public String toString(){ return usrname+" "+" "+pswd+" "+amount;}
    static void setUsers(){
        acc.put("ramu1234",new user("ramu1234","ramu@23",23453.67));
        acc.put("dev897",new user("dev897","dev23!0",7869.7));
        acc.put("yuv@2023",new user("yuv@2023","yv@132",8796.9));
        acc.put("ved5*",new user("ved5*","vd456&",93453.67));
        acc.put("gyan333",new user("gyan333","gyn@324",89790.67));
       

}}
class account implements functions {
     Map<String,user> acc;
     String usr;
     account(){
        user.setUsers();
        acc=new HashMap<>(user.acc);
        System.out.println(acc);
        } 

        public String credentialCheck(String usr,String pswd) throws Exception{
            
            if(acc.get(usr)==null){
                throw new Exception("invalid username");
            }
            else if(acc.get(usr).pswd.equals(pswd)==false)  throw new Exception("invalid password");
            else {
                this.usr=usr;
               return  "welcome";
            }
    }
     public String credit(double a) throws Exception{
       if(a<0) throw new Exception("negative amount cant be credited");
       acc.get(usr).amount+=a;
       return a+" credited to account";

    }
     public String debit(double a) throws Exception{
        if(a>acc.get(usr).amount) throw new Exception("debit amount exceeds account balance");
       acc.get(usr).amount-=a;
       return a+" debited from account";
    }
    public String displayBalance(){
        return "account balance "+acc.get(usr).amount;
    }
     public void  exit() {
       System.exit(0);
    }

}
class bankMangementSystem{
    public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     int f=0;
     //user.setUsers();
     //System.out.println(user.acc);
     account acc=new account();
     String usr,pwd;
     while(true){
         System.out.println("choose a number to proceed transtition\n0- credential check\n1- credit \n2- debit\n3- displaybalance\n4- exit");
         int n;n=sc.nextInt();
         if(n==0){
             f=1;
             System.out.println("enter your username");
             usr=sc.next();
             System.out.println("enter your password");
             pwd=sc.next();
             try{ 
             System.out.println(acc.credentialCheck(usr, pwd));
               
          }
          catch(Exception e){f=0;
            System.out.println(e.getMessage());
          }
         }
          if(n==1 ) {
            if(f==0){
                System.out.println("validate your credentials to credit , press 0 for validation");
            }else{
                System.out.println("enter amount to credit");
                double a;a=sc.nextDouble();
          try{
               System.out.println(acc.credit(a));
               
          }
          catch(Exception e){
            System.out.println(e.getMessage());
          } }
         } 
          if(n==2 ) {
            if(f==0){
                System.out.println("validate your credentials to debit , press 0 for validation");
            }else{
                System.out.println("enter amount to debit");
                double a;a=sc.nextDouble();
          try{
              System.out.println(acc.debit(a));
          }
          catch(Exception e){
            System.out.println(e.getMessage());
          } }
         } 
          if(n==3 ) {
            if(f==0){
                System.out.println("validate your credentials to check balance , press 0 for validation");
            }else{
                  System.out.println(acc.displayBalance());
               }
         } 
          if(n==4 ) {
           acc.exit();
         } 

}}}