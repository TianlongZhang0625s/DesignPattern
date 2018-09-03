package State.gumballstate;

/**
 * @author Tianlong Zhang
 * @time 2018/9/3 11:19
 * @project DesignPattern
 * @Version 1.0.0
 */
public class GumballMachineTestDrive {

    public static void main(String[] args){
        GumballMachine gumballMachine = new GumballMachine(2);

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        gumballMachine.refill(5);
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);
    }
}
