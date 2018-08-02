package command.party;

/**
 * @author Tianlong Zhang
 * @time 2018/8/2 9:38
 * @project DesignPattern
 * @Version 1.0.0
 */
public class TVOnCommand implements Command {
    TV tv;

    public TVOnCommand(TV tv){
        this.tv = tv;
    }

    public void execute(){
        tv.on();
        tv.setInputChannel();
    }

    @Override
    public void undo() {
        tv.off();
    }
}
