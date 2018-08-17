package templatemethod.simplebarista;

/**
 * @author Tianlong Zhang
 * @time 2018/8/17 17:21
 * @project DesignPattern
 * @Version 1.0.0
 */
public class Barista {
    public static void main(String[] args){
        Tea tea = new Tea();
        Coffee coffee = new Coffee();

        System.out.println("Making tea...");
        tea.prepareRecipe();

        System.out.println("Making coffee...");
        coffee.prepareRecipe();
    }
}
