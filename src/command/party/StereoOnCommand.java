package command.party;

/**
 * @author Tianlong Zhang
 * @time 2018/8/2 9:24
 * @project DesignPattern
 * @Version 1.0.0
 */
public class StereoOnCommand implements Command {
    Stereo stereo;

    public StereoOnCommand(Stereo stereo){
        this.stereo = stereo;
    }

    public void execute(){
        stereo.on();
    }

    public void undo(){
        stereo.off();
    }
}
