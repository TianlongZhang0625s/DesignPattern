package templatemethod.barista;

/**
 * @author Tianlong Zhang
 * @time 2018/8/17 17:29
 * @project DesignPattern
 * @Version 1.0.0
 */
public abstract class CaffineBeverageWithHook {
    final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        if(customeWantsCondiments()){
            addCondiments();
        }
    }

    abstract void brew();
    abstract void addCondiments();
    void boilWater(){
        System.out.println("Boiling water");
    }
    void pourInCup(){
        System.out.println("Pouring into cup");
    }

    boolean customeWantsCondiments(){
        return true;
    }
}
