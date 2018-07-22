package decorator;

/**
 * @author Tianlong Zhang
 * @time 2018/7/19 20:36
 * @project DesignPattern
 * @Version 1.0.0
 */
public class Whip extends CondimentDecorator {
    Beverage beverage;
    public Whip(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return 0.10 + beverage.cost();
    }
}
