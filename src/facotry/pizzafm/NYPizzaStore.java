package facotry.pizzafm;

/**
 * @author Tianlong Zhang
 * @time 2018/7/31 11:15
 * @project DesignPattern
 * @Version 1.0.0
 */
public class NYPizzaStore extends PizzaStore {
    public Pizza createPizza(String item){
        if (item.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if (item.equals("veggie")) {
            return new NYStyleVeggiePizza();
        } else if (item.equals("clam")) {
            return new NYStyleClamPizza();
        } else if (item.equals("pepperoni")) {
            return new NYStylePepperoniPizza();
        } else return null;
    }
}
