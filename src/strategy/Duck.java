package strategy;

/**
 * @author Tianlong Zhang
 * @time 2018/7/16 22:19
 * @project DesignPattern
 * @Version 1.0.0
 */
public abstract class Duck {
    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    abstract void display();
    public Duck(){

    }

    public void setFlyBehavior(FlyBehavior flyBehavior){
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior (QuackBehavior quackBehavior){
        this.quackBehavior = quackBehavior;
    }

    public void performFly(){
        flyBehavior.fly();
    }

    public void performQuack(){
        quackBehavior.quack();
    }

    public void swim(){
        System.out.println("All ducks float, even decoys!");
    }

}
