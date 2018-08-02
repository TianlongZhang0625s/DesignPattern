package command.remote;

/**
 * @author Tianlong Zhang
 * @time 2018/8/1 22:59
 * @project DesignPattern
 * @Version 1.0.0
 */
public class HottubOffCommand implements Command {
    Hottub hottub;

    public HottubOffCommand(Hottub hottub){
        this.hottub = hottub;
    }

    public void execute(){
        hottub.cool();
        hottub.off();
    }
}
