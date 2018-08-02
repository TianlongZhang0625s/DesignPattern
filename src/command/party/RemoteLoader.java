package command.party;

import com.sun.org.apache.regexp.internal.RE;

/**
 * @author Tianlong Zhang
 * @time 2018/8/2 9:44
 * @project DesignPattern
 * @Version 1.0.0
 */
public class RemoteLoader {
    public static void main(String[] args){

        RemoteControl remoteControl = new RemoteControl();
        Light light = new Light("Living Room");
        TV tv = new TV("Living Room");
        Stereo stereo = new Stereo("Living Room");
        Hottub hottub = new Hottub();

        LightOnCommand lightOn = new LightOnCommand(light);
        StereoOnCommand stereoOn = new StereoOnCommand(stereo);
        TVOnCommand trOn = new TVOnCommand(tv);
        HottubOnCommand hottubOn = new HottubOnCommand(hottub);

        LightOffCommand lightOff = new LightOffCommand(light);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);
        TVOffCommand tvOff = new TVOffCommand(tv);
        HottubOffCommand hottubOff = new HottubOffCommand(hottub);

        Command[] partyOn = {lightOn,stereoOn,trOn,hottubOn};
        Command[] partyOff = {lightOff,stereoOff,tvOff,hottubOff};

        MacroCommand partyOnMarcro = new MacroCommand(partyOn);
        MacroCommand partyOffMarcro = new MacroCommand(partyOff);

        remoteControl.setCommand(0,partyOnMarcro,partyOffMarcro);

        System.out.println(remoteControl);
        System.out.println("-----Pushing Macro On-----");
        remoteControl.onButtonWasPushed(0);
        System.out.println("-----Pushing Macro Off-----");
        remoteControl.offButtonWasPushed(0);
    }

}
