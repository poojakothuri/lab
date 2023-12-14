import java.util.*;

class strings{
    String s1;
    private ArrayList<Character> v=new ArrayList<>();
    strings(String s1){
        this.s1=s1;
        v.add('a');
        v.add('e');
        v.add('i');
        v.add('o');
        v.add('u');
    }
    void count(){
        int vw=0,c=0;
      //  for(char it:s1.toCharArray()){
        for(int i=0;i<s1.length();i++){
          //  if(v.contains(it)) vw++;
          if(v.contains(Character.toLowerCase(s1.charAt(i)))) vw++;
            else
             c++;
        }
       System.out.println(c+"  "+vw);
    }
}
class frequency{
    public static void main(String args[]){
    String s1;
    System.out.println("enter a string");
    Scanner sc=new Scanner(System.in);
    s1=sc.nextLine();
   // sc.nextLine();
  //  s2=sc.nextLine();
    strings s=new strings(s1);
    s.count();


}

}