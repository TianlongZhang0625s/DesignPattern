package factory.pizzafm;

/**
 * @author Tianlong Zhang
 * @time 2018/7/31 11:24
 * @project DesignPattern
 * @Version 1.0.0
 */
public class NYStyleVeggiePizza extends  Pizza {
    public NYStyleVeggiePizza() {
        name = "NY Style Veggie Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
        toppings.add("Garlic");
        toppings.add("Onion");
        toppings.add("Mushrooms");
        toppings.add("Red Pepper");
    }
}
