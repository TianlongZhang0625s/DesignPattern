package State.gumballstatewinner;

/**
 * @author Tianlong Zhang
 * @time 2018/9/3 14:16
 * @project DesignPattern
 * @Version 1.0.0
 */
public interface State {

    public void insertQuarter();
    public void ejectQuarter();
    public void turnCrank();
    public void dispense();

    public void refill();
}
