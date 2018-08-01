package singleton.subclass;

/**
 * @author Tianlong Zhang
 * @time 2018/8/1 15:08
 * @project DesignPattern
 * @Version 1.0.0
 */
public class Singleton {
    protected static Singleton uniqueInstance;

    protected Singleton(){

    }

    public static synchronized Singleton getUniqueInstance(){
        if(uniqueInstance == null){
            uniqueInstance =  new Singleton();
        }

        return uniqueInstance;
    }


}
