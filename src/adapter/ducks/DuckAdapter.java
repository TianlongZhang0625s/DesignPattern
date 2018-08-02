package adapter.ducks;

import java.util.Random;

/**
 * @author Tianlong Zhang
 * @time 2018/8/2 20:30
 * @project DesignPattern
 * @Version 1.0.0
 */
public class DuckAdapter implements  Turkey{
    Duck duck;
    Random random;

    public DuckAdapter(Duck duck){
        this.duck = duck;
        random = new Random();
    }

    public void gobble(){
        duck.quack();
    }

    public void fly(){
        if(random.nextInt(5) == 0){
            duck.fly();
        }
    }
}
