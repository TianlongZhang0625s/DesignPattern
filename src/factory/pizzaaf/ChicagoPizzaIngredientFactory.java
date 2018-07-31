package factory.pizzaaf;

/**
 * @author Tianlong Zhang
 * @time 2018/7/31 16:32
 * @project DesignPattern
 * @Version 1.0.0
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

    public Dough createDough(){
        return new ThickCrustDough();
    }

    public Sauce createSauce(){
        return new PlumTomatoSuace();
    }

    public Cheese createCheese(){
        return new MozzarellaCheese();
    }

    public Veggies[] createViggies(){
        Veggies veggies[] = {new BlackOlives(),
        new Spinnach(),
        new Eggplant()};
        return veggies;
    }

    public Pepperoni createPepperoni(){
        return new SlicedPepperoni();
    }

    public Clam createClam(){
        return new FrozenClam();
    }
}
