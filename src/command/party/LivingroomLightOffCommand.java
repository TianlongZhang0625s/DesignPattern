package command.party;

/**
 * @author Tianlong Zhang
 * @time 2018/8/2 9:11
 * @project DesignPattern
 * @Version 1.0.0
 */
public class LivingroomLightOffCommand implements  Command {
    Light light;

    public LivingroomLightOffCommand(Light light){
        this.light = light;
    }

    public void execute(){
        light.off();
    }

    public void undo(){
        light.off();
    }
}
