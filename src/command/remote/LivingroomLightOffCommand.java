package command.remote;

/**
 * @author Tianlong Zhang
 * @time 2018/8/1 22:25
 * @project DesignPattern
 * @Version 1.0.0
 */
public class LivingroomLightOffCommand implements Command {
    Light light;

    public  LivingroomLightOffCommand(Light light){
        this.light = light;
    }

    public void execute(){
        light.off();
    }
}
