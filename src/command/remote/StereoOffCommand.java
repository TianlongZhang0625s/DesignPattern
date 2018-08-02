package command.remote;

/**
 * @author Tianlong Zhang
 * @time 2018/8/1 23:20
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
}
