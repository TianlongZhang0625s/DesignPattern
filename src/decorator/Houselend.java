package decorator;

/**
 * @author Tianlong Zhang
 * @time 2018/7/19 20:29
 * @project DesignPattern
 * @Version 1.0.0
 */
public class Houselend extends Beverage {
    public Houselend(){
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
