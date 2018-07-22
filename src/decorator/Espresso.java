package decorator;

/**
 * @author Tianlong Zhang
 * @time 2018/7/19 20:31
 * @project DesignPattern
 * @Version 1.0.0
 */
public class Espresso extends Beverage {
    public Espresso(){
        description = "Esspresso Coffee";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
