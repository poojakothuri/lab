package TV_Remote;
interface remote {
    void switchOn();
    void switchOff();
    void starSportsChannel();
    void NGCchannel();
    void DiscoveryChannel();
    void starMoviesChannel();
}

public class tv implements remote{
    public boolean on;
   public tv(){
        on=false;
    }

    public void switchOn(){
        on=true;
        System.out.println("Welcome to TATA SKY");
    }
    public void switchOff(){
        on=false;

        System.exit(0);
    }
    public void starSportsChannel(){
        System.out.println("welcome star sports Channel");
    }
    public void NGCchannel(){
        System.out.println("welcome NGC Channel");
    }
    public void DiscoveryChannel(){
        System.out.println("welcome discovery Channel");
    }
    public void starMoviesChannel(){
        System.out.println("welcome star movies Channel");
    }

}