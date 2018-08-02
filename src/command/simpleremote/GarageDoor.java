package command.simpleremote;

/**
 * @author Tianlong Zhang
 * @time 2018/8/1 22:06
 * @project DesignPattern
 * @Version 1.0.0
 */
public class GarageDoor {
    public GarageDoor(){

    }

    public void up(){
        System.out.println("Garage Door is Open !");
    }

    public void down(){
        System.out.println("Garage Door is Closed !");
    }

    public void stop(){
        System.out.println("Garage Door is stopped !");
    }

    public void lightOn(){
        System.out.println("Garage light is on !");
    }

    public void lightOff(){
        System.out.println("Garage light is off !");
    }

}
