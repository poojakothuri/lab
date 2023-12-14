import java.util.*;
abstract class monster{
    String name;
    monster(){
        name="fato";
    }
    abstract String attack();
}

class fireMonster extends monster{
    String name="fireMonster";
   String attack(){return "you are attacked by "+ name ;};
   void my(){ System.out.println("mine");}
}
class waterMonster extends monster{
    String name="waterMonster";
   String attack(){return "you are attacked by "+ name ;};
}
class stoneMonster extends monster{
    String name="stoneMonster";
   String attack(){return "you are attacked by "+ name ;};
}
class game{
    public static void main(String args[]){
     monster m=new fireMonster();
     monster m1=new stoneMonster();
     monster m2=new waterMonster();
     fireMonster f=new fireMonster();
    System.out.println(m.name);
    System.out.println(f.name);
    System.out.println(m.attack());
    f.my();
    System.out.println(m1.attack());
    System.out.println(m2.attack());
}

}