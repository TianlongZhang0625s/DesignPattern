package factory.pizzaaf;

/**
 * @author Tianlong Zhang
 * @time 2018/7/31 16:47
 * @project DesignPattern
 * @Version 1.0.0
 */
public class VeggiesPizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public VeggiesPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        veggies = ingredientFactory.createViggies();
    }
}
