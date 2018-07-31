package factory.pizzas;

import java.util.ArrayList;

/**
 * @author Tianlong Zhang
 * @time 2018/7/31 10:10
 * @project DesignPattern
 * @Version 1.0.0
 */
public  abstract class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList<String> toppings = new ArrayList<String>();

    public String getName(){
        return name;
    }

    public  void prepare(){
        System.out.println("Preparing " + name);
    }

    public void bake(){
        System.out.println("Baking " + name);
    }

    public void cut(){
        System.out.println("Cutting " + name);

    }

    public void box(){
        System.out.println("Boxing " + name);
    }

    public String toString(){
        StringBuffer display = new StringBuffer();
        display.append("-----" + name + "-----\n");
        display.append(dough + "\n");
        display.append(sauce + "\n");
        for(String topping : toppings){
            display.append(topping + "\n");
        }

        return  display.toString();
    }
}
