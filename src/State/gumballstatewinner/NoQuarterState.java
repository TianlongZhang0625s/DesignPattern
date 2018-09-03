package State.gumballstatewinner;

/**
 * @author Tianlong Zhang
 * @time 2018/9/3 14:19
 * @project DesignPattern
 * @Version 1.0.0
 */
public class NoQuarterState implements State {
    GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("You inserted a quarter");

        /*插入25美分后，状态变为插入25美分状态*/
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    public void ejectQuarter() {
        System.out.println("You haven't inserted a quarter");
    }

    public void turnCrank() {
        System.out.println("You turned, but there's no quarter");
    }

    public void dispense() {
        System.out.println("You need to pay first");
    }

    public void refill() { }

    public String toString() {
        return "waiting for quarter";
    }
}
