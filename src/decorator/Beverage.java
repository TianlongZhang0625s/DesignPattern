package decorator;

/**
 * @author Tianlong Zhang
 * @time 2018/7/19 20:24
 * @project DesignPattern
 * @Version 1.0.0
 */
public abstract class Beverage  {
    public enum Size {TALL, GRANDE, VENTI};
    Size size = Size.TALL;
    String description = "Unknown Coffee";

    public String getDescription() {
        return description;
    }

    public void setSize(Size size){
        this.size = size;
    }

    public Size getSize(){
        return this.size;
    }

    public abstract double cost();
}
