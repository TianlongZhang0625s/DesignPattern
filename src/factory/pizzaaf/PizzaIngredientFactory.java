package factory.pizzaaf;

/**
 * @author Tianlong Zhang
 * @time 2018/7/31 16:17
 * @project DesignPattern
 * @Version 1.0.0
 */
public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createViggies();
    public Pepperoni createPepperoni();
    public Clam createClam();
}
