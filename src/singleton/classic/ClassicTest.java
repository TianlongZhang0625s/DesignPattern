package singleton.classic;

import singleton.staticss.Singleton;

/**
 * @author Tianlong Zhang
 * @time 2018/8/1 15:05
 * @project DesignPattern
 * @Version 1.0.0
 */
public class ClassicTest {
    public static void main(String[] args){
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                singleton.staticss.Singleton singleton = Singleton.getUniqueInstance();
                System.out.println(singleton.hashCode());
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton singleton2 = Singleton.getUniqueInstance();
                System.out.println(singleton2.hashCode());
            }
        });

        thread1.start();
        thread2.start();
    }
}
