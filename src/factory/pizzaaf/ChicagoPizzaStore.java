package factory.pizzaaf;

/**
 * @author Tianlong Zhang
 * @time 2018/7/31 16:28
 * @project DesignPattern
 * @Version 1.0.0
 */
public class ChicagoPizzaStore extends PizzaStore {
    protected  Pizza createPizza(String item){
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();
        if (item.equals("cheese")){
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Chicago style Cheese Pizza");
        } else if (item.equals("veggie")) {

            pizza = new VeggiesPizza(ingredientFactory);
            pizza.setName("Chicago Style Veggie Pizza");

        } else if (item.equals("clam")) {

            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("Chicago Style Clam Pizza");

        } else if (item.equals("pepperoni")) {

            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("Chicago Style Pepperoni Pizza");

        }
        return pizza;

    }
}
