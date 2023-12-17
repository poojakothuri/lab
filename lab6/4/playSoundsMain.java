import java.util.*;

import sounds.PodCast;

class playSoundsMain{
    public static void main(String args[]){
     System.out.println("choose 1 to play dolby and 2 to play podcast");
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
   PodCast p=new PodCast();
     if(n==1) p.playDobly();
     else if(n==2) p.playPodcast();
     else System.out.println("enter a valid no.");
}

}