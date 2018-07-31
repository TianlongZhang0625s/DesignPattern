package factory.pizzas;

/**
 * @author Tianlong Zhang
 * @time 2018/7/31 10:15
 * @project DesignPattern
 * @Version 1.0.0
 */
public class ClamPizza extends Pizza {
    public ClamPizza(){
        name = "Clam Pizza";
        dough = "Thin crust";
        sauce = "White garlic sauce";
        toppings.add("Clams");
        toppings.add("Grated parmesan cheese");
    }
}
