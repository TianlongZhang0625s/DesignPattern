package singleton.staticss;

/**
 * @author Tianlong Zhang
 * @time 2018/8/1 14:58
 * @project DesignPattern
 * @Version 1.0.0
 */
public class Singletontest {
    public static void main(String[] args){

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton singleton = Singleton.getUniqueInstance();
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
