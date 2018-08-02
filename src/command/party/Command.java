package command.party;

/**
 * @author Tianlong Zhang
 * @time 2018/8/2 8:47
 * @project DesignPattern
 * @Version 1.0.0
 */
public interface Command {
    public void execute();
    public void undo();
}
