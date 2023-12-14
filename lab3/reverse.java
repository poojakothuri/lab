import java.util.*;

class strings{
    String s1;
    strings(String s1){
        this.s1=s1;
    }
    String find(){
       char [] arr=s1.toCharArray(); //string is immutable and can't be accesed using index
       int n=s1.length();//changing string char array and making changes to it
        for(int i=0;i<s1.length()/2;i++){
          //  if(v.contains(it)) vw++;
         char a=arr[i];
         arr[i]=arr[n-1-i];
         arr[n-i-1]=a;
        }
     return new String(arr );
     // System.out.println(arr);
    }
}
class reverse{
    public static void main(String args[]){
    String s1;
    System.out.println("enter a string");
    Scanner sc=new Scanner(System.in);
    s1=sc.nextLine();
   // sc.nextLine();
  //  s2=sc.nextLine();
    strings s=new strings(s1);
   System.out.println( s.find());


}

}