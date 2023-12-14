import java.util.*;

class strings{
    String s1,s2;
    strings(String s1,String s2){
        this.s1=s1;
        this.s2=s2;
    }
    void compare(){
        if(s1.compareTo(s2)>0) System.out.println(s1+" is greater than "+s2);
        else if(s1.compareTo(s2)<0) System.out.println(s1+" is less than "+s2);
        else System.out.println("both are equal");
    }
}
class compare{
    public static void main(String args[]){
    String s1,s2;
    System.out.println("enter two strings");
    Scanner sc=new Scanner(System.in);
    s1=sc.nextLine();
   // sc.nextLine();
    s2=sc.nextLine();
    strings s=new strings(s1,s2);
    s.compare();


}

}