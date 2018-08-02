package command.remote;

/**
 * @author Tianlong Zhang
 * @time 2018/8/1 22:24
 * @project DesignPattern
 * @Version 1.0.0
 */
public class LivingroomLightOnCommand implements Command {
    Light light;

    public LivingroomLightOnCommand(Light light){
        this.light = light;
    }

    public void execute(){
        light.on();
    }
}
