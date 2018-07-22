package strategy;

/**
 * @author Tianlong Zhang
 * @time 2018/7/16 22:33
 * @project DesignPattern
 * @Version 1.0.0
 */
public class ModelDuck extends Duck {
    public ModelDuck(){
        setFlyBehavior( new FlyNoWay());
        setQuackBehavior( new Quack());
    }

    public void display(){
        System.out.println("I'm a model duck");
    }
}
