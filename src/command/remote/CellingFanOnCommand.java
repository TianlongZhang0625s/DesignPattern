package command.remote;

/**
 * @author Tianlong Zhang
 * @time 2018/8/1 23:13
 * @project DesignPattern
 * @Version 1.0.0
 */
public class CellingFanOnCommand implements Command {
    CellingFan ceilingFan;

    public CellingFanOnCommand(CellingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }
    public void execute() {
        ceilingFan.high();
    }
}
