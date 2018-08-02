package command.party;

/**
 * @author Tianlong Zhang
 * @time 2018/8/2 9:14
 * @project DesignPattern
 * @Version 1.0.0
 */
public class MacroCommand implements Command {
    Command[] commands;

    public MacroCommand(Command[] commands){
        this.commands = commands;
    }

    public void execute(){
        for(int i = 0; i < commands.length; i++){
            commands[i].execute();
        }
    }

    /**
     * NOTE: these commands have to be done backwards to ensure
     * proper undo functionality
     */

    public void undo(){
        for(int i = 0; i < commands.length; i++){
            commands[i].undo();
        }
    }
}
