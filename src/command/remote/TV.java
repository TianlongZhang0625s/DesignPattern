package command.remote;

/**
 * @author Tianlong Zhang
 * @time 2018/8/1 23:26
 * @project DesignPattern
 * @Version 1.0.0
 */
public class TV {
    String location;
    int channel;

    public TV(String location){
        this.location = location;
    }
    public void on() {
        System.out.println("TV is on !");
    }

    public void off() {
        System.out.println("TV is off !");
    }

    public void setInputChannel() {
        this.channel = 3;
        System.out.println("Channel is set for VCR !");
    }

}
