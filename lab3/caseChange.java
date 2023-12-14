import java.util.*;

class strings{
    String s1;
    strings(String s1){
        this.s1=s1;
    }
    void change(){
      System.out.println("initial string "+s1);
       String s2=s1.toLowerCase();
       System.out.println(s1+" "+s2);
    }
}
class caseChange{
    public static void main(String args[]){
    String s1;
    System.out.println("enter a string");
    Scanner sc=new Scanner(System.in);
    s1=sc.nextLine();
   
    strings s=new strings(s1);
    s.change();


}

}