package factory.pizzas;

/**
 * @author Tianlong Zhang
 * @time 2018/7/31 10:10
 * @project DesignPattern
 * @Version 1.0.0
 */
public class SimplePizzaFactory {
    public Pizza createPizza(String type){
        Pizza pizza = null;

        if(type.equals("cheese")){
            pizza = new CheesePizza();
        }
        if(type.equals("clam")){
            pizza = new ClamPizza();
        }
        if(type.equals("pepperoni")){
            pizza = new PepperoniPizza();
        }
        if(type.equals("viggie")){
            pizza = new ViggiePizza();
        }

        return pizza;
    }
}
