package singleton.subclass;

/**
 * @author Tianlong Zhang
 * @time 2018/8/1 15:09
 * @project DesignPattern
 * @Version 1.0.0
 */
public class CoolerSingleton extends Singleton {
    protected static Singleton uniqueInstance;
    private CoolerSingleton(){
        super();
    }
}
