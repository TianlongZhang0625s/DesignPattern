package decorator;

/**
 * @author Tianlong Zhang
 * @time 2018/7/19 20:25
 * @project DesignPattern
 * @Version 1.0.0
 */
public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;
    public abstract String getDescription() ;
    public Size getSize() {
        return beverage.getSize();
    }
}
