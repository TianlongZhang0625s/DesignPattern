package command.simpleremote;

/**
 * @author Tianlong Zhang
 * @time 2018/8/1 22:11
 * @project DesignPattern
 * @Version 1.0.0
 */
public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl(){

    }

    public void setCommand(Command command){
        slot = command;
    }

    public void buttonWasPressed(){
        slot.execute();
    }
}
