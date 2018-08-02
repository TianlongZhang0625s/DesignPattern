package command.remote;

/**
 * @author Tianlong Zhang
 * @time 2018/8/1 23:07
 * @project DesignPattern
 * @Version 1.0.0
 */
public class GarageDoorUpCommand implements Command {
    GarageDoor garageDoor;

    public GarageDoorUpCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    public void execute() {
        garageDoor.up();
    }
}
