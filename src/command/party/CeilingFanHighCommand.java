package command.party;

/**
 * @author Tianlong Zhang
 * @time 2018/8/2 8:55
 * @project DesignPattern
 * @Version 1.0.0
 */
public class CeilingFanHighCommand implements Command {
    CeilingFan ceilingFan;
    int prevSpeed;

    public CeilingFanHighCommand(CeilingFan ceilingFan){
        this.ceilingFan = ceilingFan;
    }

    public void execute(){
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.high();
    }

    @Override
    public void undo() {
        switch (prevSpeed){
            case CeilingFan.HIGH : ceilingFan.high();;break;
            case CeilingFan.MEDIUM: ceilingFan.medium();break;
            case CeilingFan.LOW: ceilingFan.low();break;
            default: ceilingFan.off(); break;
        }
    }
}
