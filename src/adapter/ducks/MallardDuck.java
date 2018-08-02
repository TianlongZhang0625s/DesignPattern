package adapter.ducks;

/**
 * @author Tianlong Zhang
 * @time 2018/8/2 20:29
 * @project DesignPattern
 * @Version 1.0.0
 */
public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
