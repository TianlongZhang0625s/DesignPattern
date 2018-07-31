package factory.pizzas;

/**
 * @author Tianlong Zhang
 * @time 2018/7/31 10:15
 * @project DesignPattern
 * @Version 1.0.0
 */
public class CheesePizza extends Pizza {
    public CheesePizza(){
        name = "Cheese Pizza";
        dough = "Regular Crust";
        sauce = "Marinara Pizza Sauce";
        toppings.add("Fresh Mozzarella");
        toppings.add("Parmesan");
    }
}
