package State.gumballstatewinner;

import java.util.Random;

/**
 * @author Tianlong Zhang
 * @time 2018/9/3 14:19
 * @project DesignPattern
 * @Version 1.0.0
 */
public class HasQuarterState implements State {
    Random randomWinner = new Random(System.currentTimeMillis());
    GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("You can't insert another quarter");
    }

    public void ejectQuarter() {
        System.out.println("Quarter returned");

        /*修改状态，当退还25美分之后，状态重新变为没有投入25美分的状态*/
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    public void turnCrank() {
        System.out.println("You turned...");
        int winner = randomWinner.nextInt(10);

        if ((winner == 0) && (gumballMachine.getCount() > 1)) {

            /*当winner值为0的时候就会完成竞猜成功的情形*/
            gumballMachine.setState(gumballMachine.getWinnerState());
        } else {
            gumballMachine.setState(gumballMachine.getSoldState());
        }
    }

    public void dispense() {
        System.out.println("No gumball dispensed");
    }

    public void refill() { }

    public String toString() {
        return "waiting for turn of crank";
    }
}
