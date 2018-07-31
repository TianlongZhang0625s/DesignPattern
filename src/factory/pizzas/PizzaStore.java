package factory.pizzas;

/**
 * @author Tianlong Zhang
 * @time 2018/7/31 10:16
 * @project DesignPattern
 * @Version 1.0.0
 */
public class PizzaStore {
    SimplePizzaFactory simplePizzaFactory;
    public PizzaStore(SimplePizzaFactory simplePizzaFactory){
        this.simplePizzaFactory = simplePizzaFactory;
    }

    public Pizza orderPizza(String type){
        Pizza pizza = null;
        pizza = simplePizzaFactory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
