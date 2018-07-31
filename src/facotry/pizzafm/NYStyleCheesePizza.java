package facotry.pizzafm;

/**
 * @author Tianlong Zhang
 * @time 2018/7/31 11:23
 * @project DesignPattern
 * @Version 1.0.0
 */
public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza() {
        name = "NY Style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
    }
}
