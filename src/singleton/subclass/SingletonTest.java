package singleton.subclass;

/**
 * @author Tianlong Zhang
 * @time 2018/8/1 15:11
 * @project DesignPattern
 * @Version 1.0.0
 */
public class SingletonTest {
    public static void main(String[] args){
        Singleton foo = CoolerSingleton.getUniqueInstance();
        Singleton bar = HotterSingleton.getUniqueInstance();
        System.out.println(foo);
        System.out.println(bar);
    }
}
