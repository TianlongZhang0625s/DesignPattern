package command.remote;

/**
 * @author Tianlong Zhang
 * @time 2018/8/1 23:25
 * @project DesignPattern
 * @Version 1.0.0
 */
public class StereoOnWithCDCommand implements Command {
    Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo){
        this.stereo = stereo;
    }

    public void execute(){
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }
}
