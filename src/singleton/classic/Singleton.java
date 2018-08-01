package singleton.classic;

import com.sun.org.apache.regexp.internal.RE;

/**
 * @author Tianlong Zhang
 * @time 2018/8/1 15:03
 * @project DesignPattern
 * @Version 1.0.0
 */
public class Singleton {
    private static Singleton uniqueInstance;

    private Singleton(){

    }

    public static Singleton getUniqueInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

    public String getDescription(){
        return "I'm a classic Singleton !";
    }
}
