package State.gumballstate;

/**
 * @author Tianlong Zhang
 * @time 2018/9/3 11:06
 * @project DesignPattern
 * @Version 1.0.0
 */
public class HasQuarterState implements State {

    GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine){
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter(){
        System.out.println("You can't insert another quarter");
    }

    public void ejectQuarter(){
        System.out.println("Quarter returned");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    public void turnCrank(){
        System.out.println("You turned...");
        gumballMachine.setState(gumballMachine.getSoldState());
    }

    public void dispense(){
        System.out.println("No gumball dispensed");
    }

    public void refill(){

    }

    public String toString(){
        return "waiting for turn of crank";
    }
}
