import java.util.*;


class account{
    private   double balance=1000.1;
    private String bank_name,branch_name,acct_name,acc_no,acc_address;
     private static Scanner sc=new Scanner(System.in);
   private static Map<String,account> acc=new HashMap<>();
   public String toString(){
    return bank_name+" "+branch_name+" "+acc_no+" "+acct_name+" "+balance;
   }
    account(String bname,String branchN,String accName,String accNum,String accAddress,double b){
      bank_name=bname;branch_name=branchN;
      acct_name=accName;
      acc_no=accNum;
      acc_address=accAddress;
       if(b>1000) balance=b;
       
    }
   
    private static void credit(double a,String account){
        acc.get(account).balance+=a;
    }
    
    private static void debit(double a,String account){
        if(a>acc.get(account).balance)
            System.out.println("Debit amount exceeded account balance");
        else 
         acc.get(account).balance-=a;
     }
   private static  void getBalance(String account){
       System.out.println("account balance is "+acc.get(account).balance);
     }

    private static void exit(){
        System.out.println("exit application : yes/no");
        String s=sc.next();
        if(s.equals("yes")) System.exit(0);
        
     }
    static void setAccounts(){
        acc.put("sbiBsx01",new account("sbi","basar","user1","sbiBsx01","basar",3000));
        acc.put("sbiBsx02",new account("sbi","basar","user2","sbiBsx02","basar",30008));
        acc.put("sbiBsx03",new account("sbi","basar","user3","sbiBsx03","basar",30045));
        acc.put("sbiBsx04",new account("sbi","basar","user4","sbiBsx04","basar",46000));
        acc.put("sbiBsx05",new account("sbi","basar","user5","sbiBsx05","basar",3900));
        acc.put("sbinzb01",new account("sbi","nizamabad","user1","sbinzb01","nizamabad",3000));
        acc.put("sbinzb02",new account("sbi","nizamabad","user2","sbinzb02","nizamabad",30008));
        acc.put("sbinzb03",new account("sbi","nizamabad","user3","sbinzb03","nizamabad",30045));
        acc.put("sbinzb04",new account("sbi","nizamabad","user4","sbinzb04","nizamabad",46000));
        acc.put("sbinzb05",new account("sbi","nizamabad","user5","sbinzb05","nizamabad",3900));
         Set<Map.Entry<String,account>> es=acc.entrySet();
         for(Map.Entry<String,account> it:es) System.out.println(it.getKey()+" "+it.getValue());
     }
   static  void verifyUser(String username,String password){
         if(username.equals("basar") || username.equals("nizamabad")){
           // System.out.println(acc.get(password));
            if(acc.containsKey(password)==false) 
            {
                System.out.println("Incorrect  password");
                return;
            }
            else{
                System.out.println("welcome to sbi portal");
                System.out.println("enter appropriate no. to proceed transcation\n 1 - credit \n 2 - debit \n 3 - balance \n 4 -exit");
               transaction(password);
            }
         } else{
              System.out.println("Incorrect username or password");
                return;
         }
     
        } 
     private static  void transaction(String password){
         while(true){
            int n=sc.nextInt();
            if(n==1){
                System.out.println("enter credit amount");
                double a=sc.nextDouble();
                credit(a,password);
            }
            else if(n==2){
                System.out.println("enter debit amount");
                double a=sc.nextDouble();
                debit(a,password);
            }
            else if(n==3){
                getBalance(password);
            }
            else if(n==4){
                exit();
                break;
            }
            else{
                System.out.println("enter a valid no. to make a transaction");
            }
        }
     }
    
} 


class bankManagement{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    account.setAccounts();
    while(true){
        System.out.println("enter your username ");
        String usr=sc.next();
        System.out.println("enter your password ");
        String pswd=sc.next();
        System.out.println(usr+" "+pswd);
        System.out.println(pswd.equals("sbiBsx01"));
        account.verifyUser(usr,pswd);

    }} }