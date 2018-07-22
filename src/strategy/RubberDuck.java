package strategy;

/**
 * @author Tianlong Zhang
 * @time 2018/7/16 22:36
 * @project DesignPattern
 * @Version 1.0.0
 */
public class RubberDuck extends Duck {
    public RubberDuck(){
        setFlyBehavior( new FlyNoWay());
        setQuackBehavior(new Squack());
    }

    public void display(){
        System.out.println("I'm a rubber duckie");
    }
}
