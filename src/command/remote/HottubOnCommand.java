package command.remote;

/**
 * @author Tianlong Zhang
 * @time 2018/8/1 23:00
 * @project DesignPattern
 * @Version 1.0.0
 */
public class HottubOnCommand implements Command {
    Hottub hottub;

    public HottubOnCommand(Hottub hottub){
        this.hottub = hottub;
    }

    public void execute(){
        hottub.on();
        hottub.heat();
        hottub.bubblesOn();
    }
}
