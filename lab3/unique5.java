import java.util.*;

class numbers{
   Random r=new Random();
   private List<Integer>  l=new ArrayList<>();
   numbers(){
    enterEle();
   }
   private void enterEle(){
      while(l.size()<5){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
      //  int n=r.nextInt(100)+1;//0 to 99
      //  System.out.println(n);
        if(l.contains(n)==false) {
            l.add(n);
            System.out.println(l);
        }
      }
   }
}
class unique5{
    public static void main(String args[]){
    numbers a=new numbers();
}

}