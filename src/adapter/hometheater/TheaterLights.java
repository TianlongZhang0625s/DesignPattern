package adapter.hometheater;

/**
 * @author Tianlong Zhang
 * @time 2018/8/2 22:24
 * @project DesignPattern
 * @Version 1.0.0
 */
public class TheaterLights {
    String description;

    public TheaterLights(String description){
        this.description = description;
    }

    public void on(){
        System.out.println(description + " on");
    }

    public void off(){
        System.out.println(description + " off");
    }

    public void dim(int level){
        System.out.println(description + " dimming to " + level + "%");
    }

    public String toString(){
        return description;
    }
}
