import java.util.*;

class strings{
    String s1,s2;
    strings(String s1,String s2){
        this.s1=s1;
        this.s2=s2;
    }
    String join(){
        System.out.println(s1.hashCode());
        s1=s1.concat(s2);
        System.out.println(s1.hashCode());
       // System.out.println(s1);
        return s1;
    }
}
class concat{
    public static void main(String args[]){
    String s1,s2;
    System.out.println("enter two strings");
    Scanner sc=new Scanner(System.in);
    s1=sc.nextLine();
   // sc.nextLine();
  s2=sc.nextLine();
    strings s=new strings(s1,s2);
    System.out.println(s.join());
  


}

}