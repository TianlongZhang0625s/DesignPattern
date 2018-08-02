package adapter.hometheater;

/**
 * @author Tianlong Zhang
 * @time 2018/8/2 22:26
 * @project DesignPattern
 * @Version 1.0.0
 */
public class Screen {
    String description;

    public Screen(String description){
        this.description = description;
    }

    public void up(){
        System.out.println(description + " going up ");
    }

    public void down(){
        System.out.println(description + " going down ");
    }

    public String toString(){
        return description;
    }
}
