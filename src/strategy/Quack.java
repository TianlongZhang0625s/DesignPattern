package strategy;

/**
 * @author Tianlong Zhang
 * @time 2018/7/16 22:17
 * @project DesignPattern
 * @Version 1.0.0
 */
public class Quack implements QuackBehavior {
    public void quack() {
        System.out.println("Quack");
    }
}
