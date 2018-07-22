package observer.weatherobserver;

import java.util.Observable;
import java.util.Observer;

/**
 * @author Tianlong Zhang
 * @time 2018/7/18 9:19
 * @project DesignPattern
 * @Version 1.0.0
 */
public class ForecastDisplay implements Observer,DisplayElement {
    private float currentPressure = 29.92f;
    private float lastPressure;

    public ForecastDisplay(Observable observable){
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData){
            this.lastPressure = currentPressure;
            currentPressure = ((WeatherData) o).getPressure();
            display();
        }
    }
    public void display(){
        System.out.print("Forecast: ");
        if (currentPressure > lastPressure) {
            System.out.println("Improving weather on the way!");
        } else if (currentPressure == lastPressure) {
            System.out.println("More of the same");
        } else if (currentPressure < lastPressure) {
            System.out.println("Watch out for cooler, rainy weather");
        }
    }
}
