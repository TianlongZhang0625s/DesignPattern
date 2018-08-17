package templatemethod.simplebarista;

/**
 * @author Tianlong Zhang
 * @time 2018/8/17 17:19
 * @project DesignPattern
 * @Version 1.0.0
 */
public class Tea {
    void prepareRecipe(){
        boilWater();
        steepTeaBag();
        pourInCup();
        addLemon();
    }

    public void boilWater(){
        System.out.println("Boiling water");
    }

    public void steepTeaBag(){
        System.out.println("Steeping the tea");
    }

    public void pourInCup(){
        System.out.println("Pouring into cup");
    }

    public void addLemon(){
        System.out.println("Adding Lemon");
    }
}
