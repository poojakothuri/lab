// import java.util.*;

class lamp{
    boolean isOn;
    String lampType;
    lamp(boolean on,String type){
        this.isOn=on;
        lampType=type;
    }
    String turnOn(){
        isOn=true;
        return "light is on";
    }

    String turnOff(){
        isOn=false;
        return "light is off";
    }
}
class light{
    public static void main(String args[]){
    lamp l1=new lamp(false,"led");
    System.out.println(l1.turnOn());
    System.out.println(l1.turnOff());
    lamp l2=new lamp(true,"halogen");
    System.out.println(l2.turnOn());
    System.out.println(l2.turnOff());
  }
}