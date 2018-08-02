package adapter.ducks;

/**
 * @author Tianlong Zhang
 * @time 2018/8/2 20:37
 * @project DesignPattern
 * @Version 1.0.0
 */
public class WildTurkey implements Turkey {
    public void gobble(){
        System.out.println("Gobble gobble");
    }

    public void fly(){
        System.out.println("I'm flying a short distance");
    }
}
