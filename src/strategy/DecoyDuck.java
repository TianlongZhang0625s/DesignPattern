package strategy;

/**
 * @author Tianlong Zhang
 * @time 2018/7/16 22:27
 * @project DesignPattern
 * @Version 1.0.0
 */
public class DecoyDuck extends Duck {
    public DecoyDuck(){
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new MuteQuack());
    }

    public void display(){
        System.out.println("I'm a duck Decoy");
    }
}
