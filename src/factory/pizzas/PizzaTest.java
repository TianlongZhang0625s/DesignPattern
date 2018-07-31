package factory.pizzas;

/**
 * @author Tianlong Zhang
 * @time 2018/7/31 10:29
 * @project DesignPattern
 * @Version 1.0.0
 */
public class PizzaTest {
    public static void main(String[] args){
        SimplePizzaFactory simplePizzaFactory = new SimplePizzaFactory();
        PizzaStore pizzaStore = new PizzaStore(simplePizzaFactory);

        Pizza pizza =  pizzaStore.orderPizza("cheese");
        System.out.println("we ordered a " + pizza.getName() );
        System.out.println(pizza);

        pizza = pizzaStore.orderPizza("viggie");
        System.out.println("we ordered a " + pizza.getName() );
        System.out.println(pizza);
    }
}
