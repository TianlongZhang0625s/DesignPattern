package command.party;

/**
 * @author Tianlong Zhang
 * @time 2018/8/2 9:39
 * @project DesignPattern
 * @Version 1.0.0
 */
public class TVOffCommand implements Command {
    TV tv;
    public TVOffCommand(TV tv){
        this.tv = tv;
    }

    public void execute(){
        tv.off();
    }

    public void undo(){
        tv.on();
    }
}
