package State.gumballstate;

/**
 * @author Tianlong Zhang
 * @time 2018/9/3 11:02
 * @project DesignPattern
 * @Version 1.0.0
 */
public class NoQuarterState implements State {

    GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine){
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter(){
        System.out.println("You inserted a quarter");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    public void ejectQuarter(){
        System.out.println("You haven't inserted a quarter");
    }

    public void turnCrank(){
        System.out.println("You turned, but there's no quarter");
    }

    public void dispense(){
        System.out.println("You need to pay first");
    }

    @Override
    public void refill() {

    }

    public String toString(){
        return "waiting for quarter";
    }
}
