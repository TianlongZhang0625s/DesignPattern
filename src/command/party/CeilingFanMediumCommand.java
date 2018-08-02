package command.party;

/**
 * @author Tianlong Zhang
 * @time 2018/8/2 8:59
 * @project DesignPattern
 * @Version 1.0.0
 */
public class CeilingFanMediumCommand implements Command {
    CeilingFan ceilingFan;
    int prevSpeed;

    public CeilingFanMediumCommand(CeilingFan ceilingFan){
        this.ceilingFan = ceilingFan;
    }

    public void execute(){
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.medium();
    }

    public void undo(){
        switch (prevSpeed){
            case CeilingFan.HIGH : ceilingFan.high();break;
            case CeilingFan.MEDIUM:ceilingFan.medium();break;
            case CeilingFan.LOW: ceilingFan.low();break;
            default:ceilingFan.off();break;
        }
    }
}
