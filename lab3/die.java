import java.util.*;

class rolling{
   Random d1=new Random();
   Random d2=new Random();
   int n=10,c=0;
   rolling(){
    attempt();
   }
   void attempt(){
     try{
    while(n>0){
       
        int a=d1.nextInt(6)+1;
        int b=d1.nextInt(6)+1;
        System.out.println(a+" "+b);
        if(a==b) {
            c++;
        }
       n--;
       Thread.sleep(1000);
    }
    System.out.println("no. of successful attempts "+c);
   }   catch(Exception e){
        System.out.println(e);
        }
   
} }
class die{
    public static void main(String args[]){
    rolling r=new rolling();
}

}