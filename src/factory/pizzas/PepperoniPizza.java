package factory.pizzas;

/**
 * @author Tianlong Zhang
 * @time 2018/7/31 10:15
 * @project DesignPattern
 * @Version 1.0.0
 */
public class PepperoniPizza extends Pizza {
    public PepperoniPizza(){
        name = "Pepperoni Pizza";
        dough = "Crust";
        sauce = "Marinara sauce";
        toppings.add("Sliced Pepperoni");
        toppings.add("Sliced Onion");
        toppings.add("Grated parmesan cheese");
    }
}
