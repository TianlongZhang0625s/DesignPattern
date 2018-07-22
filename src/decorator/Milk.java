package decorator;

/**
 * @author Tianlong Zhang
 * @time 2018/7/19 20:33
 * @project DesignPattern
 * @Version 1.0.0
 */
public class Milk extends CondimentDecorator {
    Beverage beverage;

    public Milk(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    @Override
    public double cost() {
        return 0.10 + beverage.cost();
    }
}
