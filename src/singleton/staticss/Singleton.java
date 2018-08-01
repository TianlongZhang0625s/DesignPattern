package singleton.staticss;

/**
 * @author Tianlong Zhang
 * @time 2018/8/1 14:56
 * @project DesignPattern
 * @Version 1.0.0
 */
public class Singleton {
    private static Singleton uniqueInstance = new Singleton();

    private Singleton(){}

    public static Singleton getUniqueInstance(){
        return  uniqueInstance;
    }

    public String getDescription(){
        return "I'm statically initialized Singleton ~!";
    }

}
