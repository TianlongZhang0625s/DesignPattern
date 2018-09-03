package proxy.gumball;

import java.util.Random;

/**
 * @author Tianlong Zhang
 * @time 2018/9/3 8:42
 * @project DesignPattern
 * @Version 1.0.0
 */
public class HasQuarterState implements State {
    private static final long serialVersionUID = 2L;
    Random randomWinner = new Random(System.currentTimeMillis());
    transient GumballMachine gumballMachine;

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
        System.out.println("You turned```");
        int winner = randomWinner.nextInt(10);
        if(winner == 0){
            gumballMachine.setState(gumballMachine.getWinnerState());
        }else{
            gumballMachine.setState(gumballMachine.getSoldState());
        }
    }

    public void dispense(){
        System.out.println("No gumball dispensed");
    }

    public String toString(){
        return "waiting for turn of crank";
    }

}
