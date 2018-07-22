package strategy;

/**
 * @author Tianlong Zhang
 * @time 2018/7/16 22:30
 * @project DesignPattern
 * @Version 1.0.0
 */
public class FackQuack implements QuackBehavior{
    public void quack(){
        System.out.println("Qwak");
    }
}
