import java.util.*;

class employee{
    private int eid,age;
    private String ename,gender,designation,address;
    private double salary;
    employee(int i,String n,int a,String g,String address,String position,double salary){
        eid=i;
        age=a;
        ename=n;
        gender=g;
        this.address=address;
        this.salary=salary;
        designation=position;
    }
    //it is called when employee object is printed if not overriden default toString method is called
   public String toString(){ //overriding toString() method of object class
    return eid+" "+ename+" "+age+" "+gender+" "+designation+" "+address+" "+salary;
   }
     
   private static Map<Integer ,employee> e=new HashMap<>();
  private static Set<Map.Entry<Integer,employee>> entryset=e.entrySet();
   static void setEmployee(){
       e.put(1,new employee(1,"ram",26,"m","hyd","software engineer",35000));
       e.put(2,new employee(2,"dev",23,"m","kerela","associate engineer",30000));
       e.put(5,new employee(5,"ved",28,"m","karimnagar","ml engineer",45000));
       e.put(100,new employee(100,"yashna",21,"f","banglore","sde",38000));
       e.put(76,new employee(76,"niman",30,"m","delhi","ui/ux",40000));
   }
   static void printall(){
    for(Map.Entry<Integer,employee> it:entryset){
        System.out.println(it.getKey()+" "+it.getValue());
    } }
  static void findDetails(int id){
     if(e.get(id)==null) {
        System.out.println("employee not found");
     }
     else {
        System.out.println(e.get(id));
     }
   }
   }


class employeeDetails{
    public static void main(String args[]){
     employee.setEmployee();
    //  employee.printall();
    System.out.println("enter employee id");
    Scanner sc=new Scanner(System.in);
    int id=sc.nextInt();
    employee.findDetails(id);
}

}