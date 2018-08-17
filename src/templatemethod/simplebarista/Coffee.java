package templatemethod.simplebarista;

/**
 * @author Tianlong Zhang
 * @time 2018/8/17 17:17
 * @project DesignPattern
 * @Version 1.0.0
 */
public class Coffee {
    void prepareRecipe(){
        boilWater();
        brewCoffeeGrinds();
        pourInCup();
        addSugarMilk();
    }

    public void boilWater(){
        System.out.println("Boiling water");
    }

    public void brewCoffeeGrinds(){
        System.out.println("Dripping Coffee through filter");
    }

    public void pourInCup(){
        System.out.println("Pouring into cup");
    }

    public void addSugarMilk(){
        System.out.println("Adding Sugar and Milk");
    }
}
