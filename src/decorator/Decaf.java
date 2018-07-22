package decorator;

/**
 * @author Tianlong Zhang
 * @time 2018/7/19 20:28
 * @project DesignPattern
 * @Version 1.0.0
 */
public class Decaf extends Beverage {

    public Decaf(){
        description = "Decaf Coffee";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
