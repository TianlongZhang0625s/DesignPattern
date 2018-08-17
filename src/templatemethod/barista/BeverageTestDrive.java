package templatemethod.barista;

/**
 * @author Tianlong Zhang
 * @time 2018/8/17 17:28
 * @project DesignPattern
 * @Version 1.0.0
 */
public class BeverageTestDrive {
    public static void main(String[] args){

        Tea tea = new Tea();
        Coffee coffee = new Coffee();
        System.out.println("\nMaking tea...");
        tea.prepareRecipe();

        System.out.println("\nMaking coffee...");
        coffee.prepareRecipe();
    }
}
