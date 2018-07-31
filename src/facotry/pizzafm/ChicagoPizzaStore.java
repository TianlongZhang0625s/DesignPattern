package facotry.pizzafm;

/**
 * @author Tianlong Zhang
 * @time 2018/7/31 11:17
 * @project DesignPattern
 * @Version 1.0.0
 */
public class ChicagoPizzaStore extends PizzaStore {
    public 	Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else if (item.equals("veggie")) {
            return new ChicagoStyleVeggiePizza();
        } else if (item.equals("clam")) {
            return new ChicagoStyleClamPizza();
        } else if (item.equals("pepperoni")) {
            return new ChicagoStylePepperoniPizza();
        } else return null;
    }
}
