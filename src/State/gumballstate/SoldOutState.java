package State.gumballstate;

/**
 * @author Tianlong Zhang
 * @time 2018/9/3 10:58
 * @project DesignPattern
 * @Version 1.0.0
 */
public class SoldOutState implements State {

    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine){
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter(){
        System.out.println("You can't insert a quarter, the machine is sold out");
    }

    public void ejectQuarter(){
        System.out.println("You can't eject, you haven't inserted a quarter");
    }

    public void turnCrank(){
        System.out.println("You turned, but there are no gumballs");
    }

    public void dispense(){
        System.out.println("No gumball dispensed");
    }

    public void refill(){
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    public String toString(){
        return "sold out";
    }
}
