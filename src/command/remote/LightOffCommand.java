package command.remote;

/**
 * @author Tianlong Zhang
 * @time 2018/8/1 22:21
 * @project DesignPattern
 * @Version 1.0.0
 */
public class LightOffCommand implements Command {
    Light light;
    public LightOffCommand(Light light){
        this.light = light;
    }

    public void execute(){
        light.off();
    }
}
