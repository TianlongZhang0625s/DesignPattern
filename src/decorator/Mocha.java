package decorator;

/**
 * @author Tianlong Zhang
 * @time 2018/7/19 20:32
 * @project DesignPattern
 * @Version 1.0.0
 */
public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return 0.20 + beverage.cost();
    }
}
