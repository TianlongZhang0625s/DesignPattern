package command.remote;

/**
 * @author Tianlong Zhang
 * @time 2018/8/1 23:33
 * @project DesignPattern
 * @Version 1.0.0
 */
public class RmoteLoader {
    public static void main(String[] args){
        RemoteControl remoteControl = new RemoteControl();

        Light livingroomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen Room");
        CellingFan cellingFan = new CellingFan("Living Room");
        GarageDoor garageDoor = new GarageDoor("");
        Stereo stereo = new Stereo("Living Room");

        LightOnCommand livingRoomLightOn
                = new LightOnCommand(livingroomLight);
        LightOffCommand livingRoomLightOff
                = new LightOffCommand(livingroomLight);
        LightOnCommand kitchenRoomLightOn
                = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenRoomLightOff
                = new LightOffCommand(kitchenLight);

        CellingFanOnCommand celingFanOn =
                new CellingFanOnCommand(cellingFan);
        CellingFanOffCommand celingFanOff =
                new CellingFanOffCommand(cellingFan);

        GarageDoorUpCommand garageDoorUp =
                new GarageDoorUpCommand(garageDoor);
        GarageDoorDownCommand garageDoorDown =
                new GarageDoorDownCommand(garageDoor);

        StereoOnWithCDCommand stereoOnWithCD =
                new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOff =
                new StereoOffCommand(stereo);

        remoteControl.setCommand(0,livingRoomLightOn,livingRoomLightOff);
        remoteControl.setCommand(1,kitchenRoomLightOn,kitchenRoomLightOff);
        remoteControl.setCommand(2,celingFanOn,celingFanOff);
        remoteControl.setCommand(3,stereoOnWithCD,stereoOff);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);
    }
}
