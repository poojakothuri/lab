import java.util.*;

class tv{
    boolean on;
    int channel,volumeLevel;
    tv(){
        on=false;
        channel=1;
        volumeLevel=3;
    }
    
    void turnOn(){
        on=true;
        System.out.println("tv is on");
    }
    void turnOff(){
        on=false;
        System.out.println("tv is off");
        System.exit(0);
    }
    void setChannel(int newChannel){
        channel=newChannel;
    System.out.println("channel no. "+channel);

    }
    void setVolume(int newVolume){
        volumeLevel=newVolume;
        System.out.println("volume level "+volumeLevel);
    }
    void channelUp(){
        if(channel==40) channel=1;
        else{
            channel+=1;
        }
        System.out.println("channel no. "+channel);
    }
    void channelDown(){
        if(channel==1) channel=40;
        else{
            channel-=1;
        }
        System.out.println("channel no. "+channel);
    }
    void volumeUp(){
        if(volumeLevel==7) System.out.println("Reached max volume");
        else{
            volumeLevel+=1;
        }
        System.out.println("volume  "+volumeLevel);
    }
    void volumeDown(){
        if(volumeLevel==1) System.out.println("Reached min volume");
        else{
            volumeLevel-=1;
        }
        System.out.println("volume  "+volumeLevel);
    }


}
class tvsimulate{
    public static void main(String args[]){
    tv t=new tv();int f=1;
    Scanner sc=new Scanner(System.in);
    System.out.println("1 to turnon \n 2 to turnoff \n 3 to set channel \n 4 to set volume \n  5 to increase volume \n 6 to decrease volume \7 to increase channel \n 8 to decrease channel");
    while(true){
        int n=sc.nextInt();
        if(n!=1 && f==1) System.out.println("turn on tv");
        else if(n==1){ f=0; t.turnOn();}
        else if(n==2) t.turnOff();
        else if(n==3) t.setChannel(39);
        else if(n==4) t.setVolume(4);
        else if(n==5) t.volumeUp();
        else if(n==6) t.volumeDown();
        else if(n==7) t.channelUp();
        else if(n==8) t.channelDown();
    }
  }
}
