package command.party;

/**
 * @author Tianlong Zhang
 * @time 2018/8/2 9:35
 * @project DesignPattern
 * @Version 1.0.0
 */
public class TV {
    String location;
    int channel;

    public TV(String location){
        this.location = location;
    }

    public void on(){
        System.out.println(location + " TV is on");
    }

    public void off() {
        System.out.println(location + " TV is off");
    }

    public void setInputChannel(){
        this.channel = 3;
        System.out.println(location + " TV channel is set for DVD");
    }
}
