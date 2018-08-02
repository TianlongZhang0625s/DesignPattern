package command.party;

/**
 * @author Tianlong Zhang
 * @time 2018/8/2 9:07
 * @project DesignPattern
 * @Version 1.0.0
 */
public class HottubOffCommand implements  Command {
    Hottub hottub;

    public HottubOffCommand(Hottub hottub){
        this.hottub = hottub;
    }

    public void execute(){
        hottub.setTemperature(98);
        hottub.off();
    }

    public void undo(){
        hottub.on();
    }
}
