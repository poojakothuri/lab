import java.util.*;

class strings{
    String s1,s2;
    strings(String s1,String s2){
        this.s1=s1;
        this.s2=s2;
    }
    void compare(){
        if(s1.equals(s2)) System.out.println(s1+" same as "+s2);
        else System.out.println("both are not equal");
        System.out.println(s1.equals(s2));
        //  System.out.println(s1==s2);
        // System.out.println(s1.hashCode()+" "+s2.hashCode());
        System.out.println(s1.equalsIgnoreCase(s2));
    }
}
class equal{
    public static void main(String args[]){
    String s1="hello how ru",s2="Hello how ru";
    // String s3=new String("hello how r u");
    // String s4=new String("hello how r u");
    //System.out.println("enter two strings");
//     Scanner sc=new Scanner(System.in);
//   String s5=sc.nextLine();
   
//    String s6 =sc.nextLine();
//     System.out.println(s1==s2);
//     System.out.println(s1.hashCode()+" "+s2.hashCode()+" "+s3.hashCode());
    strings s=new strings(s1,s2);
    s.compare();
//      strings ss=new strings(s3,s4);
//    ss.compare();
//    strings ss2=new strings(s5,s6);
//    ss2.compare();
}

}