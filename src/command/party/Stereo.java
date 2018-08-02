package command.party;

/**
 * @author Tianlong Zhang
 * @time 2018/8/2 9:18
 * @project DesignPattern
 * @Version 1.0.0
 */
public class Stereo {
    String location;

    public Stereo(String location){
        this.location = location;
    }

    public void on(){
        System.out.println(location + " stereo is on");
    }

    public void off(){
        System.out.println(location + " stereo is off");
    }

    public void setCD(){
        System.out.println(location + " stereo is for CD input");
    }

    public void setDVD(){
        System.out.println(location + " stereo is for DVD input");
    }

    public void setRadio(){
        System.out.println(location + " stereo is set for Radio");
    }

    public void setVolume(int volume){
        //code to set the volume
        //valid range: 1-11 (after all 11 is better than 10, right)
        System.out.println(location + " stereo is set to " + volume);
    }
}
