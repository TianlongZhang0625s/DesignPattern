package strategy;

/**
 * @author Tianlong Zhang
 * @time 2018/7/16 22:15
 * @project DesignPattern
 * @Version 1.0.0
 */
public class FlyRocketPowered implements FlyBehavior {
    public void fly() {
        System.out.println("I'm flying with a rocket");
    }
}
