package command.party;

/**
 * @author Tianlong Zhang
 * @time 2018/8/2 8:44
 * @project DesignPattern
 * @Version 1.0.0
 */
public class Light {
    String location = "";
    int level;


    public Light(String location){
        this.location = location;
    }

    public  void on(){
        level = 100;
        System.out.println("Light is on");
    }

    public void off(){
        level = 0;
        System.out.println("Light is off");
    }

    public void dim(int level){
        this.level = level;
        if(level == 0){
            off();
        }else {
            System.out.println("Light is dimmed to " + level + "%");
        }
    }

    public int getLevel() {
        return level;
    }
}
