package command.remote;

/**
 * @author Tianlong Zhang
 * @time 2018/8/1 23:12
 * @project DesignPattern
 * @Version 1.0.0
 */
public class CellingFanOffCommand implements Command {
    CellingFan ceilingFan;

    public CellingFanOffCommand(CellingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }
    public void execute() {
        ceilingFan.off();
    }
}
