package proxy.gumball;

/**
 * @author Tianlong Zhang
 * @time 2018/9/3 8:18
 * @project DesignPattern
 * @Version 1.0.0
 */
public class WinnerState implements State {

    private static final long serialVersionUID = 2l;
    transient GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine){
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter(){
        System.out.println("Please wait, we're already giving you a gumball");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Please wait, we're already giving you a gumball");
    }

    @Override
    public void turnCrank() {
        System.out.println("Turning again doesn't get another gumball !");
    }

    public void dispense(){
        System.out.println("YOU'RE A WINNER ! You get two gumballs for your quarter");
    }
}
