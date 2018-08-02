package command.simpleremote;

/**
 * @author Tianlong Zhang
 * @time 2018/8/1 22:09
 * @project DesignPattern
 * @Version 1.0.0
 */
public class GarageDoorOpenCommand implements Command {
    GarageDoor garageDoor;
    public GarageDoorOpenCommand(GarageDoor garageDoor){
        this.garageDoor = garageDoor;
    }

    public void execute(){
        garageDoor.up();
    }
}
