package strategy;

/**
 * @author Tianlong Zhang
 * @time 2018/7/16 22:14
 * @project DesignPattern
 * @Version 1.0.0
 */
public class FlyNoWay implements  FlyBehavior{
    public void fly(){
        System.out.println("I can't fly");
    }
}
