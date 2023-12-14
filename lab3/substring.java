import java.util.*;

class strings{
    String s1,s2;
    strings(String s1,String s2){
        this.s1=s1;
        this.s2=s2;
    }
    void find(){
        System.out.println("substring using substring method ");
        int ind=s1.indexOf(s2);
        if(ind==-1) System.out.println("substring not found using substring method");
        else
         System.out.println(s1.substring(ind,ind+s2.length()));
      System.out.println("substring using starts with ends with");
      boolean start=s1.startsWith(s2); //true if s1 starts with s2
         if(start) System.out.println("stirng starts with "+s2);
         boolean ends=s1.endsWith(s2);
         if(ends)
      System.out.println("stirng ends with "+s2);
    }
}
class substring{
    public static void main(String args[]){
    String s1;
    String s2;
    System.out.println("enter a string");
    Scanner sc=new Scanner(System.in);
    s1=sc.nextLine();
   // sc.nextLine();
   s2=sc.nextLine();
    strings s=new strings(s1,s2);
    s.find();


}

}