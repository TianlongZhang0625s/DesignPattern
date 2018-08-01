package singleton;

/**
 * @author Tianlong Zhang
 * @time 2018/8/1 11:09
 * @project DesignPattern
 * @Version 1.0.0
 */
public class ChocolateController {
    public static void main(String[] args){

        Thread newsTr1 = new Thread(new Runnable() {
            @Override
            public void run() {
                ChocolateBoiler chocolateBoiler = ChocolateBoiler.getInstance();
                chocolateBoiler.fill();
                chocolateBoiler.boil();
                chocolateBoiler.drain();
            }
        });




        // will return the existing instance
        Thread newsTr = new Thread(new Runnable() {
            @Override
            public void run() {
                ChocolateBoiler chocolateBoiler1 = ChocolateBoiler.getInstance();
            }
        });

        newsTr.start();
        newsTr1.start();

    }
}
