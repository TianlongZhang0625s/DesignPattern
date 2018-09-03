package proxy.gumball;

/**
 * @author Tianlong Zhang
 * @time 2018/9/3 8:32
 * @project DesignPattern
 * @Version 1.0.0
 */
public class SoldOutState implements State {
    private static final long serialVersionUID = 2L;
    transient GumballMachine gumballMachine;

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

    public String toString(){
        return "Sold Out";
    }

}
