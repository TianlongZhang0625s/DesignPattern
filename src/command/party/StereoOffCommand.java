package command.party;

/**
 * @author Tianlong Zhang
 * @time 2018/8/2 9:22
 * @project DesignPattern
 * @Version 1.0.0
 */
public class StereoOffCommand implements Command {
    Stereo stereo;

    public StereoOffCommand(Stereo stereo){
        this.stereo = stereo;
    }

    public void execute(){
        stereo.off();
    }

    public void undo(){
        stereo.on();
    }
}
