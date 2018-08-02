package command.remote;

/**
 * @author Tianlong Zhang
 * @time 2018/8/1 22:19
 * @project DesignPattern
 * @Version 1.0.0
 */
public class Light {
    String location = "";

    public Light (String location){
        this.location = location;
    }

    public void on(){
        System.out.println(location + " light is on !");
    }

    public void off(){
        System.out.println(location + " light is off !");
    }
}
