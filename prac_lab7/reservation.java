import java.util.*;
class agentException extends Exception{
    public agentException(String msg){//constructor
        super(msg);
    }
}
class train{
    private int capacity=70;
    List<String> sleeper1=new ArrayList<>();
    List<String> sleeper2=new ArrayList<>();
    List<String> ac1=new ArrayList<>();
    List<String> ac2=new ArrayList<>();
    train(){
       setCoaches();
    }
    void setCoaches(){
        sleeper1=generateBerths("s1-",capacity);
        sleeper1=generateBerths("s2-",capacity);
        ac1=generateBerths("ac1-",capacity);
        ac2=generateBerths("ac2-",capacity);
    }

    List<String> generateBerths(String prefix,int capacity){
        List<String> berth=new ArrayList<>();
        for(int i=1;i<=capacity;i++){
           berth.add(prefix+i);
        }
        return berth;
    } 
    
    List<String> bookTickets(int num,String coach) throws agentException{
        if(num>6) throw new agentException("You may be an Agent");
        if(coach.toLowerCase().equals("a/c")==false && coach.toLowerCase().equals("sleeper")==false) throw new agentException("You may be an Agent");
        List<String> selectedBerth=new ArrayList<>();
        if(coach.toLowerCase().equals("sleeper")){
            selectedBerth=allocateSleeper(num);
        }
        if(coach.toLowerCase().equals("a/c")){
            selectedBerth=allocateAc(num);
        }

        return selectedBerth;
    }

    List<String> allocateSleeper(int num){
        List<String> berth=new ArrayList<>(sleeper1);
        berth.addAll(sleeper2);//System.out.println(berth);
        Collections.shuffle(berth);
        return berth.subList(0,num);
    }
    List<String> allocateAc(int num){
        List<String> berth=new ArrayList<>(ac1);
        berth.addAll(ac2);//System.out.println(berth);
        Collections.shuffle(berth);
        return berth.subList(0,num);
    }
           
    }


class reservation{
    public static void main(String args[]){
     train t=new train();
     try{
  System.out.println(t.bookTickets(6, "sleeper"));  
   System.out.println(t.bookTickets(4, "a/c"));  
   System.out.println(t.bookTickets(9, "ac"));  
     }catch(agentException e){
        System.out.println(e.getMessage());
     }
}

}