import java.util.*;
import TV_Remote.tv;
class tvSimulateMain{
    public static void main(String args[]){
    tv t=new tv();
    boolean b=t.on;
    while(true){
        b=t.on;
        System.out.println("choose a no. to operate tv\n1- on\n2- star sports channel\n3- NGC channel\n4- discovery channel\n5- star movies channel\n6- off");
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(n==1){
            if(b==true) System.out.println("tv is already in on state");
            else { t.switchOn();}

        }
        else if(n==2 && b==true){
          t.starSportsChannel();
        }
        else if(n==3 && b==true){
          t.NGCchannel();
        }
        else if(n==4 && b==true){
          t.DiscoveryChannel();
        }
        else if(n==5 && b==true){
          t.starMoviesChannel();
        }
        else if(n==6 ){
          t.switchOff();
        }
        else if(b==false) System.out.println("turn on the tv");
        else {
            System.out.println("choose a valid number");
        }
    }
}

}