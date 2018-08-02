package command.simpleremote;

/**
 * @author Tianlong Zhang
 * @time 2018/8/1 22:13
 * @project DesignPattern
 * @Version 1.0.0
 */
public class RemoteControlTest {
    public static void main(String[] args){
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();
        GarageDoor garageDoor = new GarageDoor();

        //封装为命令对象,将对象传递给SimpleRemoteControl类，
        //在这个类里面使用接口的实现的对象调用成员方法（多态性质）
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        GarageDoorOpenCommand garageDoorOpenCommand =
                new GarageDoorOpenCommand(garageDoor);
        remote.setCommand(lightOnCommand);
        remote.buttonWasPressed();
        remote.setCommand(garageDoorOpenCommand);
        remote.buttonWasPressed();
    }
}
