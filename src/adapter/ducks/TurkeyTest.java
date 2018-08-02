package adapter.ducks;

import java.util.Iterator;

/**
 * @author Tianlong Zhang
 * @time 2018/8/2 20:52
 * @project DesignPattern
 * @Version 1.0.0
 */
public class TurkeyTest {
    public static void main(String[] args){
        MallardDuck duck = new MallardDuck();
        Turkey duckAdapter = new DuckAdapter(duck);

        for(int i = 0; i < 10; i++){
            System.out.println("The DuckAdapter says```");
            duckAdapter.gobble();
            duckAdapter.fly();
        }
    }
}
