package decorator;

/**
 * @author Tianlong Zhang
 * @time 2018/7/19 20:38
 * @project DesignPattern
 * @Version 1.0.0
 */
public class StarbuzzCoffee {
    public static void main(String[] args){
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription()
                + " $" + String.format("%.2f", beverage.cost()));

        Beverage beverage1 = new Houselend();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);
        beverage1 = new Mocha(beverage1);
        System.out.println(beverage1.getDescription()
                + " $" + String.format("%.2f", beverage1.cost()));

        Beverage beverage2 = new Houselend();
        beverage2 = new Soy(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription()
                + " $" + String.format("%.2f", beverage2.cost()));
    }
}
