package strategy;

/**
 * @author Tianlong Zhang
 * @time 2018/7/16 22:35
 * @project DesignPattern
 * @Version 1.0.0
 */
public class ReadHeadDuck extends Duck {
    public ReadHeadDuck(){
        setFlyBehavior(new FlyWithWings());
        setQuackBehavior(new Quack());
    }

    public void display() {
        System.out.println("I'm a real Red Headed duck");
    }
}
