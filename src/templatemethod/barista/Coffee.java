package templatemethod.barista;

/**
 * @author Tianlong Zhang
 * @time 2018/8/17 17:26
 * @project DesignPattern
 * @Version 1.0.0
 */
public class Coffee extends CaffeineBeverage {
    public void brew(){
        System.out.println("Dripping Coffee through filter");
    }

    public void addCondiments(){
        System.out.println("Adding Sugar and Milk");
    }
}
