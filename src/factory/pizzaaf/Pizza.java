package factory.pizzaaf;

/**
 * @author Tianlong Zhang
 * @time 2018/7/31 15:48
 * @project DesignPattern
 * @Version 1.0.0
 */
public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clam clam;

    abstract void prepare();
    void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    void setName(String name){
        this.name = name;
    }

    String getName(){
        return  name;
    }

    public String toString(){
        StringBuffer display = new StringBuffer();
        display.append("----" + name + "----\n");
        if(dough != null){
            display.append(dough);
            display.append("\n");
        }
        if(sauce != null){
            display.append(sauce);
            display.append("\n");
        }
        if(cheese != null){
            display.append(cheese);
            display.append("\n");
        }
        if(veggies != null){
            for (int i = 0; i < veggies.length; i++){
                display.append(veggies[i]);
                if(i < veggies.length - 1){
                    display.append(",");
                }
            }
            display.append("\n");
        }
        if(clam != null){
            display.append(clam);
            display.append("\n");
        }

        if (pepperoni != null){
            display.append(pepperoni);
            display.append("\n");
        }
        return display.toString();
    }
}
