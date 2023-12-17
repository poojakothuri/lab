package sounds;

 interface dolby{
    void playDobly();
}

public class PodCast implements dolby{
    public void playDobly(){
        System.out.println("playing Dobly sound");
    }
    public void playPodcast(){
        System.out.println("playing Podcast sound");
    }
}