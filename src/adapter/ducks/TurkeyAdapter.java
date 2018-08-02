package adapter.ducks;

/**
 * @author Tianlong Zhang
 * @time 2018/8/2 20:34
 * @project DesignPattern
 * @Version 1.0.0
 */
public class TurkeyAdapter implements Duck {
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey){
        this.turkey = turkey;
    }

    public void quack(){
        turkey.gobble();
    }

    public void fly(){
        for (int i = 0; i < 5; i++){
            turkey.fly();
        }
    }
}
