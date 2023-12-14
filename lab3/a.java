import java.util.*;
class a{
    public static void main(String args[]){
      Set<Integer> s1=new HashSet<>();
      s1.add(2);
      s1.add(0);
      s1.add(3);
      s1.add(5);
      s1.add(6);

      System.out.println(s1);
      Set<Integer> s=new HashSet<>();
      s.add(1);
      s.add(100);
      s.add(3);
      s.add(4);
      System.out.println(s);
    //   s1.containsAll(s);
      System.out.println( s1.containsAll(s));

     
}

}