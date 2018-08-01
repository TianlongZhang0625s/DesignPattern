package singleton;

/**
 * @author Tianlong Zhang
 * @time 2018/8/1 11:03
 * @project DesignPattern
 * @Version 1.0.0
 */
public class ChocolateBoiler {

    private boolean empty;
    private boolean boiled;
/*    private static ChocolateBoiler uniqueInstance;*/
    //修改1
    private static volatile ChocolateBoiler uniqueInstance;

    private ChocolateBoiler(){
        empty = true;
        boiled = false;
    }

    /**
     * 修改多线程的影响，1可以使得getInstance方法为一个synchronized同步方法
     * 但是这样会应I型那个性能，所以可以考虑双重检查锁，也就是采用
     * 同步代码块和volatile 进行
     * @return
     */
    public static  ChocolateBoiler getInstance(){
        if(uniqueInstance == null) {
            synchronized (ChocolateBoiler.class) {
                if(uniqueInstance == null){
                    uniqueInstance = new ChocolateBoiler();
                    System.out.println("Creating unique instance of Chocolate Boiler");
                }
            }
        }
        System.out.println("Returning instance of Chocolate Boiler");
        return uniqueInstance;
    }

    public void fill(){
        if(isEmpty()){
            empty = false;
            boiled = false;
        }
    }

    public void drain(){
        if(!isEmpty() && isBoiled()){
            empty = true;
        }
    }
    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            // bring the contents to a boil
            boiled = true;
        }
    }
    private boolean isBoiled() {
        return boiled;
    }

    private boolean isEmpty() {
        return empty;
    }
}
