package command.remote;

/**
 * @author Tianlong Zhang
 * @time 2018/8/1 23:06
 * @project DesignPattern
 * @Version 1.0.0
 */
public class GarageDoorDownCommand implements Command {
    GarageDoor garageDoor;

    public GarageDoorDownCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    public void execute() {
        garageDoor.up();
    }
}
