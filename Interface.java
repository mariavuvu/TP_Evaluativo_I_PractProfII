public interface Player
{
    
    public void open(String filePath);
    public void play();
    public void stop();
    public void setVolume(float value);
};
//PlayerPitchable Interface:
public interface PlayerPitchable
{
public void setPitch(float value);
};

//VLC concrete class
public class VLC  implements Player , PlayerPitchable
{
    protected Boolean isOpen = false;
    protected Boolean isPlaying = false;
    protected float volume;
    protected float pitch;

    public VLC()
    {
        System.out.println("The VLC constructor was invoked.");
    }

    @Override
    public void open(String filePath)
    {
        //@ToDo: por ahora simulamos la apertura correcta
        this.isOpen = true;
        System.out.println("The audiofile: " + filePath + " is open.");
    }
    @Override
    public void play()
    {
        //@ToDo: por ahora simulamos la reproducción correcta
        if(this.isOpen) 
            this.isPlaying = true;
            System.out.println("The audiofile is playing.");
    }
    @Override
    public void stop()
    {
        //@ToDo: por ahora simulamos la detención correcta
        if(this.isPlaying) 
            this.isPlaying = false;
            System.out.println("The audiofile is stopped.");
    }
    @Override
    public void setVolume(float value)
    {
        this.volume = value;
        System.out.println("The volume value is: " + this.volume);
    }
    @Override
    public void setPitch(float value)
    {
        this.pitch = value;
        System.out.println("The pitch value is: " + this.pitch);
    }

}

public static void main(String[] args)
{
    System.out.println("--------");
    VLC vlcPlayer = new VLC();
    vlcPlayer.open("./resources/orchestral.ogg");
    vlcPlayer.play();
    vlcPlayer.setVolume(13);
    System.out.println("--------");
}
