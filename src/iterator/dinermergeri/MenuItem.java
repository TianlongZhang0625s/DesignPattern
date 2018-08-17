package iterator.dinermergeri;

/**
 * @author Tianlong Zhang
 * @time 2018/8/17 16:14
 * @project DesignPattern
 * @Version 1.0.0
 */
public class MenuItem {
    String name;
    String description;
    boolean vegetarian;
    double price;

    public MenuItem(String name,String description,boolean vegetarian,double price){
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }
}
