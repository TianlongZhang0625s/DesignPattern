package adapter.hometheater;

/**
 * @author Tianlong Zhang
 * @time 2018/8/2 22:00
 * @project DesignPattern
 * @Version 1.0.0
 */
public class Tuner {
    String description;
    Amplifier amplifier;
    double frequency;

    public Tuner(String description,Amplifier amplifier){
        this.description = description;
    }

    public void on (){
        System.out.println(description + " on");
    }

    public void off(){
        System.out.println(description + "off");
    }

    public void setFrequency(double frequency) {
        System.out.println(description + " setting frequency to " + frequency);
        this.frequency = frequency;
    }

    public void setAm(){
        System.out.println(description + " settings AM mode");
    }

    public void setFm(){
        System.out.println(description + "settings FM mode");
    }

    public String toString(){
        return description;
    }
}
