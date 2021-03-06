package factory.pizzaaf;

/**
 * @author Tianlong Zhang
 * @time 2018/7/31 15:48
 * @project DesignPattern
 * @Version 1.0.0
 */
public abstract class PizzaStore {
    protected abstract Pizza createPizza(String item);

    public Pizza orderPizza(String type){
        Pizza pizza = createPizza(type);
        System.out.println("-----Making a " + pizza.getName() + "-----");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
