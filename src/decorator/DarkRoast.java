package decorator;

/**
 * @author Tianlong Zhang
 * @time 2018/7/19 20:26
 * @project DesignPattern
 * @Version 1.0.0
 */
public class DarkRoast extends Beverage {
    public DarkRoast(){
        description = "DarkRoast Coffee";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
