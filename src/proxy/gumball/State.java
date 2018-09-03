package proxy.gumball;

import java.io.Serializable;

/**
 * @author Tianlong Zhang
 * @time 2018/9/3 8:16
 * @project DesignPattern
 * @Version 1.0.0
 */
public interface State extends Serializable {
    public void insertQuarter();
    public void ejectQuarter();
    public void turnCrank();
    public void dispense();
}
