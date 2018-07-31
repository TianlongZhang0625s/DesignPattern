package factory.pizzas;

/**
 * @author Tianlong Zhang
 * @time 2018/7/31 10:16
 * @project DesignPattern
 * @Version 1.0.0
 */
public class ViggiePizza extends Pizza {
    public ViggiePizza(){
        name = "Veggie Pizza";
        dough = "Crust";
        sauce = "Marinara sauce";
        toppings.add("Shredded mozzarella");
        toppings.add("Grated parmesan");
        toppings.add("Diced onion");
        toppings.add("Sliced mushrooms");
        toppings.add("Sliced red pepper");
        toppings.add("Sliced black olives");
    }
}
