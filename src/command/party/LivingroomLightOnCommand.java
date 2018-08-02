package command.party;

/**
 * @author Tianlong Zhang
 * @time 2018/8/2 9:12
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

    public void undo(){
        light.off();
    }
}
