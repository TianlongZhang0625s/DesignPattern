package command.party;

/**
 * @author Tianlong Zhang
 * @time 2018/8/2 9:09
 * @project DesignPattern
 * @Version 1.0.0
 */
public class HottubOnCommand implements Command {
    Hottub hottub;
    public HottubOnCommand(Hottub hottub){
        this.hottub = hottub;
    }

    public void execute(){
        hottub.setTemperature(103);
        hottub.circulate();
    }

    public void undo(){
        hottub.off();
    }
}
