package command.simpleremote;

/**
 * @author Tianlong Zhang
 * @time 2018/8/1 22:05
 * @project DesignPattern
 * @Version 1.0.0
 */
public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light){
        this.light = light;
    }

    public void execute(){
        light.on();
    }
}
