package factory.pizzaaf;

/**
 * @author Tianlong Zhang
 * @time 2018/7/31 16:39
 * @project DesignPattern
 * @Version 1.0.0
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Clam createClam() {
        return new FreshClam();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Veggies[] createViggies() {
        Veggies veggies[] = {new Garlic(),new Onion(),new Mushroom(),new RedPepper()};
        return veggies;
    }
}
