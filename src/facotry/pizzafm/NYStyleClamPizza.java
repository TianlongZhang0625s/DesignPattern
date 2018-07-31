package facotry.pizzafm;

/**
 * @author Tianlong Zhang
 * @time 2018/7/31 11:23
 * @project DesignPattern
 * @Version 1.0.0
 */
public class NYStyleClamPizza extends Pizza {
    public NYStyleClamPizza() {
        name = "NY Style Clam Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
        toppings.add("Fresh Clams from Long Island Sound");
    }
}
