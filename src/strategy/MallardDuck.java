package strategy;

/**
 * @author Tianlong Zhang
 * @time 2018/7/16 22:31
 * @project DesignPattern
 * @Version 1.0.0
 */
public class MallardDuck extends Duck {
    public MallardDuck(){
        setFlyBehavior(new FlyWithWings());
        setQuackBehavior(new Quack());
    }

    public void display(){
        System.out.println("I'm a real Mallard duck");
    }
}
